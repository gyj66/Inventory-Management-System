package com.example.inventory.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Data;

@Data
@Entity
public class StockItem {
    
	@Id
	@GeneratedValue
	private Long id;
	
	private Long count_on_hand;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private Variant variant;
	
	@ManyToOne(cascade = CascadeType.ALL)
	private StockLocation stock_location;
	
	public StockItem() {}

	public StockItem(Long id, Long count_on_hand, Variant variant, StockLocation stock_location) {
		super();
		this.id = id;
		this.count_on_hand = count_on_hand;
		this.variant = variant;
		this.stock_location = stock_location;
	}
	
	
	
	 
	
	
	
}
