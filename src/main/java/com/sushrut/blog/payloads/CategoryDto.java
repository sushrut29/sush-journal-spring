package com.sushrut.blog.payloads;

import javax.persistence.Column;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter

public class CategoryDto {
	
    private Integer categoryId;
	
	@NotBlank
	@Size(min=4, message = "min chars are 4")
	private String categoryTitle;
	
	@NotBlank
	@Size(min=10, message = "min chars are 10")
	private String categoryDescription;

}
