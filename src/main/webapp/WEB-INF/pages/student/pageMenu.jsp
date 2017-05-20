<%@page import="com.tangzh.domain.Admin"%>
<%@page import="com.tangzh.domain.Student"%>
<%@ page language="java" contentType="text/html;charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt"  prefix="fmt"%>

<link rel="stylesheet" href="<c:url value='/css/pageMenu.css'/>">	

      <div class="menus">
      <div class="container-fluid">
        <div class="row">
          <ul id="main-nav" class="nav nav-tabs nav-stacked" style="">
            <li>
              <a href="#personalInfo" class="nav-header collapsed" data-toggle="collapse">
            	  个人信息
              <span class="pull-right glyphicon glyphicon-chevron-down"></span>
              </a>
              <ul id="personalInfo" class="nav nav-list collapse secondmenu" style="height: 0px;">
                <li><a href="<c:url value='/student/showInfo.do'/>">我的信息</a></li>
                <li><a href="<c:url value='/page/changeInfo.do'/>">修改个人信息</a></li>
                <li><a href="<c:url value='/page/changePassword.do'/>">修改密码</a></li>
              </ul>
            </li>
            
            <li>
              <a href="#myRepair" class="nav-header collapsed" data-toggle="collapse">
            	  我的报修
              <span class="pull-right glyphicon glyphicon-chevron-down"></span>
              </a>
              <ul id="myRepair" class="nav nav-list collapse secondmenu" style="height: 0px;">
                <li><a href="<c:url value='/page/sendRepair.do'/>">我要报修</a></li>
                <li><a href="<c:url value='/page/repairHistory.do'/>">报修历史</a></li>
              </ul>
            </li>
          </ul>
        </div>
      </div>
    </div>


