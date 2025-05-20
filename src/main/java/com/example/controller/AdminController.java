package com.example.controller;

import com.example.service.CategoryService;
import jakarta.servlet.http.HttpSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import com.example.model.Category;
import lombok.Getter;
import org.thymeleaf.util.ObjectUtils;

@Controller
public class AdminController {

    @Autowired
    private CategoryService categoryService;

    @GetMapping("/admin")
    public String index(){
        return "admin/index";
    }

    @GetMapping("/loadAddProduct")
    public String loadAddProduct(){
        return "admin/add_product";
    }

    @GetMapping("/category")
    public String category(){
        return "admin/category";
    }

//    @PostMapping("/saveCategory")
//    public String savCategory(@ModelAttribute Category category, HttpSession session){
//        Boolean existCategory = categoryService.existCategory(Category.getName());
//        if (existCategory){
//            session.setAttribute("error", "Category already exist");
//        }
//        else{
//            category saveCategory = categoryService.saveCategory(category);
//            if (ObjectUtils.isEmpty(saveCategory)){
//                session.setAttribute("error", "Category not saved");
//            }
//            else {
//                session.setAttribute("success", "Category saved successfully");
//            }
//        }
//        categoryService.saveCategory(category);
//        return "redirect:/category";
//    }
}
