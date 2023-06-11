package com.dock.controller;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.interfaces.DecodedJWT;
import com.dock.dto.UserDto;
import com.dock.entity.Result;
import com.dock.entity.User;
import com.dock.service.UserService;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import java.util.Date;
import java.util.List;

/**
 * @author:XuJianYuan
 * @date:2023/6/6 11:41
 * @version:1.0
 */
@Controller
@CrossOrigin
@ResponseBody
public class UserController {
    @Resource
    private UserService userService;
    @RequestMapping(value = "userList")
    public Result userList(Integer pageNo, Integer pageSize, String userName, String userTel, @DateTimeFormat(pattern = "yyyy-MM-dd")Date start,@DateTimeFormat(pattern = "yyyy-MM-dd") Date end){
        return new Result(userService.showUserPage(pageNo,pageSize,userName,userTel,start,end));
    }
    @RequestMapping(value = "userAdd")
    public Result userAdd(@RequestBody UserDto user){
        userService.addUser(user);
        return new Result();
    }
    @RequestMapping(value = "userDelete")
    public Result userDelete(@RequestBody List<Integer> userIdList){
        userService.deleteUser(userIdList);
        return new Result();
    }
    @RequestMapping(value = "userUpdate")
    public Result userUpdate(@RequestBody UserDto userDto){
        userService.updateUser(userDto);
        return new Result();
    }
    @RequestMapping(value = "login")
    public Result login(String token, HttpServletRequest request){
        Result result = new Result();
//        验证token
        DecodedJWT jwt = JWT.decode(token);
        String email = jwt.getClaim("iss").asString();
        User user = userService.getUserByEmail(email);
        if(user == null){
            result.setMsg("error");
            result.setCode(-1);
            return result;
        }else{
            request.setAttribute("userName",user.getUserName());
            System.out.println(request.getAttribute("userName"));
            return new Result(user);
        }

    }
    @RequestMapping(value = "logout")
    public Result logout(){
        return new Result();
    }
    @RequestMapping(value = "token")
    public Result token(String userEmail,String password){
        Result result = new Result();
        User user = userService.showUser(userEmail, password);
        if(user==null ||user.getIsDelete().equals(0)){
            result.setCode(-1);
            result.setMsg("error");
        }else{
            //登录成功,发放令牌
            Algorithm algorithm = Algorithm.HMAC256(userEmail);
            String token = JWT.create().withIssuer(userEmail).sign(algorithm);
            result.setData(token);
        }
        return result;
    }
}
