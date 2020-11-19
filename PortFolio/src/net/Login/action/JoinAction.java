package net.Login.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.Login.db.*;

public class JoinAction implements Action {
	
	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		System.out.println("떵공!");
		LoginDAO ldao = new LoginDAO();
		LoginDTO ldto = new LoginDTO();
		ActionForward forward = new ActionForward();
		
		request.setCharacterEncoding("UTF-8");
		
		ldto.setUser_id(request.getParameter("user_id"));
		ldto.setUser_pw(request.getParameter("user_pw"));
		
		ldao.Join(ldto);
		
		forward.setRedirect(true);
		forward.setPath("login.jsp");
		return forward;
	}

}
