package com.dock.entity;

/**
 * @author:XuJianYuan
 * @date:2023/6/2 19:08
 * @version:1.0
 */
public class Page {
    private Integer pageNo;
    private Integer pageSize;
    private Long count;
    private Integer pageCount;
    private Boolean hasNext;
    private Boolean hasPre;
    private Object data;

    public Integer getPageNo() {
        return pageNo;
    }

    public void setPageNo(Integer pageNo) {
        this.pageNo = pageNo;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public Integer getPageCount() {
        return pageCount;
    }

    public void setPageCount(Integer pageCount) {
        this.pageCount = pageCount;
    }

    public Boolean getHasNext() {
        return hasNext;
    }

    public void setHasNext(Boolean hasNext) {
        this.hasNext = hasNext;
    }

    public Boolean getHasPre() {
        return hasPre;
    }

    public void setHasPre(Boolean hasPre) {
        this.hasPre = hasPre;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return "Page{" +
            "pageNo=" + pageNo +
            ", pageSize=" + pageSize +
            ", count=" + count +
            ", pageCount=" + pageCount +
            ", hasNext=" + hasNext +
            ", hasPre=" + hasPre +
            ", data=" + data +
            '}';
    }
}
