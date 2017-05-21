<%@page import="com.tangzh.domain.Admin"%>
<%@page import="com.tangzh.domain.Student"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>

<link rel="stylesheet" href="<c:url value='/css/pageMenu.css'/>">

<div class="menus">
	<div class="container-fluid">
		<div class="row">
			<ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
				<li><a href="#adminInfo" class="nav-header collapsed"
					data-toggle="collapse"> 个人信息 <span
						class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="adminInfo" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<li><a href="<c:url value='/admin/adminInfo.do'/>">我的信息</a></li>
						<li><a href="<c:url value='/page/changeAdminInfo.do'/>">修改个人信息</a></li>
						<li><a href="<c:url value='/page/changeAdminPassword.do'/>">修改密码</a></li>
					</ul></li>

				<li><a href="<c:url value='/page/publish.do'/>" class="nav-header collapsed"> 发布 
				</a>
				</li>

				<li><a href="#repair" class="nav-header collapsed"
					data-toggle="collapse"> 维修模块 <span
						class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="repair" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<li><a href="#">分配工人</a></li>
						<li><a href="#">维修单</a></li>
					</ul></li>

				<li><a href="#studentManager" class="nav-header collapsed"
					data-toggle="collapse">用户管理<span
						class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="studentManager" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<li><a href="<c:url value='/page/sendRepair.do'/>">增加学生</a></li>
						<li><a href="<c:url value='/student/repairHistory.do'/>">删除学生</a></li>
					</ul></li>

				<li><a href="#worker" class="nav-header collapsed"
					data-toggle="collapse">工人管理<span
						class="pull-right glyphicon glyphicon-chevron-down"></span>
				</a>
					<ul id="worker" class="nav nav-list collapse secondmenu"
						style="height: 0px;">
						<li><a href="<c:url value='/page/sendRepair.do'/>">增加工人</a></li>
						<li><a href="<c:url value='/student/repairHistory.do'/>">删除工人</a></li>
					</ul></li>
			</ul>
		</div>
	</div>
</div>


