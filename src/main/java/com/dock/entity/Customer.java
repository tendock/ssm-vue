package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class Customer {

  private Integer customerId;
  private String customerName;
  private String customerLeader;
  private String customerTel;
  private String customerEmail;
  private String customerAddress;
  private Integer levelId;
  private Level level;
  private Integer sourceId;
  private Source source;
  private Integer industryId;
  private Industry industry;
  @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
  @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
  private Integer isDelete;


  public Integer getCustomerId() {
    return customerId;
  }

  public void setCustomerId(Integer customerId) {
    this.customerId = customerId;
  }


  public String getCustomerName() {
    return customerName;
  }

    public Level getLevel() {
        return level;
    }

    public void setLevel(Level level) {
        this.level = level;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public Industry getIndustry() {
        return industry;
    }

    public void setIndustry(Industry industry) {
        this.industry = industry;
    }

    public void setCustomerName(String customerName) {
    this.customerName = customerName;
  }


  public String getCustomerLeader() {
    return customerLeader;
  }

  public void setCustomerLeader(String customerLeader) {
    this.customerLeader = customerLeader;
  }


  public String getCustomerTel() {
    return customerTel;
  }

  public void setCustomerTel(String customerTel) {
    this.customerTel = customerTel;
  }


  public String getCustomerEmail() {
    return customerEmail;
  }

  public void setCustomerEmail(String customerEmail) {
    this.customerEmail = customerEmail;
  }


  public String getCustomerAddress() {
    return customerAddress;
  }

  public void setCustomerAddress(String customerAddress) {
    this.customerAddress = customerAddress;
  }


  public Integer getLevelId() {
    return levelId;
  }

  public void setLevelId(Integer levelId) {
    this.levelId = levelId;
  }


  public Integer getSourceId() {
    return sourceId;
  }

  public void setSourceId(Integer sourceId) {
    this.sourceId = sourceId;
  }


  public Integer getIndustryId() {
    return industryId;
  }

  public void setIndustryId(Integer industryId) {
    this.industryId = industryId;
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
        return "Customer{" +
            "customerId=" + customerId +
            ", customerName='" + customerName + '\'' +
            ", customerLeader='" + customerLeader + '\'' +
            ", customerTel='" + customerTel + '\'' +
            ", customerEmail='" + customerEmail + '\'' +
            ", customerAddress='" + customerAddress + '\'' +
            ", levelId=" + levelId +
            ", level=" + level +
            ", sourceId=" + sourceId +
            ", source=" + source +
            ", industryId=" + industryId +
            ", industry=" + industry +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
