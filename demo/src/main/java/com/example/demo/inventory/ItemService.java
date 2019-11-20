package com.example.demo.inventory;

import java.util.ArrayList;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemService {
	
	@Autowired
	private ItemRepo itemRepo;
	
	public List<Item> getAllItems(){
		List<Item> items = new ArrayList<>();
		itemRepo.findAll().forEach(items::add);
		return items;
	}	

	public Item getItem(String no) {
		//return items.stream().filter(i -> i.getNo().equals(no)).findFirst().get();Integer.toString(id)
		Item item = itemRepo.findById(no).orElse(null); 
		return item;
	}

	public Item addItem(Item item) {
		itemRepo.save(item);
		return item;
	}

	public Item updateItem(String no, Item item) {
		itemRepo.save(item);
		return item;
	}

	public Item deleteItem(String no) {
		//items.removeIf(i -> i.getNo().equals(no));
		Item item = itemRepo.findById(no).orElse(null); 
		itemRepo.deleteById(no);
		return item;
	}
 	
}
