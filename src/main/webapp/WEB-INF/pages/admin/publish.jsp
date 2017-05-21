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


	<div class="content">
		<div class="mainbody">

			<form action="/publish/publish.do" method="post">
				<div>
					标题：<input type="text" name="title">
				</div>
				<br>
				<span>内容：</span>
				<div>					
					<textarea rows="10" cols="50" name="content">
	 			</textarea>
				</div>
				<br>
				<div>
					<label> 类别：
					<input type="radio" name="publishType"
						id="publishType1" value="1" checked>
						新闻&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; 
						<input type="radio"
						name="publishType" id="publishType2" value="2"> 公告
					</label>
				</div>
				
				<button type="submit">提交</button>
				<button type="reset">重置</button>
				
			</form>

		</div>
	</div>

	<%@ include file="/WEB-INF/pages/pageBottom.jsp"%>
</body>
</html>