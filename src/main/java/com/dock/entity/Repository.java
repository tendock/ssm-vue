package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Repository {

  private Integer repoId;
  private String repoAddress;
  private String repoArea;
  private String repoDesc;
  private Integer repoStatus;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
  private Integer isDelete;
  private String repoName;


  public Integer getRepoId() {
    return repoId;
  }

  public void setRepoId(Integer repoId) {
    this.repoId = repoId;
  }


  public String getRepoAddress() {
    return repoAddress;
  }

  public void setRepoAddress(String repoAddress) {
    this.repoAddress = repoAddress;
  }


  public String getRepoArea() {
    return repoArea;
  }

  public void setRepoArea(String repoArea) {
    this.repoArea = repoArea;
  }


  public String getRepoDesc() {
    return repoDesc;
  }

  public void setRepoDesc(String repoDesc) {
    this.repoDesc = repoDesc;
  }


  public Integer getRepoStatus() {
    return repoStatus;
  }

  public void setRepoStatus(Integer repoStatus) {
    this.repoStatus = repoStatus;
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


  public String getRepoName() {
    return repoName;
  }

  public void setRepoName(String repoName) {
    this.repoName = repoName;
  }

    @Override
    public String toString() {
        return "Repository{" +
            "repoId=" + repoId +
            ", repoAddress='" + repoAddress + '\'' +
            ", repoArea='" + repoArea + '\'' +
            ", repoDesc='" + repoDesc + '\'' +
            ", repoStatus=" + repoStatus +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            ", repoName='" + repoName + '\'' +
            '}';
    }
}
