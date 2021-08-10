package kr.co.ictedu.board.service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardWriteService implements IBoardService{

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		// getParameter로 폼에서 쏜 데이터를 들고오게 해 주세요.
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
