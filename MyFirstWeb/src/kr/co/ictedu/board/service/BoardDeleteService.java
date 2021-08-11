package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardDeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bid = request.getParameter("bId");
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int result = dao.delete(bid);
		
		if(result == 0) {
			System.out.println("DB삭제를 실패하였습니다.");
		} else if (result == 1) {
			System.out.println("DB삭제 성공!!");
		}
		
	}

}
