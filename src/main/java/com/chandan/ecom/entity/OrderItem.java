package com.chandan.ecom.entity;

import lombok.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
@Data
public class OrderItem {
    @Id
    private int orderItemId;
    private String prodName;
    private int qty;
    private int price;
}
