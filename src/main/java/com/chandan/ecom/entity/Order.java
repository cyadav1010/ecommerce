package com.chandan.ecom.entity;

import lombok.*;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@ToString
@Table(name = "orders")
public class Order {
    @Id
    @GeneratedValue
    private int id;
    private String status;
    private String user;
    @OneToMany(targetEntity = OrderItem.class,cascade = CascadeType.ALL)
    @JoinColumn(name = "order_fk",referencedColumnName = "id")
    private List<OrderItem>orderItems;

}
