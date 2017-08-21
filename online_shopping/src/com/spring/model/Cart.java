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
public class Cart {

	
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id;
	
	private int total_cost;
	@ManyToMany(cascade=CascadeType.ALL)
	@JoinTable(name="cart_c_items",joinColumns={
		@JoinColumn(name="cart_id") } , inverseJoinColumns={
				@JoinColumn(name="c_item_id")})
	private List<Cart_item> cart_items=new ArrayList<>();
	

	public List<Cart_item> getCart_items() {
		return cart_items;
	}

	public void setCart_items(List<Cart_item> cart_items) {
		this.cart_items = cart_items;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getTotal_cost() {
		return total_cost;
	}

	public void setTotal_cost(int total_cost) {
		this.total_cost = total_cost;
	}
	
}
