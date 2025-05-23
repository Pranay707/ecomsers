package com.example.service;


import com.example.model.Category;

import java.util.List;

public interface CategoryService {

    public Category saveCategory(Category category);

    public Boolean existCategory(String name);

    public List<Category> getAllCategory();
}
