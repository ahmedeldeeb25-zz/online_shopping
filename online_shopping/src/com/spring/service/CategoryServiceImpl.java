/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
 
package com.spring.service;
 
import java.util.List;
 
 
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.spring.DAO.CategoryDAO;
import com.spring.model.Category;

/**
 *
 * @author AhmedEldeeb
 */
@Service
public class CategoryServiceImpl implements CategoryService {
    
    private CategoryDAO categoryDAO;

	public void setCategoryDAO(CategoryDAO categoryDAO) {
		this.categoryDAO = categoryDAO;
	}

     
    @Transactional
    public void addCategory(Category cat) {
        this.categoryDAO.addCategory(cat);
    }

    
    @Transactional
    public List<Category> ListCategory() {
        return this.categoryDAO.ListCategory();
    }

     
    @Transactional
    public Category getCategory(int id) {
        return this.categoryDAO.getCategory(id);
    }
    
}
