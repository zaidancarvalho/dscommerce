package com.devsuperior.dscommerce.dto;

import java.util.ArrayList;
import java.util.List;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import com.devsuperior.dscommerce.entities.Category;
import com.devsuperior.dscommerce.entities.Product;

public class ProductDTO {

	private Long id;
	
	@Size(min = 3, max = 80, message = "Name must be 3 to 80 characters")
	@NotBlank(message = "Required field")
	private String name;
	
	@Size(min = 10, message = "Description must be at least 10 characters")
	@NotBlank(message = "Required field")
	private String description;
	
	@Positive(message = "Price must be positive")
	private Double price;
	private String imgUrl;
	
	@NotEmpty(message = "Must have at least one category")
	private List<CategoryDTO> categories = new ArrayList<>();

	public ProductDTO(Long id, String name, String description, Double price, String imgUrl) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.price = price;
		this.imgUrl = imgUrl;
	}
	
	public ProductDTO(Product entity) {
		id = entity.getId();
		name = entity.getName();
		description = entity.getDescription();
		price = entity.getPrice();
		imgUrl = entity.getImgUrl();
		for(Category cat : entity.getCategories()) {
			categories.add(new CategoryDTO(cat));
		}
	}

	public Long getId() {
		return id;
	}

	public String getName() {
		return name;
	}

	public String getDescription() {
		return description;
	}

	public Double getPrice() {
		return price;
	}

	public String getImgUrl() {
		return imgUrl;
	}
	
	public List<CategoryDTO> getCategories() {
		return categories;
	}
}
