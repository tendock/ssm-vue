package com.dock.entity;


import java.util.Date;

public class UserRepository {

  private Integer repoId;
  private Integer userId;
  private Date createTime;
  private Date updateTime;
  private Integer isDelete;


  public Integer getRepoId() {
    return repoId;
  }

  public void setRepoId(Integer repoId) {
    this.repoId = repoId;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
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

}
