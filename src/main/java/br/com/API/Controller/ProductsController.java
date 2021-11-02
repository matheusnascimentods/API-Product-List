package br.com.API.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.API.Model.Product;
import br.com.API.Repository.ProductRepository;

@RestController @RequestMapping("/Product-List")
public class ProductsController {
	
	@Autowired
	ProductRepository repository;
	
	@GetMapping
	public List<Product> GetAll() {
	
		return repository.findAll();
		
	}

}