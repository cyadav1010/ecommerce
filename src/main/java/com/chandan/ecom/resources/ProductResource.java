package com.chandan.ecom.resources;

import com.chandan.ecom.entity.Product;
import com.chandan.ecom.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductResource {

    @Autowired
    ProductService productService;

    //list of catalog
    @GetMapping
    public List<Product> getAllProduct(){
       return productService.getAllProductsDetails();
    }

    @PostMapping
    public List<Product> createProduct(@RequestBody Product product){
         productService.createProduct(product);
         return productService.getAllProductsDetails();
    }

}
