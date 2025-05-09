package com.mkyong.controller;

import com.model.Order;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping("/orders/{id}")
    public List<Order> getOrder(@PathVariable int id){
        Order order1 = new Order();
        order1.setOrderId(1);
        order1.setStatus("In Progress");

        Order order2 = new Order();
        order1.setOrderId(1);
        order2.setStatus("Payment Completed");
        System.out.println("get orders called"+id);
        return Arrays.asList(order1,order2);
    }

}
