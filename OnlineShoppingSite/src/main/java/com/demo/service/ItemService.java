package com.demo.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.demo.entities.Item;
import com.demo.repositories.ItemRepository;

@Service
@Transactional
public class ItemService {
	
	@Autowired
	private ItemRepository itemRepository;
	
	public Item save(Item i) {
		
		Item item = itemRepository.save(i);
		
		return item;
	}
	
	public List<Item> getAllItems(){
		
		return itemRepository.findAll();
	}
	
	public Item getItem(Long id) {
		
		Optional<Item> optItem = itemRepository.findById(id);
		Item i = null;
		if(optItem.isPresent())
			i = optItem.get();
		
		return i;
	}
	
	public Item remove(Long id) {
		
		Item i = getItem(id);
		if(i!= null)
			itemRepository.delete(i);
		
		return i;
	}
	
	
	
}
