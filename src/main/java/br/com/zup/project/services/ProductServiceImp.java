package br.com.zup.project.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import br.com.zup.project.entities.Product;
import br.com.zup.project.repositories.ProductRepository;

@Service
public class ProductServiceImp implements ProductService {

	@Autowired
	private ProductRepository productRepository;

	@Override
	public Product addProduct(Product entity) {
		return productRepository.save(entity);
	}

	@Override
	public List<Product> getProducts() {
		return productRepository.findAll();
	}

	@Override
	public Product getProduct(long id) {
		return productRepository.findById(id);
	}

	@Override
	public void deleteProduct(long id) {
		Product product = productRepository.findById(id);
		if (product != null)
			productRepository.delete(product);
	}

	@Override
	public Product updateProduct(Product entity) {
		return productRepository.save(entity);
	}
}
