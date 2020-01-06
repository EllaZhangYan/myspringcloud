<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<!--  -->
<title>Insert title here</title>
<link rel="stylesheet" href="${pageContext.request.contextPath}/layui/css/layui.css">
</head>
<body>
 
<div class="layui-container">  
  <div class="layui-row" >
    <div class="layui-col-md3"  >
    <!-- 左边垂直导航栏 -->
    <ul class="layui-nav layui-nav-tree" lay-filter="test">
   <li class="layui-nav-item layui-nav-itemed">
    <a href="#" >用户管理</a>
    <dl class="layui-nav-child">
      <dd><a href="user.jsp" target="main"">用户列表</a></dd>
      <dd><a href="javascript:;">新增用户</a></dd>
      <dd><a href="javascript:;">删除用户</a></dd>
      <dd><a href="javascript:;">修改用户</a></dd>
    </dl>
  </li>
  <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">角色管理</a>
    <dl class="layui-nav-child">
      <dd><a href="javascript:;">角色列表</a></dd>
      <dd><a href="javascript:;">角色添加</a></dd>
      <dd><a href="javascript:;">删除角色</a></dd>
      <dd><a href="javascript:;">修改角色</a></dd>
      
    </dl>
  </li>
   <li class="layui-nav-item layui-nav-itemed">
    <a href="javascript:;">权限管理</a>
    <dl class="layui-nav-child">
      <dd><a href="javascript:;">角权限列表</a></dd>
      <dd><a href="javascript:;">权限添加</a></dd>
      <dd><a href="javascript:;">删除权限</a></dd>
      <dd><a href="javascript:;">修改权限</a></dd>
    </dl>
  </li>
  </ul>
    </div>
    <div class="layui-col-md9"  >
     <iframe name="main" height="800px" width="800px" frameborder="0"></iframe>
    </div>
  </div>
 </div>
<script type="text/javascript" src="layui/layui.all.js"></script>
<script>
 
</script> 
</body>
</html>