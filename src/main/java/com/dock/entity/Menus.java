package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Menus {

  private Integer menuId;
  private String menuName;
  private String menuUrl;
  private Integer level;
  private Integer parentId;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
  private Integer isDelete;
  private List<Menus> subMenusList;

    public List<Menus> getSubMenusList() {
        return subMenusList;
    }

    public void setSubMenusList(List<Menus> subMenusList) {
        this.subMenusList = subMenusList;
    }

    public Integer getMenuId() {
    return menuId;
  }

  public void setMenuId(Integer menuId) {
    this.menuId = menuId;
  }


  public String getMenuName() {
    return menuName;
  }

  public void setMenuName(String menuName) {
    this.menuName = menuName;
  }


  public String getMenuUrl() {
    return menuUrl;
  }

  public void setMenuUrl(String menuUrl) {
    this.menuUrl = menuUrl;
  }


  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }


  public Integer getParentId() {
    return parentId;
  }

  public void setParentId(Integer parentId) {
    this.parentId = parentId;
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

    @Override
    public String toString() {
        return "Menus{" +
            "menuId=" + menuId +
            ", menuName='" + menuName + '\'' +
            ", menuUrl='" + menuUrl + '\'' +
            ", level=" + level +
            ", parentId=" + parentId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            ", subMenusList=" + subMenusList +
            '}';
    }
}
