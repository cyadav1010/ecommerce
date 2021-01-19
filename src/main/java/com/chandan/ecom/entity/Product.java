package com.chandan.ecom.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Getter
@Setter
@Entity
@NoArgsConstructor
@ToString
public class Product {
    @Id
    @GeneratedValue
    int productId;
    String productName;
    int price;

}
