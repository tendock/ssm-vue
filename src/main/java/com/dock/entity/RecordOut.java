package com.dock.entity;


import java.util.Date;

public class RecordOut {

  private Integer recordOutId;
  private Integer customerId;
  private Integer productId;
  private Integer recordOutNumber;
  private Date recordOutTime;
  private Integer userId;
  private Integer repoId;
  private String remarks;
  private Date createTime;
  private Date updateTime;
  private Integer isDelete;



  public Integer getRecordOutId() {
    return recordOutId;
  }

  public void setRecordOutId(Integer recordOutId) {
    this.recordOutId = recordOutId;
  }


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getRecordOutNumber() {
    return recordOutNumber;
  }

  public void setRecordOutNumber(Integer recordOutNumber) {
    this.recordOutNumber = recordOutNumber;
  }


  public Date getRecordOutTime() {
    return recordOutTime;
  }

  public void setRecordOutTime(Date recordOutTime) {
    this.recordOutTime = recordOutTime;
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
        return "RecordOut{" +
            "recordOutId=" + recordOutId +
            ", customerId=" + customerId +
            ", productId=" + productId +
            ", recordOutNumber=" + recordOutNumber +
            ", recordOutTime=" + recordOutTime +
            ", userId=" + userId +
            ", repoId=" + repoId +
            ", remarks='" + remarks + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
