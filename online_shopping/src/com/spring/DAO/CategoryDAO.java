/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.spring.DAO;

import java.util.List;

import com.spring.model.Category;
 

/**
 *
 * @author AhmedEldeeb
 */
public interface CategoryDAO {
    
    public void addCategory(Category cat);   
    public List<Category> ListCategory();
    public Category getCategory(int id);
}
