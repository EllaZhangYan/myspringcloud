<%--
  Created by IntelliJ IDEA.
  User: ThinkPad
  Date: 2020/1/9
  Time: 14:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" href="/static/layui/css/layui.css">
</head>
<body>
<div class="layui-col-xs12 layui-col-sm6 layui-col-md6">
    <img  src="/static/img/computer.jpg">
</div>
<div class="product_info">
    <input type="hidden" id="productId" value="9">
    <p class="title size1">微软（Microsoft）新Surface Pro 二合一平板电脑 12.3英寸（Intel Core i5 8G内存 256G存储 ）</p>
    <hr class="layui-bg-red">
    <p class="price size2">商城价：<span class="price1 size3">8999.0</span></p>
    <hr class="layui-bg-red">
    <p class="price size2">市场价：<span class="">9999.0</span></p>
    <hr class="layui-bg-red">
    <p><button onclick="addCart()" class="layui-btn layui-btn-lg layui-btn-radius layui-btn-danger">加入购物车</button></p>
</div>
<script src="/static/layui/layui.js"></script>
<script type="text/javascript">
    function addCart(){
        window.location.href="addcart?name=computer&price=8999&id=1" ;
    }
</script>
</body>
</html>
