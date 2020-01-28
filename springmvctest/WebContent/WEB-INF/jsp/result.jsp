<%@ page language="java" contentType="text/html; charset=EUC-KR"
    pageEncoding="EUC-KR"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=EUC-KR">
	<title>Insert title here</title>
</head>
<body>
	<h1>SpringMVC실행결과</h1>
	<p>------------------</p>
	<h3>jsp로 코드 출력하기:9단 출력</h3>
	<h3><%= request.getAttribute("msg") %></h3>
	<h3>EL로 출력하기:9단 출력</h3>
<%-- 	<% for(int i=1; i<10; i++){ %>
			<h3>9*<%= i %> = <%= 9*i %></h3>
	<%	}	%> --%>
	${msg}

</body>
</html>