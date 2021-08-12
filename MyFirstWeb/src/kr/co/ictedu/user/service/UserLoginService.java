package kr.co.ictedu.user.service;

import java.io.IOException;
import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserLoginService implements IUserService {

	@Override
	public void execute(HttpServletRequest request, HttpServletResponse response) {
		try {
			request.setCharacterEncoding("utf-8");
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String id = request.getParameter("id");
		String pw = request.getParameter("pw");
		
		UsersVO user = new UsersVO();
		
		user.setId(id);
		user.setPw(pw);
		
		UsersDAO dao = UsersDAO.getInstance();
		int result = dao.loginUsers(user);
		
		if(result == 1) {
			//세션발급
			HttpSession session = null;
			session = request.getSession();
			
			session.setAttribute("session_id", id);
			session.setAttribute("session_pw", pw);
		} else if (result == 0) {
			System.out.println("로그인 실패!!");
			/*
			try {
				response.sendRedirect("/users/user_login.jsp");
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			*/
		}
		
		
	}

}
