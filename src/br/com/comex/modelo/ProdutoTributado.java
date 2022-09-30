package br.com.comex.modelo;

public class ProdutoTributado extends Produto {
	
	public ProdutoTributado(int id, String nome, double precoUnitario, int quantidadeEstoque, String categoria) {
		super(id, nome, precoUnitario, quantidadeEstoque, categoria);
	}
	
	public ProdutoTributado(int id, String nome, String descricao, double precoUnitario, int quantidadeEstoque, String categoria) {
		super(id, nome, descricao, precoUnitario, quantidadeEstoque, categoria);
		
	}
	@Override
	public double calculaImposto() {
		return super.calculaImposto();
	}
	@Override
	public double calculaEstoque() {
		return super.calculaEstoque();
	}

}
