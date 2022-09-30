package br.com.comex.modelo;

public class ProdutoIsento extends Produto {

	
	public ProdutoIsento(int id, String nome, double precoUnitario, int quantidadeEstoque, String categoria) {
		super(id, nome, precoUnitario, quantidadeEstoque, categoria);
		
	}
	
	public ProdutoIsento(int id, String nome, String descricao, double precoUnitario, int quantidadeEstoque, String categoria) {
		super(id, nome, descricao, precoUnitario, quantidadeEstoque, categoria);
		
	}

	@Override
	public double calculaImposto() {
		return 0;
	}
	
	@Override
	public double calculaEstoque() {
		return super.calculaEstoque();
	}

}
