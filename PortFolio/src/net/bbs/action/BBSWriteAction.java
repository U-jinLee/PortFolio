package net.bbs.action;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import net.bbs.db.*;

public class BBSWriteAction implements Action {

	public ActionForward execute(HttpServletRequest request, HttpServletResponse response) throws Exception {
		BBSDAO bdao = new BBSDAO();
		BBSDTO bdto = new BBSDTO();
		ActionForward forward = new ActionForward();
		
		request.setCharacterEncoding("UTF-8");
		
		bdto.setBtitle(request.getParameter("btitle"));
		bdto.setBcontent(request.getParameter("bcontent"));
		bdto.setBwriter(request.getParameter("bwrite"));
		
		bdao.writeBBS(bdto);
		
		forward.setRedirect(false);
		forward.setPath("");
		return forward;
	}

}