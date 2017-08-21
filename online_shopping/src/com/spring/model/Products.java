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
public class Products {
	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	private String name;
	
	private String price;
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="bra_product",joinColumns={
		@JoinColumn(name="product_id") } , inverseJoinColumns={
				@JoinColumn(name="brand_id")})
	private List<Brand> brands=new ArrayList<>();
	
	
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cust_products",joinColumns={
		@JoinColumn(name="product_id") } , inverseJoinColumns={
				@JoinColumn(name="customer_id")})
	private List<Customer> customers=new ArrayList<>();
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cart_products",joinColumns={
		@JoinColumn(name="product_id") } , inverseJoinColumns={
				@JoinColumn(name="cart_item_id")})
	private List<Cart_item> cartItems=new ArrayList<>();


	public List<Cart_item> getCartItems() {
		return cartItems;
	}


	public void setCartItems(List<Cart_item> cartItems) {
		this.cartItems = cartItems;
	}


	public List<Customer> getCustomers() {
		return customers;
	}


	public void setCustomers(List<Customer> customers) {
		this.customers = customers;
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


	public String getPrice() {
		return price;
	}


	public void setPrice(String price) {
		this.price = price;
	}


	public List<Brand> getBrands() {
		return brands;
	}


	public void setBrands(List<Brand> brands) {
		this.brands = brands;
	}
	
	
	

}
