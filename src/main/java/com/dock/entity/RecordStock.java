package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;

public class RecordStock {
    private Repository repository;
    private Product product;
  private Integer productId;
  private Integer repoId;
  private Integer productStock;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date createTime;
    @JsonFormat(pattern = "yyyy-MM-dd HH:mm:ss",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd HH:mm:ss")
  private Date updateTime;
  private Integer isDelete;


  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }


  public Integer getRepoId() {
    return repoId;
  }

  public void setRepoId(Integer repoId) {
    this.repoId = repoId;
  }


  public Integer getProductStock() {
    return productStock;
  }

  public void setProductStock(Integer productStock) {
    this.productStock = productStock;
  }

    public Repository getRepository() {
        return repository;
    }

    public void setRepository(Repository repository) {
        this.repository = repository;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
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
        return "RecordStock{" +
            "repository=" + repository +
            ", product=" + product +
            ", productId=" + productId +
            ", repoId=" + repoId +
            ", productStock=" + productStock +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            '}';
    }
}
