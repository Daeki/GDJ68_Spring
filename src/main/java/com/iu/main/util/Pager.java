package com.iu.main.util;


public class Pager {
	private Long startRow;
	private Long lastRow;
	
	private Long page;
	
	//한페이지에 보여질 data(row)의 갯스
	private Long perPage;
	
	
	public void makeRowNum() {
		this.startRow=(this.getPage()-1)*this.getPerPage();
		this.lastRow=this.getPage()*this.getPerPage();
	}



	public Long getStartRow() {
		return startRow;
	}



	public void setStartRow(Long startRow) {
		this.startRow = startRow;
	}



	public Long getLastRow() {
		return lastRow;
	}



	public void setLastRow(Long lastRow) {
		this.lastRow = lastRow;
	}



	public Long getPage() {
		if(this.page==null) {
			this.page=1L;
		}
		return page;
	}



	public void setPage(Long page) {
		this.page = page;
	}



	public Long getPerPage() {
		if(this.perPage==null) {
			this.perPage=10L;
		}
		return perPage;
	}



	public void setPerPage(Long perPage) {
		this.perPage = perPage;
	}
	
	
	
	

}
