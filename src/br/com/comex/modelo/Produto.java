package br.com.comex.modelo;

public abstract class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private String categoria;

public Produto(int id, String nome, double precoUnitario, int quantidadeEstoque, String categoria) {
		
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoria = categoria;
		IllegalArgumentException ex = new IllegalArgumentException();
		
		int tamanhoNome = this.nome.length();
		
		if(this.id <= 0 || tamanhoNome < 5 || this.precoUnitario < 0 || this.quantidadeEstoque < 0 ) {
			throw ex;
		}
	}

public Produto(int id, String nome, String descricao, double precoUnitario, int quantidadeEstoque, String categoria) {
	
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	this.precoUnitario = precoUnitario;
	this.quantidadeEstoque = quantidadeEstoque;
	this.categoria = categoria;
	IllegalArgumentException ex = new IllegalArgumentException();
	
	int tamanhoNome = this.nome.length();
	
	if(this.id <= 0 || tamanhoNome < 5 || this.precoUnitario < 0 || this.quantidadeEstoque < 0 ) {
		throw ex;
	}
}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	
	public double getPrecoUnitario() {
		return precoUnitario;
	}
	public void setPrecoUnitario(double precoUnitario) {
		this.precoUnitario = precoUnitario;
	}
	
	public int getQuantidadeEstoque() {
		return quantidadeEstoque;
	}
	public void setQuantidadeEstoque(int quantidadeEstoque) {
		this.quantidadeEstoque = quantidadeEstoque;
	}
	
	public String getCategoria() {
		return categoria;
	}
	public void setCategoria(String categoria) {
		this.categoria = categoria;
	}
	
	public double calculaEstoque() {
		double resultado;
		
		resultado = this.quantidadeEstoque * this.precoUnitario;
		return resultado;
	}
	
	public double calculaImposto() {
		double imposto;
		
		imposto = this.precoUnitario * 0.40;
		
		return imposto;
	}
}
