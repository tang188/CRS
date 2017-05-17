<%@page import="com.tangzh.domain.Admin"%>
<%@page import="com.tangzh.domain.Student"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<div class="main-header">
  <div class="container-fuild bg-info">
    <div class="pic">
      <img src="/images/logo.png" alt="logo..." class="img-circle">
    </div>
    
    <div >
    	<h1>校园修缮系统</h1>
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

<!--   <div class="container-fuild body">
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
	<div>
		MainBody
	</div>
    <div style="clear:both;"></div>
  </div> -->
  
</div>

<div class="main-footer">
  <div class="container-fuild">
    <div class="row">
      <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 text-center">
        <h3>Contact 联系我们</h3>
        <p>Tel/电话：188xxxxxxxx</p>
      </div>
      <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 text-center">
        <h3>Vision 版本标号</h3>
        <p>V/版本：Alpha 0.1</p>                
      </div>
      <div class="col-lg-4 col-md-4 col-sm-4 col-xs-12 text-center" id="copyright">
        <h3>Copyright 版权所有</h3>
        <p>广东工业大学计算机学院@tangzhihong版权所有</p>
      </div>
    </div>
  </div>
</div>
