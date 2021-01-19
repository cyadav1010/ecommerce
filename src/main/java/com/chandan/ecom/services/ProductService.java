package com.chandan.ecom.services;

import com.chandan.ecom.dao.ProductDao;
import com.chandan.ecom.entity.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ProductService {

    @Autowired
   private ProductDao productDao;

    public List<Product> getAllProductsDetails() {
       return productDao.findAll();
    }

    public void createProduct(Product product) {
        productDao.save(product);
    }
}
