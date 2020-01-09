package com.hzit.controller;

import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.context.request.SessionScope;
import org.springframework.web.context.request.WebRequest;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

@Controller
public class OrderController {
    @Value("${exchange-order}")
    private String exchange;
    @Autowired
    private RabbitTemplate rabbitTemplate;
    @Autowired
    private RedisTemplate redisTemplate;
    @RequestMapping("order")
    public String order(WebRequest request){
        Map result = new HashMap<>();
        String orderNo = UUID.randomUUID().toString();
        //将秒杀成功的订单放入rabbitMQ  （将此订单入库）
        result.put("code", 0);//正常
        result.put("msg", "已生成订单");
        result.put("orderNo", orderNo);
        Map<String, Object> data = new HashMap<>();
        data.put("orderNo", orderNo);
        data.put("userid",request.getAttribute("usrid", WebRequest.SCOPE_SESSION) );
       //总额从redis中查询
       //long i= redisTeplate.opsForList().size(1);
          redisTemplate.opsForHash().get("1",1);

        data.put("total",1);
        rabbitTemplate.convertAndSend(exchange, null, data);
        return orderNo;
    }
}
