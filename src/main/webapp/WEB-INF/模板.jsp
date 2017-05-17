<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/pages/common.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<title>万才网</title>
		<meta charset="utf-8">
		<meta http-equiv="keywords" content="校园修缮系统">
		<meta http-equiv="description" content="校园修缮系统">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="shortcut icon" href="<c:url value='/images/favicon.ico'/>" type="image/x-icon"/>
		
		<link rel="stylesheet" href="<c:url value='/css/模板.css'/>">		
		<script type="text/javascript" src="<c:url value='/js/模板.js'/>"></script>
	</head>
	<body>
<div class="main">
    <div class="row">
      <span class="col-sm-offset-6">快速注册</span>
      <form class="form-horizontal">
        <div class="form-group">
          <label for="inputId" class="col-sm-4 control-label">帐号：</label>
          <div class="col-sm-8">
            <input type="text" class="form-control" id="inputId" placeholder="请输入账号">
          </div>
        </div>
        <div class="form-group">
          <label for="inputName" class="col-sm-4 control-label">姓名：</label>
          <div class="col-sm-8">
            <input type="text" class="form-control" id="inputName" placeholder="请输入姓名">
          </div>
        </div>
        <div class="form-group">
          <label for="inputPassword" class="col-sm-4 control-label">密码：</label>
          <div class="col-sm-8">
            <input type="password" class="form-control" id="inputPassword" placeholder="请输入密码">
          </div>
        </div>
        <div class="form-group">
          <label for="inputPassword1" class="col-sm-4 control-label">重复密码：</label>
          <div class="col-sm-8">
            <input type="password" class="form-control" id="inputPassword1" placeholder="请再次输入密码">
          </div>
        </div>
        <div class="form-group">
          <label for="inputTel" class="col-sm-4 control-label">电话：</label>
          <div class="col-sm-8">
            <input type="text" class="form-control" id="inputTel" placeholder="请输入电话">
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-6 col-sm-6">
            <div class="checkbox">
              <label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio1" value="option1" checked>学生
              </label>
              <label class="radio-inline">
                <input type="radio" name="inlineRadioOptions" id="inlineRadio2" value="option2">管理员
              </label>
            </div>
          </div>
        </div>
        <div class="form-group">
          <div class="col-sm-offset-5 col-sm-7">
            <button type="submit" class="btn btn-default">完成</button>
            <button type="button" class="btn btn-default  col-sm-offset-5">取消</button>
          </div>
        </div>
      </form>
    </div>
  </div>
	</body>
</html>
