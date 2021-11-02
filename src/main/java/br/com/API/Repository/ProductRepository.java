package br.com.API.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import br.com.API.Model.Product;

public interface ProductRepository extends JpaRepository<Product, Long>{}