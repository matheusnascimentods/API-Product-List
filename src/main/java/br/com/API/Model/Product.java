package br.com.API.Model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Product {

	@Id @GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String nome;
	
	private double preco;
	
	private String categoria;
	
	private String url;
	private String img;
	
	public Product() {}

	public Product(String nome, double preco, String url, String img) {
		
		this.nome = nome;
		this.preco = preco;
		this.url = url;
		this.img = img;
	
	}
	
	public Long getId() {
	
		return id;
	
	}

	public String getNome() {
	
		return nome;
	
	}

	public double getPreco() {
	
		return preco;
	
	}
	
	public String getCategoria() {
	
		return categoria;
	
	}

	public String getUrl() {
	
		return url;
	
	}

	public String getImg() {
	
		return img;
	
	}
		
}