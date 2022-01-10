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
	
	private String loja;
	
	private double preco;
	
	private String categoria;
	
	private String url;
	private String img;
	
	private String status;
	
	public Product() {}

	public Product(String nome, String loja, double preco, String url, String img, String status) {
		
		this.nome = nome;
		this.loja = loja;
		this.preco = preco;
		this.url = url;
		this.img = img;
		this.status = status;
	
	}
	
	public Long getId() {
	
		return id;
	
	}

	public String getNome() {
	
		return nome;
	
	}
	
	public String getLoja() {
		
		return loja;
		
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

	public String getStatus() {
	
		return status;
	
	}
		
}