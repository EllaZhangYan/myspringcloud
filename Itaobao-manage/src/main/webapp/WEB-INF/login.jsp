<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
	String path = request.getContextPath();
	request.setAttribute("path", path);
%>
<html>
<head>
	<meta charset="utf-8">
	<title>鲨鱼平台在线管理系统</title>
	<meta name="renderer" content="webkit">
	<meta http-equiv="X-UA-Compatible" content="IE=edge,chrome=1">
	<meta name="viewport" content="width=device-width, initial-scale=1.0, minimum-scale=1.0, maximum-scale=1.0, user-scalable=0">
	<link rel="stylesheet" href="${path}/layui/css/layui.css" media="all">
	<link rel="stylesheet" href="${path}/layui/css/login.css" media="all">
	<link rel="stylesheet" href="${path}/layui/css/admin.css" media="all">
	<style>

	</style>
</head>
<body style="background:url('${path}/img/bg2.jpg') no-repeat;background-size: auto 1300px " >
<div class="layadmin-user-login layadmin-user-display-show" id="LAY-user-login">
	<form class="layui-form" action="${path}/login" method="get">
	<div class="layadmin-user-login-main" >
		<div class="layadmin-user-login-box layadmin-user-login-header">

			<p style="font-size: 30px;color:#ffffff">小金鱼平台在线管理系统</p></p>
		</div>
		<div class="layadmin-user-login-box layadmin-user-login-body layui-form"  >
			<div class="layui-form-item">
				<label class="layadmin-user-login-icon layui-icon layui-icon-username" for="LAY-user-login-username"></label>
				<input type="text" name="username" id="LAY-user-login-username" lay-verify="required" placeholder="用户名" class="layui-input">
			</div>
			<div class="layui-form-item">
				<label class="layadmin-user-login-icon layui-icon layui-icon-password" for="LAY-user-login-password"></label>
				<input type="password" name="password" id="LAY-user-login-password" lay-verify="required" placeholder="密码" class="layui-input">
			</div>

			<div class="layui-form-item"  style="height:20" >
				<input type="checkbox" name="remember" lay-skin="primary" title="记住密码">
				<a href="forget.html" class="layadmin-user-jump-change layadmin-link" style="margin-top: 7px;">忘记密码？</a>
			</div>
			<div class="layui-form-item" >
				<input type="submit" class="layui-btn layui-btn-fluid" lay-submit="" lay-filter="LAY-user-login-submit" value="登录">
			</div>

		</div>
	</div>
	</form>
	<div class="layui-trans layadmin-user-login-footer">

		<p>© 2018 <a href="http://www.layui.com/" target="_blank">鲨鱼权限管理系统</a></p>

	</div>



</div>

<script src="${path}/layui/layui.all.js"></script>
<script>

</script>
</body>
</html>