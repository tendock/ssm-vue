package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Carrier {

  private Integer carrierId;
  private String carrierName;
  private String carrierLeader;
  private String carrierTel;
  private String carrierEmail;
  private String carrierAddress;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;

  private Integer isDelete;


  public Integer getCarrierId() {
    return carrierId;
  }

  public void setCarrierId(Integer carrierId) {
    this.carrierId = carrierId;
  }


  public String getCarrierName() {
    return carrierName;
  }

  public void setCarrierName(String carrierName) {
    this.carrierName = carrierName;
  }


  public String getCarrierLeader() {
    return carrierLeader;
  }

  public void setCarrierLeader(String carrierLeader) {
    this.carrierLeader = carrierLeader;
  }


  public String getCarrierTel() {
    return carrierTel;
  }

  public void setCarrierTel(String carrierTel) {
    this.carrierTel = carrierTel;
  }


  public String getCarrierEmail() {
    return carrierEmail;
  }

  public void setCarrierEmail(String carrierEmail) {
    this.carrierEmail = carrierEmail;
  }


  public String getCarrierAddress() {
    return carrierAddress;
  }

  public void setCarrierAddress(String carrierAddress) {
    this.carrierAddress = carrierAddress;
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
        return "Carrier{" +
            "carrierId=" + carrierId +
            ", carrierName='" + carrierName + '\'' +
            ", carrierLeader='" + carrierLeader + '\'' +
            ", carrierTel='" + carrierTel + '\'' +
            ", carrierEmail='" + carrierEmail + '\'' +
            ", carrierAddress='" + carrierAddress + '\'' +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
