package com.demo.entities;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javax.persistence.CascadeType;
import javax.persistence.ElementCollection;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;

import com.sun.istack.NotNull;

@Entity
public class Item {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long itemId;
	
	@NotNull()
	private String itemName;
	
	@NotNull()
	private String description;
	
	@OneToMany(mappedBy = "item", cascade = CascadeType.ALL)
	private List<Supplier> suppliers = new ArrayList<Supplier>();
	
	@ElementCollection
	Map<String, String> specs = new HashMap<String, String>();
	
	public Item() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Item(Long itemId, String itemName, String description, List<Supplier> suppliers,
			HashMap<String, String> specs) {
		super();
		this.itemId = itemId;
		this.itemName = itemName;
		this.description = description;
		this.suppliers = suppliers;
		this.specs = specs;
	}

	public Long getItemId() {
		return itemId;
	}

	public void setItemId(Long itemId) {
		this.itemId = itemId;
	}

	public String getItemName() {
		return itemName;
	}

	public void setItemName(String itemName) {
		this.itemName = itemName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public List<Supplier> getSuppliers() {
		return suppliers;
	}

	public void setSuppliers(List<Supplier> suppliers) {
		this.suppliers = suppliers;
	}

	public Map<String, String> getSpecs() {
		return specs;
	}

	public void setSpecs(HashMap<String, String> specs) {
		this.specs = specs;
	}

	@Override
	public String toString() {
		return "Item [itemId=" + itemId + ", itemName=" + itemName + ", description=" + description + ", suppliers="
				+ suppliers + ", specs=" + specs + "]";
	}

		

	
	
}
