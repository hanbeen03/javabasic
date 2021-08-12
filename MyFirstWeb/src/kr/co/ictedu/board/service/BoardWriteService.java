package kr.co.ictedu.board.service;

import javax.servlet.RequestDispatcher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardWriteService implements IBoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// getParameter로 폼에서 쏜 데이터를 들고오게 해 주세요.
		HttpSession session = request.getSession();
		
		String sessionId = (String)session.getAttribute("session_id");
		
		if(sessionId == null) {
			try {
				String ui = "/users/user_login.jsp";
				RequestDispatcher dp = request.getRequestDispatcher(ui);
				dp.forward(request, response);
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		
		try {
			request.setCharacterEncoding("utf-8");
			
			String title = request.getParameter("title");
			String content = request.getParameter("content");
			String writer = request.getParameter("writer");
			
			BoardDAO dao = BoardDAO.getInstance();
			BoardVO board = new BoardVO();
			board.setbName(writer);
			board.setbContent(content);
			board.setbTitle(title);
			
			int resultCode = dao.write(board);
			
			if(resultCode == 1) {
				System.out.println("DB에 글이 잘 입력되었습니다.");
			} else if(resultCode == 0) {
				System.out.println("에러 발생으로 글이 입력되지 않았습니다.");
			}
		
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	
}
