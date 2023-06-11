package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class User {

  private Integer userId;
  private String userName;
  private String userTel;
  private String userEmail;
  private String userNick;
  private String password;
  private List<Integer> deptIdList;
  private List<Department> deptList;
  private String salt;
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
  private Integer isDelete;
  private String avatar;
  private List<Integer> roleIdList;
  private List<Role> roleList;

    public List<Role> getRoleList() {
        return roleList;
    }

    public void setRoleList(List<Role> roleList) {
        this.roleList = roleList;
    }

    public List<Integer> getRoleIdList() {
        return roleIdList;
    }

    public void setRoleIdList(List<Integer> roleIdList) {
        this.roleIdList = roleIdList;
    }

    @Override
    public String toString() {
        return "User{" +
            "userId=" + userId +
            ", userName='" + userName + '\'' +
            ", userTel='" + userTel + '\'' +
            ", userEmail='" + userEmail + '\'' +
            ", userNick='" + userNick + '\'' +
            ", password='" + password + '\'' +
            ", deptIdList=" + deptIdList +
            ", deptList=" + deptList +
            ", salt='" + salt + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            ", avatar='" + avatar + '\'' +
            ", roleIdList=" + roleIdList +
            ", roleList=" + roleList +
            '}';
    }

    public List<Integer> getDeptIdList() {
        return deptIdList;
    }

    public void setDeptIdList(List<Integer> deptIdList) {
        this.deptIdList = deptIdList;
    }

    public List<Department> getDeptList() {
        return deptList;
    }

    public void setDeptList(List<Department> deptList) {
        this.deptList = deptList;
    }

    public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public String getUserName() {
    return userName;
  }

  public void setUserName(String userName) {
    this.userName = userName;
  }


  public String getUserTel() {
    return userTel;
  }

  public void setUserTel(String userTel) {
    this.userTel = userTel;
  }


  public String getUserEmail() {
    return userEmail;
  }

  public void setUserEmail(String userEmail) {
    this.userEmail = userEmail;
  }


  public String getUserNick() {
    return userNick;
  }

  public void setUserNick(String userNick) {
    this.userNick = userNick;
  }


  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }


  public String getSalt() {
    return salt;
  }

  public void setSalt(String salt) {
    this.salt = salt;
  }


  public Date getCreateTime() {
    return createTime;
  }

  public void setCreateTime(Date createTime) {
    this.createTime = createTime;
  }


  public Date getUpdateTime() {
    return updateTime;
  }

  public void setUpdateTime(Date updateTime) {
    this.updateTime = updateTime;
  }


  public Integer getIsDelete() {
    return isDelete;
  }

  public void setIsDelete(Integer isDelete) {
    this.isDelete = isDelete;
  }


  public String getAvatar() {
    return avatar;
  }

  public void setAvatar(String avatar) {
    this.avatar = avatar;
  }

}
