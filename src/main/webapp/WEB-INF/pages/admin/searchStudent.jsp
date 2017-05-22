<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="/WEB-INF/pages/common.jsp"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>
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
<%@ include file="/WEB-INF/pages/admin/pageHeader.jsp" %>
<%@ include file="/WEB-INF/pages/admin/pageMenu.jsp" %>

	
<div class="content">
	<div class="mainbody">	
	 	<div>
			<form action="/query/searchStudentByName.do" method="post">
				按名字查找：<input type="text" name="condition">
				<button type="submit">查找</button>
			</form>
			<form action="/query/searchStudentBySex.do" method="post">
				<div>
					<label> 
						按性别：<input type="radio" name="condition"
							id="male" value="1" checked>
							男&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="radio"
							name="condition" id="female" value="2"> 女
					</label>
				</div>
				<button type="submit">查找</button>
			</form>
			<form action="/query/searchStudentByDept.do" method="post">
				按学院查找：<input type="text" name="condition">
				<button  type="submit">查找</button>
			</form>
			<form action="/query/searchStudentBySpecialty.do" method="post">
				按专业查找：<input type="text" name="condition">
				<button  type="submit">查找</button>
			</form>
			<form action="/query/searchStudentByClass.do" method="post">
				按班级查找：<input type="text" name="condition">
				<button  type="submit">查找</button>
			</form>						
	 	</div>
	</div>	
</div>

<%@ include file="/WEB-INF/pages/pageBottom.jsp" %>
</body>
</html>