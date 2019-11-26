package com.jiangbin.yuekaoproviderapp.pojo;



import java.util.List;


public class PageResult<T> {

    private List<T> content;//数据集合
    private Long total;//总条数
    private Integer pageNum;//页码
    private Integer pageSize;//每页条数

    public PageResult() {
    }

    @Override
    public String toString() {
        return "PageResult{" +
                "content=" + content +
                ", total=" + total +
                ", pageNum=" + pageNum +
                ", pageSize=" + pageSize +
                '}';
    }

    public List<T> getContent() {
        return content;
    }

    public void setContent(List<T> content) {
        this.content = content;
    }

    public Long getTotal() {
        return total;
    }

    public void setTotal(Long total) {
        this.total = total;
    }

    public Integer getPageNum() {
        return pageNum;
    }

    public void setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
    }

    public Integer getPageSize() {
        return pageSize;
    }

    public void setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
    }

    public PageResult(List<T> content, Long total, Integer pageNum, Integer pageSize) {
        this.content = content;
        this.total = total;
        this.pageNum = pageNum;
        this.pageSize = pageSize;
    }
}
