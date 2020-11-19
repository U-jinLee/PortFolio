<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<form action="BBSWriteAction.bbs" method="post">
	<table>
		<tr>
			<td>
				제목	
			</td>
			<td>
				<textarea rows="1" cols="50" name="btitle"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				내용	
			</td>
			<td>
				<textarea rows="10" cols="50" name="bcontent"></textarea>
			</td>
		</tr>
		<tr>
			<td>
				작성자	
			</td>
			<td>
				<input type="text" readonly="readonly" name="bwrite" value=<%=session.getAttribute("SessionID")%>>
			</td>
		</tr>
		<tr>
			<td colspan="2"><button>글쓰기</button></td>
		</tr>
	</table>
</form>
</body>
</html>