package com.chandan.ecom.resources;

import com.chandan.ecom.entity.Order;
import com.chandan.ecom.entity.OrderItem;
import com.chandan.ecom.services.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/orders")
public class OrderResource {

    @Autowired
    private OrderService orderService;

    @PostMapping
    public String placeOrder(@RequestBody Order orderRequest){
        System.out.println("order = " + orderRequest);
        orderService.createOrder(orderRequest);
        return "order placed SuccessFuly";
    }

    @GetMapping
    public List<Order> getAllOrders(){
      return orderService.getAllOrder();
    }

    @PostMapping("/addItem/{id}")
    public String addItemToCart(@PathVariable Integer id, @RequestBody OrderItem orderRequest){
        System.out.println("order = " + orderRequest);
        orderService.addItemToCart(id,orderRequest);
        return "item added SuccessFuly to cart";
    }

    @GetMapping("/viewCart/{id}")
    public Optional<Order> viewCart(@PathVariable Integer id){
        System.out.println("id = " + id);
       return orderService.viewCart(id);
    }

}
