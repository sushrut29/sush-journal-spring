package com.sushrut.blog.services.impl;

import java.util.List;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sushrut.blog.entities.Category;
import com.sushrut.blog.exceptions.ResourceNotFoundException;
import com.sushrut.blog.payloads.CategoryDto;
import com.sushrut.blog.payloads.UserDto;
import com.sushrut.blog.repositories.CategoryRepo;
import com.sushrut.blog.services.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepo categoryRepo;
	
	@Autowired
	private ModelMapper modelMapper;
	
	@Override
	public CategoryDto createCategory(CategoryDto categoryDto) {
		Category cat = this.modelMapper.map(categoryDto, Category.class);
		Category addedCat = this.categoryRepo.save(cat);
		
		return this.modelMapper.map(addedCat, CategoryDto.class);
	}

	@Override
	public CategoryDto updateCategory(CategoryDto categoryDto, Integer CategoryId) {
		
		Category cat = this.categoryRepo.findById(CategoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", CategoryId));
		cat.setCategoryTitle(categoryDto.getCategoryTitle());
		cat.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category updatedCat = this.categoryRepo.save(cat);
		return this.modelMapper.map(updatedCat, CategoryDto.class);
	}

	@Override
	public CategoryDto getCategoryById(Integer CategoryId) {
		Category cat = this.categoryRepo.findById(CategoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", CategoryId));
		
		return this.modelMapper.map(cat, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getAllCategories() {
		List<Category> categories = this.categoryRepo.findAll();
		List<CategoryDto>  catdtos = categories.stream().map((c)-> this.modelMapper.map(c, CategoryDto.class)).collect(Collectors.toList());
		return catdtos;
	}

	@Override
	public void deleteCategory(Integer CategoryId) {
		Category cat = this.categoryRepo.findById(CategoryId).orElseThrow(()-> new ResourceNotFoundException("category", "id", CategoryId));
		this.categoryRepo.delete(cat);
		

	}

}
