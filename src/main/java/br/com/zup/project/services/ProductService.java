package br.com.zup.project.services;

import java.util.List;

import org.springframework.stereotype.Component;
import br.com.zup.project.entities.Product;

@Component
public interface ProductService {

	public Product addProduct(Product entity);

	public List<Product> getProducts();

	public Product getProduct(long id);

	public void deleteProduct(long id);

	public Product updateProduct(Product entity);
}
