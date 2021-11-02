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
	private String cor;
	
	private double preco;
	private double altura;
	private double largura;
	
	private String url;
	private String img;
	
	public Product() {}

	public Product(String nome, String cor, double preco, double altura, double largura, String url, String img) {
		
		this.nome = nome;
		this.cor = cor;
		this.preco = preco;
		this.altura = altura;
		this.largura = largura;
		this.url = url;
		this.img = img;
	
	}

	
	public Long getId() {
	
		return id;
	
	}


	public String getNome() {
	
		return nome;
	
	}

	
	public String getCor() {
	
		return cor;
	
	}

	
	public double getPreco() {
	
		return preco;
	
	}

	
	public double getAltura() {
	
		return altura;
	
	}

	
	public double getLargura() {
	
		return largura;
	
	}

	
	public String getUrl() {
	
		return url;
	
	}


	public String getImg() {
	
		return img;
	
	}
		
}