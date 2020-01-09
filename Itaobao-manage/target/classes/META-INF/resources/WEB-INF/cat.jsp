<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%
    String path = request.getContextPath();
    request.setAttribute("path", path);
%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Insert title here</title>
    <link rel="stylesheet"  href="${path}/static/layui/css/layui.css">
</head>
<body>
<img class="product_img img_responsive" src="${path}/static/img/computor.jpg">
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

<script src="${path}/static/layui/layui.js"></script>
<script>
    //JavaScript代码区域
    layui.use('element', function(){
        var element = layui.element;

    });
    function addCart(){
        window.location.href="${path}/addcart?id=1&name=平板电脑&price=8999" ;
    }
</script>
</body>
</html>
</html>
