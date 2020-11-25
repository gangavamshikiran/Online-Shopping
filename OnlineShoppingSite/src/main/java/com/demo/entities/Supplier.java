package com.demo.entities;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Supplier {
	
	@Column(unique = true)
	@Id
	private String supplierName;
	private Double itemPrice;
	
	@ManyToOne(cascade = CascadeType.ALL)
	@JoinColumn(name = "itemId", nullable = false)
	private Item item;
	
	public Supplier() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Supplier(String supplierName, Double itemPrice, Item item) {
		super();
		this.supplierName = supplierName;
		this.itemPrice = itemPrice;
		this.item = item;
	}

	public String getSupplierName() {
		return supplierName;
	}

	public void setSupplierName(String supplierName) {
		this.supplierName = supplierName;
	}

	public Double getItemPrice() {
		return itemPrice;
	}

	public void setItemPrice(Double itemPrice) {
		this.itemPrice = itemPrice;
	}

	public Item getItem() {
		return item;
	}

	public void setItem(Item item) {
		this.item = item;
	}

	@Override
	public String toString() {
		return "Supplier [supplierName=" + supplierName + ", itemPrice=" + itemPrice + ", item=" + item + "]";
	}
	
	
	
}
