<%@page import="com.tangzh.domain.Admin"%>
<%@page import="com.tangzh.domain.Student"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<link rel="stylesheet" href="<c:url value='/css/pageHeader.css'/>">	
<script type="text/javascript" src="<c:url value='/js/pageHeader.js'/>"></script>

<style>
.system{
	position:absolute;
	top:10%;left:35%;right:30%;
	bottom: 10%;	
}

#mTitle{
	font-size:5rem;
	font-weight:bolder;
}
</style>
 

<div class="main-header">
  <div class="container-fuild bg-info">
    <div class="pic">
      <img src="/images/logo.png" alt="logo..." class="img-circle">
    </div>
    
    <div class="system">
    	<div id="mTitle">校 园 修 缮 系 统</div>
    </div>
    
    <div class="LoginRegist">
			<%
				Object obj = request.getSession().getAttribute("current_student");
				Object obj2 = request.getSession().getAttribute("current_admin");
				if(obj!=null){
					String userName = ((Student)obj).getName();
			%>
					<span style="color: #3591E3;">欢迎你，<%=userName %></span> / 
					<a href="<c:url value='/page/logout.do'/>">注销</a>
			<%
				}else if(obj2!=null){
					String compName = ((Admin)obj2).getName();
			%>
					<span style="color: #3591E3;">欢迎你，<%=compName %></span> / 
					<a href="<c:url value='/page/logout.do'/>">注销</a>
			<%		
				}
			%>
			<br>
			<label id="timeShow">
			</label>
    </div>
  </div>
</div>

<div class="content-wrap">
  <nav class="navbar navbar-default">
    <div class="container-fluid">
      <div class="navbar-header">
        <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1" aria-expanded="false">
          <span class="sr-only">Toggle navigation</span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
          <span class="icon-bar"></span>
        </button>
        <a class="navbar-brand" href="#">广东工业大学</a>
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
</div>


