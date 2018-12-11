package app.yummy.common;

import java.util.ArrayList;
import java.util.List;

import lombok.Data;

@Data
public class Pagination {

	private int currentPage; // 현재 페이지(사용자가 보고싶은 페이지)
	private int elementsPerPage = 20; // 페이지당 표시하는 로우의 개수
	private int pagesPerBlock = 10; // 하단에 표시하는 페이징 넘버의 개수
	private int totalElements; // 테이블이 갖고 있는 모든 로우의 개수
	
	private int totalPages; // 전체 페이지 수
	private int totalBlocks; // 전체 블럭 수 

	private int currentBlock; // 현재 블럭
	private int currentBlockStartPage; // 현재 블럭의 시작 페이지 번호
	private int currentBlockEndPage; // 현재 블럭의 끝 페이지 번호
	
	private List<String> pagination = new ArrayList<>();

	public Pagination(int page, int size, int bsize, int rows, final String url) {
		this.currentPage = page;
		this.elementsPerPage = size;
		this.pagesPerBlock = bsize;
		this.totalElements = rows;

		totalPages = (int) Math.ceil((double) this.totalElements / this.elementsPerPage);
		totalBlocks = (int) Math.ceil((double) totalPages / this.pagesPerBlock);
		
		currentBlock = (int) Math.ceil((double) this.currentPage / this.pagesPerBlock);
		currentBlockEndPage = currentBlock * this.pagesPerBlock;
		currentBlockStartPage = currentBlockEndPage - this.pagesPerBlock + 1;
		this.drawPagination(url);
	}
	
	public static int seekOffset(int page, int size) {
		if (page > 0) {
			return (page - 1) * size;
		}
		return 0;
	}

	// page : currentPage, size: rows per page(페이지당 로우 수)
	public static int seekStart(int page, int size) {
		return ((page - 1) * size) + 1;
	}

	public void addPageLink(String link) {
		this.pagination.add(link);
	}
	
	public void drawPagination(final String url) {
		final String COMMON = "&size="+elementsPerPage+"&bsize="+pagesPerBlock;
		
		if(totalElements > 0){ // 로우가 있을 때 
			
			if (currentBlockStartPage > pagesPerBlock) {
				
				String params = "page="+(currentBlockStartPage-1)+COMMON;
				
				// 이전 블럭
				String link = "<li class=\"page-item\">"+ 
								"   <a class=\"page-link\" href=\""+url+"?"+params+"\">Previous <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a>"+
							  "</li>";
				this.addPageLink(link);
			}
			
			// for문 ///////////////////
			// paging 버튼 
			for (int pno = currentBlockStartPage; pno <= currentBlockEndPage; pno++) {
				
				String link = null;
				if (pno == currentPage) { // 현재 페이지는 active
					link = "<li class=\"page-item active\">"+
							" <a class=\"page-link\" href=\"#\">"+ pno +"<span class=\"sr-only\">(current)</span></a>"+
							"</li>";
					this.addPageLink(link);
				}else { 
					if (pno <= totalPages) {
						String params = "page="+pno+COMMON;
						link = "<li class=\"page-item\"><a class=\"page-link\" href=\""+url+"?"+params+"\">"+ pno +"</a></li>";
						this.addPageLink(link);
					}
				}
			}
			// <a [routerLink]="['/users', username]">
			
			if (currentBlockEndPage < totalPages) {
//				String params = "page="+totalPages+COMMON;
//				String link = "<li class=\"page-item\">"
//								+ "<a class=\"page-link\" href=\""+url+"?"+params+"\">Next <i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a>"
//							+ "</li>";	
//				this.addPageLink(link);
				
				String params = "page="+(currentBlockEndPage+1)+COMMON;
				String link = "<li class=\"page-item\"><a class=\"page-link\" href='"+url+"?"+params+"'>Next<i class=\"fa fa-angle-double-right\" aria-hidden=\"true\"></i></a></li>";
				this.addPageLink(link);
				
			}
			
			
		}else { // 로우가 없을 때 
			String link = "<li class=\"page-item active\">"+
								"<a class=\"page-link\" href=\"#\">1 <span class=\"sr-only\">(current)</span></a>"+
						  "</li> \n";
			
			this.addPageLink(link);
		}
		
	}
	

}
