package com.example.inventory.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.inventory.model.StockItem;



public interface InventoryRepository  extends JpaRepository<StockItem, Long> {

}
