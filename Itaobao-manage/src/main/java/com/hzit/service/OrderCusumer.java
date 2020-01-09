package com.hzit.service;

import com.hzit.Order;
import org.springframework.amqp.core.ExchangeTypes;
import org.springframework.amqp.rabbit.annotation.*;
import org.springframework.messaging.handler.annotation.Payload;
import org.springframework.stereotype.Component;

import java.util.Map;

@Component
@RabbitListener(bindings=@QueueBinding(value=@Queue("${queue-order}"),
exchange=@Exchange(value="${exchange-order}",type=ExchangeTypes.FANOUT)
))
public class OrderCusumer {

	@RabbitHandler
  public void process(@Payload Map<String, Object> data) {
	  //从消息队列中取出订单号 等相关信息  进行订单入库
		//System.out.println("取出的订单号是"+data.get("orderNo"));
		//System.out.println("取出的用户id是"+data.get("userid"));
		//支付操作 （TODO）
		//将订单入库(异步操作)
		Order order = new Order();
		order.setOrderno(data.get("orderNo").toString());
		order.setUserid(data.get("userid").toString());
		order.setRecname("曾德兵");
		order.setPostage("0");
		order.setRecaddr("华美居");
		order.setRecphone("123456");
	   //增加入库操作
System.out.println("如可成功");
		
		
  }
}
