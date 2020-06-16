package com.example.inventory.service;

import java.util.List;

import com.example.inventory.model.StockItem;

public interface StockItemService {
      
	  List<StockItem> getAllStockItems();
	  
	  StockItem getStockItemById(Long id);
	  
	  StockItem save();
	  
	  StockItem update(StockItem newItem, Long id);
	  
	  void delete(Long id);
	  
	  
	  
	  
}
