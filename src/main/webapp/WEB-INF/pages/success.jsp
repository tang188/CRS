<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
<script type="text/javascript">
{
	   alert("我敢保证，你现在用的是演示一");
	}
</script>
</head>
<body>
	<%
		response.sendRedirect("/notice/main.do");
	%>
</body>
</html>