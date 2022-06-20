package com.zensar.project.service;

import java.util.List;

import com.zensar.project.dto.ProductDto;

public interface ProductService {

	public ProductDto getproduct(int productId);

	public List<ProductDto> getAllProducts(int pageNumber, int pageSize);

	public ProductDto insertProduct(ProductDto product);

	public void updateProduct(int productId, ProductDto product);

	public void deleteProduct(int productId);

	public List<ProductDto> getAllProducts();

	public List<ProductDto> findByProductNameAndProductPrice(String productName, int price);

	public List<ProductDto> getByProductName(String productName);

}
