package com.s;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

@Controller
public class CartController {
    @Autowired
    private RedisTemplate redisTemplate;
    @GetMapping("cart")
    public String cart(){
        return "cart";
    }
    @GetMapping("login")
    @ResponseBody
    public String login(String username,WebRequest request){
        //假设已经从数据库验证成功 此用户存在
        //将用户信息放入session中
        request.setAttribute("username",username,WebRequest.SCOPE_SESSION);
        request.setAttribute("userid","u001",WebRequest.SCOPE_SESSION);
        return "登录成功" ;
    }
    @GetMapping("addcart")
    @ResponseBody
    public String addCart(WebRequest request,String name,int price,int id){
      Object user= request.getAttribute("username",WebRequest.SCOPE_SESSION);
        //验证用户是否登录  ？用户名 session    分布式session
        if(user!=null){
            //说明已经登录了，可以加入购物车
            //一个userid 拥有一个购物车  可以购买很多的商品  Map
            //(TODO)  将商品信息放入购物车中
            Item item = new Item(1,"电脑",1,8999);
            Item item2 = new Item(2,"手机",1,2999);
            // map   key field  value
            redisTemplate.boundHashOps("u001").put("items",item);
            redisTemplate.boundHashOps("u001").put("phone",item2);
            //查看redis 存储的信息
            //Item i=(Item)redisTemplate.boundHashOps("u001").get("items");
            //System.out.println("item中存储值"+item);
            //生成订单，rabbitMQ
            //修改购物车商品数量
            //Item i=(Item)redisTemplate.boundHashOps("u001").get("items");
            // redisTemplate.boundHashOps("u001").put("items",item);
            return "添加成功";
        }
        else{
            return "请先登录";
        }

    }
}
