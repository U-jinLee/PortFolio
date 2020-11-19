package net.Login.db;

import java.sql.*;
import javax.sql.*;
import javax.naming.*;


public class LoginDAO {
	Connection conn = null;
	PreparedStatement pstmt = null;
	ResultSet rs = null;
	
	public LoginDAO() {
		try {
			Context init = new InitialContext();
			DataSource ds = (DataSource) init.lookup("java:comp/env/jdbc/mysql");
			conn = ds.getConnection();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public int login(LoginDTO ldto) {
		String SQL = "select user_pw from portfolioTable where user_id=?";
		try {			
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1,ldto.getUser_id());
			rs = pstmt.executeQuery();
			
			if(rs.next()) {
				if(rs.getString("user_pw").equals(ldto.getUser_pw())) {
					return 1;
				} else {return 0;}
			} return -1;
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch (Exception e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (Exception e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (Exception e) {e.printStackTrace();}}
		}
		return -2;
	}
	
	public void Join(LoginDTO ldto) {
		System.out.println("dao");
		String SQL = "insert into portfolioTable(user_id, user_pw) values(?,?)";
		try {
			pstmt = conn.prepareStatement(SQL);
			pstmt.setString(1, ldto.getUser_id());
			pstmt.setString(2, ldto.getUser_pw());
			pstmt.executeUpdate();
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if(rs != null) {try {rs.close();} catch (Exception e) {e.printStackTrace();}}
			if(pstmt != null) {try {pstmt.close();} catch (Exception e) {e.printStackTrace();}}
			if(conn != null) {try {conn.close();} catch (Exception e) {e.printStackTrace();}}
		}
	}





}

