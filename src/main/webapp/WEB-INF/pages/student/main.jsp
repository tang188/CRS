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
<script type="text/javascript" src="<c:url value='/js/login.js'/>"></script>
<title>校园修缮系统</title>
</head>
<body>
<%-- <div class="main-header">
  <div class="container-fuild bg-info">
    <div class="pic">
      <img src="/images/logo.png" alt="logo..." class="img-circle">
    </div>
    <div class="LoginRegist">
    <%
    	
    %>
      Welcome:${current_student}
    </div>
  </div>
</div>


<div class="content-wrap">
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <!-- Brand and toggle get grouped for better mobile display -->
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">Brand</a>
      </div>

      <!-- Collect the nav links, forms, and other content for toggling -->
      <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
        <ul class="nav navbar-nav navbar-right">
          <li><a href="#">notice</a></li>
          <li><a href="#">news</a></li>
          <li><a href="#">advise</a></li>
          <li><a href="#">about us</a></li>
        </ul>
      </div>
    </div>
  </nav>

  <div class="container-fuild body">
    <div class="menus">
      <div class="container-fluid">
        <div class="row">
          <ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
            <li>
              <a href="#systemSetting" class="nav-header collapsed" data-toggle="collapse">
            	  个人信息
              <span class="pull-right glyphicon glyphicon-chevron-down"></span>
              </a>
              <ul id="systemSetting" class="nav nav-list collapse secondmenu" style="height: 0px;">
                <li><a href="#">修改个人信息</a></li>
                <li><a href="#">修改密码</a></li>
              </ul>
            </li>
            <li><a href="#">报修 </a></li>
            <li><a href="#">历史记录</a></li>
          </ul>
        </div>
      </div>
    </div>

    <div class="mainbody">
      
    </div>

    <div style="clear:both;"></div>
  </div>
</div> --%>
<%@ include file="/WEB-INF/pages/pageHeader.jsp" %>

<%@ include file="/WEB-INF/pages/pageBottom.jsp" %>
</body>
</html>