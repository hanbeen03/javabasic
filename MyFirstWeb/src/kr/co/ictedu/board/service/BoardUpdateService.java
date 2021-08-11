package kr.co.ictedu.board.service;

import java.io.UnsupportedEncodingException;
import java.sql.Timestamp;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.board.model.BoardDAO;
import kr.co.ictedu.board.model.BoardVO;

public class BoardUpdateService implements IBoardService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		
		
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		response.setCharacterEncoding("utf-8");
		
		//1. 파라미터 6개 받아오기
		int bid = Integer.parseInt(request.getParameter("bid"));
		int bhit = Integer.parseInt(request.getParameter("bhit"));
		Timestamp bdate = Timestamp.valueOf(request.getParameter("bdate"));
		String bname = request.getParameter("bname");
		String title = request.getParameter("title");
		String content = request.getParameter("content");
		//2. VO 생성해서 세터로 저장하기
		BoardVO vo = new BoardVO();
		
		vo.setbId(bid);
		vo.setbHit(bhit);
		vo.setbDate(bdate);
		vo.setbName(bname);
		vo.setbTitle(title);
		vo.setbContent(content);
		//3. DAO 생성 및 update로직 호출
		BoardDAO dao = BoardDAO.getInstance();
		dao.update(vo);
		
		request.setAttribute("tempid", request.getParameter("bid"));
	}

}
