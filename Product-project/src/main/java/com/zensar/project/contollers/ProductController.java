package com.zensar.project.contollers;

import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.zensar.project.dto.ProductDto;
import com.zensar.project.service.ProductService;

@RestController
@RequestMapping(value = "/product-api", produces = { MediaType.APPLICATION_JSON_VALUE,
		MediaType.APPLICATION_XML_VALUE }, consumes = { MediaType.APPLICATION_JSON_VALUE,
				MediaType.APPLICATION_XML_VALUE })

public class ProductController {

	@Autowired
	private ProductService productService;

	@GetMapping(value = "/products/{productId}")
	public ResponseEntity<ProductDto> getProduct(@PathVariable("productId") int productId) {
		return new ResponseEntity<ProductDto>(productService.getproduct(productId), HttpStatus.OK);

	}

	@GetMapping(value = { "/products", "/listOfProducts" })
	public ResponseEntity<List<ProductDto>> getAllProducts(
			@RequestParam(value = "pageNumber", required = false, defaultValue = "0") int pageNumber,
			@RequestParam(value = "pageSize", required = false, defaultValue = "5") int pageSize) {
		return new ResponseEntity<List<ProductDto>>(productService.getAllProducts(pageNumber, pageSize), HttpStatus.OK);

	}

	@PostMapping(value = "/products")

	public ResponseEntity<ProductDto> insertProduct(@RequestBody ProductDto productDto) {

		return new ResponseEntity<ProductDto>(productService.insertProduct(productDto), HttpStatus.CREATED);

	}

	@PutMapping(value = "/products/{productId}")
	public ResponseEntity<String> updateProduct(@PathVariable("productId") int productId,
			@RequestBody ProductDto productDto) {
		return new ResponseEntity<String>("Product details updated Succesfully ", HttpStatus.OK);
		// public void updateProduct(@PathVariable("productId") int productId,
		// @RequestBody
		// ProductDto productDto) {
		// productService.updateProduct(productId, productDto);

		// productService.updateProduct(productId, product);

	}

	// http://localhost:1234/products -> Delete
	@DeleteMapping("/products/{productId}")

	public ResponseEntity<String> deleteProduct(@PathVariable("productId") int productId) {

		productService.deleteProduct(productId);
		return new ResponseEntity<String>("Product deleted successfully ", HttpStatus.OK);

		// public void deleteProduct(@PathVariable("productId") int productId) {

		// productService.deleteProduct(productId);

	}

	@GetMapping("/products/productname{productName}")
	public List<ProductDto> getByProductName(@PathVariable("productName") String productName) {
		return productService.getByProductName(productName);

	}

	@GetMapping("/products/{productName}/{productPrice}")
	public List<ProductDto> findByProductNameandProductPrice(@PathVariable("productName") String productName,
			@PathVariable("productPrice") int price) {
		return productService.findByProductNameAndProductPrice(productName, price);
	}

}
