package com.spring.model;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Brand {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bra_cat",joinColumns={
		@JoinColumn(name="brand_id") } , inverseJoinColumns={
				@JoinColumn(name="cat_id")})
	private List<Category> catogries=new ArrayList<>();
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bra_product",joinColumns={
		@JoinColumn(name="brand_id") } , inverseJoinColumns={
				@JoinColumn(name="product_id")})
	private List<Products> products=new ArrayList<>();
	
	
	
	
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public List<Category> getCatogries() {
		return catogries;
	}
	public void setCatogries(List<Category> catogries) {
		this.catogries = catogries;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	

}
