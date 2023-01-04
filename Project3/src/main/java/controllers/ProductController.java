package controllers;

import org.springframework.stereotype.Component;
import servises.ProductService;

@Component
public class ProductController {
    private ProductService productService;
    public void addProduct(){
        productService.addProduct();
    }
}
