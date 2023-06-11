package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RecordIn {

  private Integer recordInId;
  private Integer supplierId;
  private Integer productId;
  private Integer recordInNumber;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date recordInTime;
  private Integer userId;
  private Integer repoId;
  private String remarks;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
  private Date updateTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Integer isDelete;


  public Integer getRecordInId() {
    return recordInId;
  }

  public void setRecordInId(Integer recordInId) {
    this.recordInId = recordInId;
  }


  public Integer getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getRecordInNumber() {
    return recordInNumber;
  }

  public void setRecordInNumber(Integer recordInNumber) {
    this.recordInNumber = recordInNumber;
  }


  public Date getRecordInTime() {
    return recordInTime;
  }

  public void setRecordInTime(Date recordInTime) {
    this.recordInTime = recordInTime;
  }


  public Integer getUserId() {
    return userId;
  }

  public void setUserId(Integer userId) {
    this.userId = userId;
  }


  public Integer getRepoId() {
    return repoId;
  }

  public void setRepoId(Integer repoId) {
    this.repoId = repoId;
  }


  public String getRemarks() {
    return remarks;
  }

  public void setRemarks(String remarks) {
    this.remarks = remarks;
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
        return "RecordIn{" +
            "recordInId=" + recordInId +
            ", supplierId=" + supplierId +
            ", productId=" + productId +
            ", recordInNumber=" + recordInNumber +
            ", recordInTime=" + recordInTime +
            ", userId=" + userId +
            ", repoId=" + repoId +
            ", remarks='" + remarks + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
