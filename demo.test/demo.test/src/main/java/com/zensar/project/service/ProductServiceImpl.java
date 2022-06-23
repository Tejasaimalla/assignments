package com.zensar.project.service;

import java.util.ArrayList;
import java.util.List;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.zensar.project.dto.ProductDto;
import com.zensar.project.entity.Product;
import com.zensar.project.repository.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {
	@Autowired
	private ProductRepository productRepository;
	@Autowired
	private ModelMapper modelMapper;

	@Override
	public ProductDto getproduct(int productId) {
		Product getproduct = productRepository.findById(productId).get();
		return modelMapper.map(getproduct, ProductDto.class);

	}

	@Override
	public List<ProductDto> getAllProducts(int pageNumber, int pageSize) {
		List<ProductDto> listofProductDto = new ArrayList<ProductDto>();
		Page<Product> findAll = productRepository
				.findAll(PageRequest.of(pageNumber, pageSize, Sort.by(Direction.ASC, "productName")));

		List<Product> content = findAll.getContent();

		for (Product product : content) {
			// listofProductDto.add(mapToDto(product));
			listofProductDto.add(modelMapper.map(product, ProductDto.class));
		}
		return listofProductDto;

	}

	@Override
	public ProductDto insertProduct(ProductDto productDto) {

		Product product = modelMapper.map(productDto, Product.class);
		Product insertedProduct = productRepository.save(product);

		return modelMapper.map(insertedProduct, ProductDto.class);

	}

	@Override
	public void updateProduct(int productId, ProductDto productDto) {

		Product product = modelMapper.map(productDto, Product.class);

		productRepository.save(product);

	}

	@Override
	public void deleteProduct(int productId) {
		productRepository.deleteById(productId);

	}

	public List<ProductDto> getByProductName(String productName) {
		// List<Product>products = productRepository.test(productName);
		List<ProductDto> productDtos = newArrayList();

		List<Product> products = productRepository.test(productName);

		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));
		return productDtos;

	}

	private List<ProductDto> newArrayList() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<ProductDto> findByProductNameAndProductPrice(String productName, int price) {

		List<ProductDto> productDtos = newArrayList();

		List<Product> products = productRepository.test1(productName, price);

		for (Product product : products)
			productDtos.add(modelMapper.map(product, ProductDto.class));

		return productDtos;
	}

	@Override
	public List<ProductDto> getAllProducts() {

		return null;
	}

}
