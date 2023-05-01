package com.ssafy.enjoytrip.util;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PageNavigation {

	private boolean startRange; // 현재 페이지가 이전이 눌려지지 않는 범위의 페이지 체크
	private boolean endRange; // 현재 페이지가 다음이 눌려지지 않는 범위의 페이지 체크
	private int totalCount; // 총 게시글 갯수
	private int newCount; // 새글 갯수
	private int totalPageCount; // 총 페이지 갯수
	private int currentPage; // 현재 페이지 번호
	private int naviSize; // 네비게이션 사이즈
	private int countPerPage; // 페이지당 글 갯수
	private int startPage;
	private int endPage;
	private String key;
	private String word;

	public void makeNavi(){
		this.startPage = (currentPage - 1) / naviSize * naviSize + 1;
		this.endPage = startPage + naviSize - 1;

		if (totalPageCount < endPage)
			endPage = totalPageCount;
	}
}