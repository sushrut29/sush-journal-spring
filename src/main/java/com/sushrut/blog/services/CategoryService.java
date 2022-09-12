package com.sushrut.blog.services;

import java.util.List;

import com.sushrut.blog.payloads.CategoryDto;

public interface CategoryService {

	CategoryDto createCategory(CategoryDto Category);
	CategoryDto updateCategory(CategoryDto Category, Integer CategoryId);
	CategoryDto getCategoryById(Integer CategoryId);
	List<CategoryDto> getAllCategories();
	void deleteCategory(Integer CategoryId);
}
