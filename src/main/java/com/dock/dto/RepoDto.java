package com.dock.dto;

import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

/**
 * @author:XuJianYuan
 * @date:2023/6/8 8:12
 * @version:1.0
 */
public class RepoDto {
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
    private Integer userId;

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

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Override
    public String toString() {
        return "RepoDto{" +
            "repoId=" + repoId +
            ", repoAddress='" + repoAddress + '\'' +
            ", repoArea='" + repoArea + '\'' +
            ", repoDesc='" + repoDesc + '\'' +
            ", repoStatus=" + repoStatus +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            ", repoName='" + repoName + '\'' +
            ", userId=" + userId +
            '}';
    }
}
