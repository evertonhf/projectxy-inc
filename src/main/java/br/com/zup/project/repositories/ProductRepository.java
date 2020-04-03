package br.com.zup.project.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import br.com.zup.project.entities.Product;

public interface ProductRepository extends JpaRepository<Product, String> {

	public Product findById(long id);

}
