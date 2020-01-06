<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%> 
    <%@ page import="java.util.List" %>
    <%
	String path = request.getContextPath();
	request.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
  <meta charset="utf-8">
  <title>商品管理后台页面</title>
 <link rel="stylesheet"  href="${path}/static/layui/css/layui.css">
</head>
<body class="layui-layout-body">
 
<div class="layui-layout layui-layout-admin">
  <div class="layui-header">
    <div class="layui-logo">
     <img src="${path}/static/layui/images/2.ico" class="layui-nav-img">
        商品管理后台页面</div>
    <!-- 头部区域（可配合layui已有的水平导航） -->
    <ul class="layui-nav layui-layout-left">
      <li class="layui-nav-item"><a href="">控制台</a></li>
      <li class="layui-nav-item"><a href="">商品管理</a></li>
      <li class="layui-nav-item"><a href="">用户</a></li>
      <li class="layui-nav-item">
        <a href="javascript:;">其它系统</a>
        <dl class="layui-nav-child">
          <dd><a href="">邮件管理</a></dd>
          <dd><a href="">消息管理</a></dd>
          <dd><a href="">授权管理</a></dd>
        </dl>
      </li>
    </ul>
    <ul class="layui-nav layui-layout-right">
      <li class="layui-nav-item">
        <a href="javascript:;">
          <img src="${path}/static/layui/images/1.ico" class="layui-nav-img">
          ${username}
        </a>
        <dl class="layui-nav-child">
          <dd><a href="">基本资料</a></dd>
          <dd><a href="">安全设置</a></dd>
        </dl>
      </li>
      <li class="layui-nav-item"><a href="${path}/loginOut">退出</a></li>
    </ul>
  </div>
  
  <div class="layui-side layui-bg-black">
    <div class="layui-side-scroll">
      <!-- 左侧导航区域（可配合layui已有的垂直导航） -->
      <ul class="layui-nav layui-nav-tree"  lay-filter="test">

        <li class="layui-nav-item">
          <a href="#"  >商品管理</a>
          <dl class="layui-nav-child">
          <!-- 一般a 链接 controller -->
            <dd><a href="${path}/role/index" target="main">新增商品</a></dd>
            <dd><a href="javascript:;">查询商品</a></dd>
              <dd><a href="javascript:;">规格参数</a></dd>
          </dl>
        </li>
       <li class="layui-nav-item">
          <a href="javascript:;">网站内容管理</a>
          <dl class="layui-nav-child">
            <dd><a href="javascript:;">内容分类管理</a></dd>
            <dd><a href="javascript:;">内容管理</a></dd>
          </dl>
        </li>
      </ul>
    </div>
  </div>
  
  <div class="layui-body">
    <!-- 内容主体区域 -->
    <div style="padding: 15px;">
    <iframe name="main" height="800px" width="800px" frameborder="0"></iframe>
</div>
  </div>
  
  <div class="layui-footer">
    <!-- 底部固定区域 -->
    © layui.com - 底部固定区域
  </div>
</div>
<script src="${path}/static/layui/layui.js"></script>
<script>
//JavaScript代码区域
layui.use('element', function(){
  var element = layui.element;
  
});
</script>
</body>
</html>