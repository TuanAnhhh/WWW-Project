package com.websitedungcuthethao.dto;

public class AbstractDTO {

	private Integer page;
	private Integer limit;
	private Integer totalPage;
	private Long totalItem;
	

	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	public Integer getLimit() {
		return limit;
	}
	public void setLimit(Integer limit) {
		this.limit = limit;
	}
	public Integer getTotalPage() {
		return totalPage;
	}
	public void setTotalPage(Integer totalPage) {
		this.totalPage = totalPage;
	}
	public Long getTotalItem() {
		return totalItem;
	}
	public void setTotalItem(Long totalItem) {
		this.totalItem = totalItem;
	}

	
	
}
