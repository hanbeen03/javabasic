package kr.co.ictedu;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.co.ictedu.board.service.BoardDeleteService;
import kr.co.ictedu.board.service.BoardDetailService;
import kr.co.ictedu.board.service.BoardListService;
import kr.co.ictedu.board.service.BoardUpdateService;
import kr.co.ictedu.board.service.BoardWriteService;
import kr.co.ictedu.board.service.IBoardService;
import kr.co.ictedu.user.service.IUserService;
import kr.co.ictedu.user.service.UserJoinService;
import kr.co.ictedu.user.service.UserLoginService;
import kr.co.ictedu.user.service.UserLogoutService;


/**
 * Servlet implementation class PatternServlet
 */
//*.do로 잡힌 패턴은 .do로 끝나는 접속주소를 모두 잡아옵니다.
// 확장자 패턴은 /를 빼고 작성합니다.
@WebServlet("*.do")
public class PatternServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PatternServlet() {
        super();
        System.out.println("확장자 패턴 생성");
    }

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		System.out.println("확장자 패턴 서버 연결");
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		System.out.println("확장자 패턴 소멸");
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//확장자 패턴에서 확장자를 포함한 주소값을 가져오기 위해서
		/*
		String uri = request.getRequestURI();
		System.out.println("uri패턴 : " + uri);
		
		
		if( uri.equals("/MyFirstWeb/join.do")) {
			System.out.println("회원가입 요청 확인");
		} else if (uri.equals("/MyFirstWeb/login.do")) {
			System.out.println("로그인 요청 확인");
		} else if (uri.equals("/MyFirstWeb/update.do")) {
			System.out.println("수정 요청 확인");
		} else if (uri.equals("/MyFirstWeb/delete.do")) {
			System.out.println("탈퇴 요청 확인");
		} else if(uri.equals("/MyFirstWeb/write.do")) {
			System.out.println("글쓰기 창으로 이동합니다.");
		} else if (uri.equals("/MyFirstWeb/update.do")) {
			System.out.println("글 수정 창으로 이동합니다.");
		} else if (uri.equals("/MyFirstWeb/delete.do")) {
			System.out.println("글 삭제 창으로 이동합니다.");
		} else if (uri.equals("/MyFirstWeb/select.do")) {
			System.out.println("글 조회 창으로 이동합니다.");
		} else {
			System.out.println("잘못된 패턴입니다.");
		}
		*/
		
		doRequest(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doRequest(request, response);
	}
	
	//만약 요청 메서드(get, post) 상관 없이 처리하게 만들고 싶다면
	//메서드 하나를더 만들어서 요청한다.
	protected void doRequest(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		IBoardService sv = null;
		IUserService sv2 = null;
		HttpSession session = request.getSession();
		
		String ui = null;
		
		String uri = request.getRequestURI();
		System.out.println("uri패턴 : " + uri);
		
		response.setContentType("text/html; charset=UTF-8");
		PrintWriter out = response.getWriter();
		
		
		if( uri.equals("/MyFirstWeb/join.do")) {
			System.out.println("회원가입 요청 확인");
			sv2 = new UserJoinService();
			sv2.execute(request, response);
			
			ui = "/users/user_login.jsp";
			
		} else if (uri.equals("/MyFirstWeb/login.do")) {
			System.out.println("로그인 요청 확인");
			
			sv2 = new UserLoginService();
			sv2.execute(request, response);
			
			String idExist = (String)session.getAttribute("session_id");
		
			if(idExist != null) {
				ui = "/boardselect.do";
			} else if(idExist == null) {
				session.invalidate();
				ui = "/users/user_login.jsp";
			}
			
		} else if (uri.equals("/MyFirstWeb/logout.do")) {
			//session.invalidate();
			sv2 = new UserLogoutService();
			sv2.execute(request, response);
			ui = "/users/user_login.jsp";
			
		}	else if (uri.equals("/MyFirstWeb/userupdate.do")) {
			System.out.println("수정 요청 확인");
		} else if (uri.equals("/MyFirstWeb/userdelete.do")) {
			System.out.println("탈퇴 요청 확인");
		} 
		
		
		else if (uri.equals("/MyFirstWeb/boardwrite.do")) {
			System.out.println("글쓰기 창으로 이동합니다.");
			
			sv = new BoardWriteService();
			sv.execute(request, response);
			
			//경로 저장시 /는 WebContent폴더가 기본을 잡혀있습니다.
			ui = "/boardselect.do";
			//경로 저장 후에는 페이지 강제이동(forward)를 수행합니다.
			
			
		} else if (uri.equals("/MyFirstWeb/boardupdate.do")) {
			System.out.println("글 수정 창으로 이동합니다.");
			sv = new BoardDetailService();
			sv.execute(request, response);
			
			ui="/board/board_update_form.jsp";
		} else if (uri.equals("/MyFirstWeb/boardupdateok.do")) {
			request.setCharacterEncoding("utf-8");
			//서비스 생성
			sv = new BoardUpdateService();
			sv.execute(request, response);
			
			String tempid = (String)request.getAttribute("tempid");
			//서비스 실행
			ui="/boarddetail.do?bId=" + tempid;
			//detail로 보내주기
			
		}	else if (uri.equals("/MyFirstWeb/boarddelete.do")) {
			sv = new BoardDeleteService();
			sv.execute(request, response);
			
			ui = "/boardselect.do";
			
		} else if (uri.equals("/MyFirstWeb/boardselect.do")) {
			System.out.println("글 조회 창으로 이동합니다.");
			String writer = (String)session.getAttribute("session_id");
			request.setAttribute("writer", writer);
			
			sv = new BoardListService();
			sv.execute(request, response);
			
			ui = "/board/board_list.jsp";
		} else if (uri.equals("/MyFirstWeb/boarddetail.do")) {
			sv = new BoardDetailService();
			sv.execute(request, response);
			
			ui = "/board/board_detail.jsp";
		} else {
			out.print("잘못된 패턴입니다.");
		}
		
		//포워드 로직은 조건문이 모두 작동한 뒤에 실행합니다.
		// RequestDispatcher를 사용해 포워딩을 하면
		// request, response를 jsp페이지에 전달할 수 있습니다.
		// 모델2 방식은 스크립트릿을 쓰지 않기 때문에
		// 컨트롤러단에서 출력에 필요한 데이터를 받아놨다
		// 포워드로 .jsp에 전달합니다.
		RequestDispatcher dp = request.getRequestDispatcher(ui);
		dp.forward(request, response);
		
	}

}
