<%@page import="java.util.List"%>
<%@page import="com.tangzh.domain.WorkerExample"%>
<%@page import="com.tangzh.service.impl.ITbWorkerServiceImpl"%>
<%@page import="com.tangzh.domain.Worker"%>
<%@page import="com.tangzh.service.impl.ITbBillServiceImpl"%>
<%@page import="com.tangzh.domain.Bill"%>
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
	<%@ include file="/WEB-INF/pages/admin/pageHeader.jsp"%>
	<%@ include file="/WEB-INF/pages/admin/pageMenu.jsp"%>

	<%
		String s = request.getParameter("bid");
	%>
	<div class="content">
		<div class="mainbody">
			<form action="/repair/repair.do?bid=<%=s%>" method="post">
				<div class="table-responsive">
					<table class="table">
						<tr>
							<td>详情</td>
							<td>地址</td>
							<td>申请时间</td>
							<td>预约时间</td>
						</tr>
						<tr>
							<td>${bill.detail }</td>
							<td>${bill.addr }</td>
							<td>${bill.appTime }</td>
							<td>${bill.time }</td>
						</tr>
						<tr>
							<td>选择维修员: <select name="worker">
								<c:forEach var="worker" items="${workers}">
									<option value="${worker.wid}">${worker.name}</option>
								</c:forEach>
							</select></td>
							
						</tr>
					</table>
				</div>
				<button type="submit">提交</button>
				<button type="reset">重置</button>
			</form>
		</div>
	</div>

	<%@ include file="/WEB-INF/pages/pageBottom.jsp"%>
</body>
</html>