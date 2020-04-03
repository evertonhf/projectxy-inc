package br.com.zup.project.resources;

import java.util.List;

import org.hibernate.annotations.MetaValue;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import br.com.zup.project.entities.Product;
import br.com.zup.project.services.ProductService;

@RestController
@RequestMapping("/products")
public class ProductResource {

	@Autowired
	private ProductService productService;

	@PostMapping
	@ResponseStatus(HttpStatus.CREATED)
	public void addProduct(@RequestBody Product product) {
		productService.addProduct(product);
	}

	@GetMapping("{id}")
	public ResponseEntity<?> getProduct(@PathVariable("id") long id) {
		Product product = productService.getProduct(id);
		if (product != null)
			return new ResponseEntity<>(product, HttpStatus.OK);
		else
			return new ResponseEntity<>("", HttpStatus.NO_CONTENT);
	}

	@GetMapping
	public List<Product> getProducts() {
		return productService.getProducts();
	}

	@PutMapping
	public Product updateProduct(@RequestBody Product product) {
		return productService.updateProduct(product);
	}

	@DeleteMapping("{id}")
	public void deleteProduct(@PathVariable("id") long id) {
		productService.deleteProduct(id);
	}

}
