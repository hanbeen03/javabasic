package kr.co.ictedu.board.model;

import java.util.List;

public class BoardPageDTO {
	private int total; //전체 글 개수
	private int currentPage; //현재 보고 있는 페이지
	private List<BoardVO> boardList; // 페이징된 글 목록
	private int totalPages; //전체 페이지 개수
	private int startPage; //시작 페이지 번호
	private int endPage; //끝 페이지 번호
	
	//전체 글 개수, 현제 페이지, 페이징된 글 목록을 받아서
	//나머지 정보를 얻어냅니다.
	
	public BoardPageDTO(int total, int currentPage, List<BoardVO> boardList) {
		this.total = total;
		this.currentPage = currentPage;
		this.boardList = boardList;
		
		if(total == 0) {
			this.totalPages = 0;
			this.startPage = 0;
			this.endPage = 0;
		} else {
			//게시글 총 개수를 이용해 전체 페이지 개수부터 구하기
			this.totalPages = this.total / 10;
			if(this.total % 10 > 0) {
				this.totalPages += 1;
			}
			
			//현재 보고 있는 페이지 그룹의 시작 번호 구하기
			int modVal = this.currentPage % 10;
			this.startPage = this.currentPage / 10 * 10 + 1;
			if(modVal == 0) {
				this.startPage -= 10;
			}
			
			// 해당 페이지의 끝 번호 구하기
			this.endPage = this.startPage + (10 - 1);
			//단 위에서 구한 명목상의 마지막 페이지가
			//totalPages를 초과하는 경우는
			//totalPages로 대신 대입한다.
			if(this.endPage > this.totalPages) {
				this.endPage = this.totalPages;
			}
			
		}// else END
	}// end constructor
	
	public int getTotal() {
		return total; //총 글 개수 리턴
	}
	
	public boolean hasNoBoard() {
		return total == 0; //게시물 표기가 불가능할때 true 리턴
	}
	
	public boolean hasBoard() {
		return total > 0;
	}
	
	public int getTotalPages() {
		return totalPages; //페이지의 총 개수 리턴
	}
	
	public List<BoardVO> getBoardList() {
		return boardList; //해당 페이지에 표기할 글 목록 리턴
	}
	
	public int getStartPage() {
		return startPage;
	}
	
	public int getEndPage() {
		return endPage;
	}

	@Override
	public String toString() {
		return "BoardPageDTO [total=" + total + ", currentPage=" + currentPage + ", boardList=" + boardList
				+ ", totalPages=" + totalPages + ", startPage=" + startPage + ", endPage=" + endPage + "]";
	}
	
	
}
