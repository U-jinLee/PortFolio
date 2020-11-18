package net.Login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.Login.db.*;

public class LoginAction implements Action {
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		LoginDAO ldao = new LoginDAO();
		LoginDTO ldto = new LoginDTO();
		ActionForward forward = new ActionForward();
		
		request.setCharacterEncoding("UTF-8");
		
		ldto.setUser_id(request.getParameter("user_id"));
		ldto.setUser_pw(request.getParameter("user_pw"));
		
		int i = ldao.login(ldto);
		
		System.out.println(i);
		
		forward.setRedirect(true);
		forward.setPath("sueecss.jsp");
		return forward;
	}

}
