package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;

public class BoardDeleteService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		String bid = request.getParameter("bId");
		HttpSession session = request.getSession();
		
		String sessionId = (String)session.getAttribute("session_id");
		
		if (sessionId == null) {
			try {
				String ui = "/users/user_login.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
			} catch (Exception e) {
				e.printStackTrace();
			}	
		}
		
		
		BoardDAO dao = BoardDAO.getInstance();
		
		int result = dao.delete(bid);
		
		if(result == 0) {
			System.out.println("DB삭제를 실패하였습니다.");
		} else if (result == 1) {
			System.out.println("DB삭제 성공!!");
		}
		
	}

}
