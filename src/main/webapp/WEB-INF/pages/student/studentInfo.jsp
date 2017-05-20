<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/common.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<!DOCTYPE html>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta http-equiv="keywords" content="校园维修系统">
<meta http-equiv="description" content="校园维修系统">
<meta http-equiv="X-UA-Compatible" content="IE=edge">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link rel="stylesheet" href="<c:url value='/css/studentMain.css'/>">
<link rel="stylesheet" href="<c:url value='/css/pageContent.css'/>">
<%-- <script type="text/javascript" src="<c:url value='/js/noticeList.js'/>"></script>
 --%>
<title>校园修缮系统</title>

</head>
<body>
	<%@ include file="/WEB-INF/pages/student/pageHeader.jsp"%>
	<%@ include file="/WEB-INF/pages/student/pageMenu.jsp"%>


	<div class="content">
		<div class="mainbody">
			<%
				Student student = (Student) session.getAttribute("current_student");
			%>
			<div>姓名：<%=student.getName() %></div>

			<div>性别：<%=student.getSex() %></div>

			<div>年龄：<%=student.getAge() %></div>

			<div>学院：<%=student.getDept() %></div>

			<div>专业：<%=student.getSpecialty() %></div>

			<div>班级：<%=student.getClassNo() %></div>

			<div>联系方式：<%=student.getTel() %></div>

			<div>地址：<%=student.getAddr() %></div>
		</div>

	</div>

	<%@ include file="/WEB-INF/pages/pageBottom.jsp"%>
</body>
</html>