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
public class Cart_item {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int quantity;
	private int total_cost;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cart_c_items",joinColumns={
		@JoinColumn(name="c_item_id") } , inverseJoinColumns={
				@JoinColumn(name="cart_id")})
	private List<Cart> carts=new ArrayList<>();
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cart_products",joinColumns={
		@JoinColumn(name="cart_item_id") } , inverseJoinColumns={
				@JoinColumn(name="product_id")})
	private List<Products> products=new ArrayList<>();
	
	
	public List<Cart> getCarts() {
		return carts;
	}
	public void setCarts(List<Cart> carts) {
		this.carts = carts;
	}
	public List<Products> getProducts() {
		return products;
	}
	public void setProducts(List<Products> products) {
		this.products = products;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public int getTotal_cost() {
		return total_cost;
	}
	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	
	

}
