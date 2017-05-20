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
<%-- <script type="text/javascript" src="<c:url value='/js/noticeList.js'/>"></script>
 --%>
<title>校园修缮系统</title>

</head>
<body>
<%@ include file="/WEB-INF/pages/student/pageHeader.jsp" %>
<%@ include file="/WEB-INF/pages/student/pageMenu.jsp" %>

	
<div class="content">
	<div class="mainbody">
	
		<div class="table-responsive">
		  <table class="table">
			<tr>
				<td>序号</td>
				<td>标题</td>
				<td>时间</td>
				<td></td>
			</tr>			
		<c:forEach var="x" items="${newsList}">
        <tr>
          <td >${x.newsid}</td>        
          <td >${x.title}</td>
          <td >${x.pubTime}</td>
          <td><a href="<c:url value='/news/showDetail.do?newsId=${x.newsid}'/>">查看</a></td>
        </tr>
		</c:forEach>
						
		  </table>
		</div>
	  	<div style="clear: both;"></div>
		<nav class="text-right">
			<ul class="pager">
			<!-- <c:url value='/notice/main.do'/> -->
				<li><a href="#">上一页</a></li>
				<li><a href="#">下一页</a></li>
			</ul>
		</nav>
	  
	</div>
	
</div>

<%@ include file="/WEB-INF/pages/pageBottom.jsp" %>
</body>
</html>