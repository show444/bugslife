package com.example.entity;

import java.util.List;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
public class ProductWithCategoryName {

	private Long id;

	private String name;

	private String code;

	private Integer weight;

	private Integer height;

	private Double price;

	private List<String> categoryName;

	public ProductWithCategoryName(Long id, String code, String name, Integer weight, Integer height, Double price, List<String> categoryName) {
		this.setId(id);
		this.setCode(code);
		this.setName(name);
		this.setWeight(weight);
		this.setHeight(height);
		this.setPrice(price);
		this.setCategoryName(categoryName);
	}
}
