package net.bbs.db;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;

public class BBSDAO {
	Connection conn= null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public BBSDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource)init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public void writeBBS(BBSDTO bdto) {
		String SQL = "insert into portfoliobbstable(btitle, bcontent, bwriter) values(?,?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, bdto.getBtitle());
			pstmt.setString(2, bdto.getBcontent());
			pstmt.setString(3, bdto.getBwriter());
			pstmt.executeUpdate();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			// if(rs != null) {try {rs.close();} catch (Exception e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (Exception e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (Exception e) {e.printStackTrace();}}
		}
		
	}
}
