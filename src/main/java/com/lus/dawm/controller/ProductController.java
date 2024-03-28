package com.lus.dawm.controller;

import com.lus.dawm.model.Produit;
import com.lus.dawm.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/admin/product/")
public class ProductController {
    @Autowired
    private ProductService productService;
    @GetMapping("create")
    public String create(Model model){
        model.addAttribute("product", new Produit());
        return "admin/product/create";
    }
    @GetMapping("add")
    public String add(@ModelAttribute Produit product){
        return "redirect:create";
    }
    @GetMapping("list")
    public String listProducts(Model model){
        List<Produit> products = productService.getAllProducts();
        model.addAttribute("products", products);
        return "admin/product/list";
    }
}
