package com.uca.capas.domain;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;


public class Product {
	
	private static final String DATETIME_TEXT = "El formato de la fecha debe ser dd/MM/yy";
	private static final String NEGATIVE_VALUE_TEXT = "El valor no puede ser negativo";
	private static final String BLANK_WARNING_TEXT = "El campo no puede estar vacio";
	private static final String CHARACTER_LIMIT_TEXT = "El campo no puede ser mayor a 30 caracteres";

	@NotBlank(message = BLANK_WARNING_TEXT)
	@Size(max = 30, message = CHARACTER_LIMIT_TEXT)
	private String name;
	
	@NotBlank(message = BLANK_WARNING_TEXT)
	@Size(max = 30, message = CHARACTER_LIMIT_TEXT)
	private String brand;
	
	@NotBlank(message = BLANK_WARNING_TEXT)
	@Size(max = 30, message = CHARACTER_LIMIT_TEXT)
	private String description;
	
	@NotBlank(message = BLANK_WARNING_TEXT) 
	@Size(max = 30, message = CHARACTER_LIMIT_TEXT)
	private String category;
	
	@NotNull(message = BLANK_WARNING_TEXT)
	@Min(value = 0, message = NEGATIVE_VALUE_TEXT)
	private int price;
	
	@NotBlank(message = BLANK_WARNING_TEXT)
	@Size(max = 30, message = CHARACTER_LIMIT_TEXT)
	@Pattern(regexp = "[0-9]{2}/[0-9]{2}/[0-9]{2}", message = DATETIME_TEXT)
	private String expirationDate;
	
	/*
	 * Setters and Getters definition area
	 * */
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getBrand() {
		return brand;
	}

	public void setBrand(String brand) {
		this.brand = brand;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getCategory() {
		return category;
	}

	public void setCategory(String category) {
		this.category = category;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getExpirationDate() {
		return expirationDate;
	}

	public void setExpirationDate(String expirationDate) {
		this.expirationDate = expirationDate;
	}

}
