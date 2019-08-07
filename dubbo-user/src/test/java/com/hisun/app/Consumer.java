package com.hisun.app;

import com.hisun.app.service.OrderService;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {
    public static void main(String[] args) throws Exception {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(new String[]{"META-INF/spring/UserService.xml"});
        context.start();
        // Obtaining a remote service proxy
        OrderService orderService = (OrderService)context.getBean("orderService");
        // Executing remote methods
        // Display the call result
        System.out.println(orderService.query(20190715));
    }
}
