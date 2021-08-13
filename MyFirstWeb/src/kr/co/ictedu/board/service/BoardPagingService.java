package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardPageDTO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardPagingService implements IBoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		int boardCount = 0;
		
		String strPage = request.getParameter("page");
		
		
		int page = 1;
		
		if(strPage != null) {
			page = Integer.parseInt(strPage);
		}
		
		
		BoardDAO dao = BoardDAO.getInstance();
		
		List<BoardVO> board = dao.getPageList((page - 1) * 10);
		
		//얻어온 글 전체 개수와 현재 조회중인 페이지 정보를 DTO에 넘겨줌
		boardCount = dao.getBoardCount();
		
		//System.out.println("갯수 : " + boardCount);
		
		BoardPageDTO pageDTO = new BoardPageDTO(boardCount, page, board);
		
		System.out.println(pageDTO);
		
		request.setAttribute("boardList", board);
		request.setAttribute("pageDTO", pageDTO);
		
	}

	
}
