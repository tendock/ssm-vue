package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Supplier {

  private Integer supplierId;
  private String supplierName;
  private String supplierLeader;
  private String supplierTel;
  private String supplierEmail;
  private String supplierAddress;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
  private Integer isDelete;


  public Integer getSupplierId() {
    return supplierId;
  }

  public void setSupplierId(Integer supplierId) {
    this.supplierId = supplierId;
  }


  public String getSupplierName() {
    return supplierName;
  }

  public void setSupplierName(String supplierName) {
    this.supplierName = supplierName;
  }


  public String getSupplierLeader() {
    return supplierLeader;
  }

  public void setSupplierLeader(String supplierLeader) {
    this.supplierLeader = supplierLeader;
  }


  public String getSupplierTel() {
    return supplierTel;
  }

  public void setSupplierTel(String supplierTel) {
    this.supplierTel = supplierTel;
  }


  public String getSupplierEmail() {
    return supplierEmail;
  }

  public void setSupplierEmail(String supplierEmail) {
    this.supplierEmail = supplierEmail;
  }


  public String getSupplierAddress() {
    return supplierAddress;
  }

  public void setSupplierAddress(String supplierAddress) {
    this.supplierAddress = supplierAddress;
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
        return "Supplier{" +
            "supplierId=" + supplierId +
            ", supplierName='" + supplierName + '\'' +
            ", supplierLeader='" + supplierLeader + '\'' +
            ", supplierTel='" + supplierTel + '\'' +
            ", supplierEmail='" + supplierEmail + '\'' +
            ", supplierAddress='" + supplierAddress + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
