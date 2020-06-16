package com.example.inventory.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import lombok.Data;

@Data
@Entity
public class Variant {
	
	@Id
	@GeneratedValue
	private Long id;
	private String sku;

}
