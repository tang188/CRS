<%@ page language="java" contentType="text/html;charset=UTF-8" pageEncoding="UTF-8" isELIgnored="false"%>
<%@ include file="/WEB-INF/pages/common.jsp" %>

<!DOCTYPE html>
<html>
	<head>
		<title>校园修缮系统</title>
		<meta charset="utf-8">
		<meta http-equiv="keywords" content="校园修缮系统">
		<meta http-equiv="description" content="校园修缮系统">
		<meta http-equiv="X-UA-Compatible" content="IE=edge">
		<meta name="viewport" content="width=device-width, initial-scale=1">
		<link rel="shortcut icon" href="<c:url value='/images/favicon.ico'/>" type="image/x-icon"/>
		
		<link rel="stylesheet" href="<c:url value='/css/register.css'/>">		
		<script type="text/javascript" src="<c:url value='/js/register.js'/>"></script>
	</head>
	<body >
	<div class="modal-dialog" >
			<div class="modal-content" style="min-height: 680px;" >
				<div class="modal-header">
					<h4 class="modal-title text-center" id="myModalLabel">快速注册</h4>
				</div>
				<div class="modal-body">
					<img src="/images/head portrait.jpg"
						class="img-responsive center-block" alt="register head portrait">
					<form class="form-horizontal" action="<c:url value='/register/register.do'/>"
						method="post">
						<div class="form-group">
							<div class="col-xs-1 col-xs-offset-3 text-right">
								
							</div>
							<div class="col-xs-6">账号
								<input type="text" class="form-control" id="registerInputNum"
									name="account">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-1 col-xs-offset-3 text-right">
								
							</div>
							<div class="col-xs-6">姓名
								<input type="text" class="form-control" id="registerInputName"
									name="name">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-1 col-xs-offset-3 text-right">
								
							</div>
							<div class="col-xs-6">密码
								<input type="password" class="form-control"
									id="registerInputPassword" name="password">
							</div>
						</div>
						<div class="form-group">
							<div class="col-xs-1 col-xs-offset-3 text-right">
								
							</div>
							<div class="col-xs-6">重复密码
								<input type="password" class="form-control"
									id="registerInputPasswordAgain" name="password1">
							</div>
						</div>

						<div class="form-group">
							<div class="col-xs-1 col-xs-offset-3 text-right">
								
							</div>
							<div class="col-xs-6">电话
								<input type="text" class="form-control" id="registerInputTel"
									name="tel">
							</div>
						</div>
						
						<div class="form-group">
						<div class="col-xs-1 col-xs-offset-3 text-right">
							
						</div>
						<div class="col-xs-3">
							<input name="verifiedCode" type="text" class="form-control" id="registerInputIdentifyingCode" placeholder="验证码">
						</div>
						<div class="col-xs-2"  style="padding-left:0">
							<img id="verifiedCodeImg" src="<c:url value='/page/verifiedCode.do'/>">
						</div>
						</div>
						
						<div class="form-group">
							<div class="col-xs-1 col-xs-offset-3 text-right">
								
							</div>
							<div class="col-xs-6">
								<span style="color: red">${message}</span>			
							</div>
						</div>
						
						<div class="radio col-xs-4 col-xs-offset-4">
							<label> <input type="radio" name="register_radios"
								id="registerRadios1" value="1" checked> 学生&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
							 <input type="radio" name="register_radios"
								id="registerRadios2" value="2"> 管理员
							</label>						
						</div>
						<button class="btn btn-default col-xs-3 col-xs-offset-3"
							type="submit">提交</button>
						<button class="btn btn-default col-xs-3 col-xs-offset-1" 
							 onclick="javascript:history.go(-1)">取消</button>
					</form>
				</div>
			</div>
		</div>
	</body>
</html>
