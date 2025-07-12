package com.example.productcatalog.controller;

import com.example.productcatalog.entity.Product;
import com.example.productcatalog.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping("/")
    public String home() {
        return "home";
    }

    @GetMapping("/add")
    public String addProductForm(Model model) {
        model.addAttribute("product", new Product());
        return "add-product";
    }

    @PostMapping("/add")
    public String submitProduct(@ModelAttribute Product product) {
        productService.saveProduct(product);
        return "redirect:/display";
    }

    @GetMapping("/display")
    public String displayProducts(Model model) {
        List<Product> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "display-products";
    }
}
