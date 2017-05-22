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
<title>校园修缮系统</title>
</head>
<body>
	<%@ include file="/WEB-INF/pages/admin/pageHeader.jsp"%>
	<%@ include file="/WEB-INF/pages/admin/pageMenu.jsp"%>
	<div class="content">
		<div class="mainbody">
			<div class="table-responsive">
				<table class="table">
					<tr>
						<td>工号</td>
						<td>姓名</td>
						<td>工作量</td>
					</tr>
					<c:forEach var="worker" items="${countList}">
						<tr>
							<td>${worker.wid }</td>
							<td>${worker.name }</td>
							<td>${worker.count}</td>
						</tr>
					</c:forEach>
				</table>
			</div>
		</div>
	</div>
	<%@ include file="/WEB-INF/pages/pageBottom.jsp"%>
</body>
</html>