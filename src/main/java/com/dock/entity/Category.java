package com.dock.entity;


import com.fasterxml.jackson.annotation.JsonFormat;
import org.springframework.format.annotation.DateTimeFormat;

import java.util.Date;
import java.util.List;

public class Category {

    /**
     * 类别id
     */
  private Integer categoryId;
    /**
     * 类别名称
     */
  private String categoryName;
    /**
     * 类别层级
     */
  private Integer level;
    /**
     * 父级id
     */
  private Integer parentId;
    /**
     * 创建时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date createTime;
    /**
     * 更新时间
     */
    @JsonFormat(pattern = "yyyy-MM-dd",timezone = "GMT+8")
    @DateTimeFormat(pattern = "yyyy-MM-dd")
  private Date updateTime;
    /**
     * 是否删除
     */
  private Integer isDelete;

    /**
     * 子级集合
     * @return
     */
    List<Category> subCategory;

    /**
     * 是否优子级
     * @return
     */
    private Boolean hasCategory;

    public Boolean getHasCategory() {
        return hasCategory;
    }

    public void setHasCategory(Boolean hasCategory) {
        this.hasCategory = hasCategory;
    }

    public List<Category> getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(List<Category> subCategory) {
        this.subCategory = subCategory;
        if(this.subCategory.size()==0){
            this.hasCategory=false;
        }else{
            this.hasCategory=true;
        }
    }
    public Integer getCategoryId() {
    return categoryId;
  }

  public void setCategoryId(Integer categoryId) {
    this.categoryId = categoryId;
  }


  public String getCategoryName() {
    return categoryName;
  }

  public void setCategoryName(String categoryName) {
    this.categoryName = categoryName;
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
        return "Category{" +
            "categoryId=" + categoryId +
            ", categoryName='" + categoryName + '\'' +
            ", level=" + level +
            ", parentId=" + parentId +
            ", createTime=" + createTime +
            ", updateTime=" + updateTime +
            ", isDelete=" + isDelete +
            ", subCategory=" + subCategory +
            ", hasCategory=" + hasCategory +
            '}';
    }
}
