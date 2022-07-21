package com.zensar.dto;

import com.zensar.entity.Category;
import com.zensar.entity.User;

import lombok.Data;
import lombok.NoArgsConstructor;
@Data
@NoArgsConstructor
public class PostDto {

	private String tittle;

	private String content;

	private String imageName;

	private CategoryDto category;

	private UserDto user;

}
