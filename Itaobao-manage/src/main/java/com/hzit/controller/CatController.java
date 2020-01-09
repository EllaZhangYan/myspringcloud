package com.hzit.controller;

import com.hzit.Item;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.context.request.WebRequest;

import java.util.List;

@Controller
public class CatController {
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("login")
    @ResponseBody
    public String login(String username,String userid, WebRequest request) {
        request.setAttribute("username", username, WebRequest.SCOPE_SESSION);
        request.setAttribute("userid", userid, WebRequest.SCOPE_SESSION);
        return "登录成功" + username;
    }

    @GetMapping("addcart")
    @ResponseBody
    public String addcart(WebRequest request, String id,String name, int price) {
        String username = (String) request.getAttribute("username", WebRequest.SCOPE_SESSION);
      System.out.println(name+":"+price);
        if(username==null){
          return "请先登录";
        }
        else{
            //将商品的id做为key值  存入redis中
            Item i=new Item(1,"电脑",1,1);
            Item i2=new Item(1,"电脑2",1,1);
            //redisTemplate.opsForList().rightPush(id,name);
            //存储当前用户的购物车信息001当前用户的id
            redisTemplate.boundHashOps("001").put("items",i);
            i.setCount(2);
            redisTemplate.boundHashOps("001").put("items",i);
            redisTemplate.boundHashOps("001").put("items2",i2);
            redisTemplate.boundHashOps("001").get("items");
          //redisTemplate.boundHashOps("001","items").get("items");
            Item item= (Item)(redisTemplate.boundHashOps("001").get("items"));
          System.out.println(item);
          return "添加成功";
        }

    }

}
