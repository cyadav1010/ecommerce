package com.chandan.ecom.services;

import com.chandan.ecom.dao.OrderDao;
import com.chandan.ecom.entity.Order;
import com.chandan.ecom.entity.OrderItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Optional;

@Component
public class OrderService {

    @Autowired
   private OrderDao orderDao;

    public void createOrder(Order orderRequest) {
        orderDao.save(orderRequest);
       // return "order created successfully";
    }

    public List<Order> getAllOrder() {
        return orderDao.findAll();
    }

    public void addItemToCart(Integer id, OrderItem item) {
        Optional<Order> orders = orderDao.findById(id);
        System.out.println("orders = " + orders);

        if(orders.isPresent()){
            Order order = orders.get();
            List<OrderItem> orderItems = order.getOrderItems();
            orderItems.add(item);
            order.setOrderItems(orderItems);
            orderDao.save(order);
        }
    }

    public Optional<Order> viewCart(Integer id) {
        Optional<Order> orders=orderDao.findById(id);
        return orders;
    }
}
