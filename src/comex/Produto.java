package comex;

public abstract class Produto {
	private int id;
	private String nome;
	private String descricao;
	private double precoUnitario;
	private int quantidadeEstoque;
	private String categoria;

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
