package br.com.comex.modelo;

public class Produto {
	private long id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private int categoriaId;
	private Tipo tipo = Tipo.NAO_ISENTO;
	
public Produto (String nome, String descricao, double precoUnitario, int quantidadeEstoque, int categoria, Tipo tipo) {
	this.nome = nome;
	this.descricao = descricao;
	this.precoUnitario = precoUnitario;
	this.quantidadeEstoque = quantidadeEstoque;
	this.categoriaId = categoria;
	IllegalArgumentException ex = new IllegalArgumentException();
	
	int tamanhoNome = this.nome.length();
	
	if( tamanhoNome < 5 || this.precoUnitario < 0 || this.quantidadeEstoque < 0 ) {
		throw ex;
	}
}

public Produto(Long id) {
	this.id = id;
}
	

public Produto(long id, String nome, double precoUnitario, int quantidadeEstoque, int categoria) {
		
		this.id = id;
		this.nome = nome;
		this.precoUnitario = precoUnitario;
		this.quantidadeEstoque = quantidadeEstoque;
		this.categoriaId = categoria;
		IllegalArgumentException ex = new IllegalArgumentException();
		
		int tamanhoNome = this.nome.length();
		
		if(this.id <= 0 || tamanhoNome < 5 || this.precoUnitario < 0 || this.quantidadeEstoque < 0 ) {
			throw ex;
		}
}
public Produto(long id, String nome, String descricao, double precoUnitario, int quantidadeEstoque, int categoria, Tipo tipo) {
	
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	this.precoUnitario = precoUnitario;
	this.quantidadeEstoque = quantidadeEstoque;
	this.categoriaId = categoria;
	this.tipo = tipo;
	IllegalArgumentException ex = new IllegalArgumentException();
	
	int tamanhoNome = this.nome.length();
	
	if(this.id <= 0 || tamanhoNome < 5 || this.precoUnitario < 0 || this.quantidadeEstoque < 0 ) {
		throw ex;
	}
}

public Produto(long id, String nome, String descricao, double precoUnitario, int quantidadeEstoque, int categoria) {
	
	this.id = id;
	this.nome = nome;
	this.descricao = descricao;
	this.precoUnitario = precoUnitario;
	this.quantidadeEstoque = quantidadeEstoque;
	this.categoriaId = categoria;
	IllegalArgumentException ex = new IllegalArgumentException();
	
	int tamanhoNome = this.nome.length();
	
	if(this.id <= 0 || tamanhoNome < 5 || this.precoUnitario < 0 || this.quantidadeEstoque < 0 ) {
		throw ex;
	}
}
	
	public long getId() {
		return id;
	}
	public void setId(long l) {
		this.id = l;
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
	
	public int getCategoriaId() {
		return categoriaId;
	}
	public void setCategoriaId(int categoria) {
		this.categoriaId = categoria;
	}
	
	public double calculaEstoque() {
		double resultado;
		
		resultado = this.quantidadeEstoque * this.precoUnitario;
		return resultado;
	}
	
	public double calculaImposto() {
		double imposto;
		
		if (this.tipo != Tipo.ISENTO) {
			imposto = this.precoUnitario * 0.40;
		} else {	
			imposto = 0;
		}
		return imposto;
	}


	public Tipo getTipo() {
		return tipo;
	}

	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	@Override
	public String toString() {
		return "ID: " + id + ". Produto: " + nome + ". Descricao: " + descricao + ". Valor unitário: R$" + precoUnitario + ". Quantidade em estoque: " + quantidadeEstoque + ". Tributacao: " + tipo ;
		
	}
}