package kr.co.ictedu.user.service;

import java.io.UnsupportedEncodingException;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.co.ictedu.user.model.UsersDAO;
import kr.co.ictedu.user.model.UsersVO;

public class UserJoinService implements IUserService {

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
		String uname = request.getParameter("uname");
		String email = request.getParameter("email");
		
		UsersVO user = new UsersVO();
		
		user.setId(id);
		user.setPw(pw);
		user.setUname(uname);
		user.setEmail(email);
		
		UsersDAO dao = UsersDAO.getInstance();
		dao.joinUsers(user);
	}

	
}
