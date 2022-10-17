package br.com.comex.main;

import br.com.comex.modelo.Produto;

public class MainProduto {
	public static void main(String[] args) {
		
		Produto p1 = new Produto(1, "Notebook Samsung", 3253, 1, 1);
		Produto p2 = new Produto(2, "Clean Architecture", 102.90, 2, 2);
		Produto p3 = new Produto(3, "Monitor Dell 27", 1889, 3, 3);
		
		System.out.println("Informacoes dos produtos: ");
		System.out.println();
		System.out.println("Id: " + p1.getId() + ", " + "Nome: " + p1.getNome() + ", " + "Preco: " + p1.getPrecoUnitario() + ", Estoque: " + p1.getQuantidadeEstoque() + ", Categoria:" + p1.getCategoriaId());
		System.out.println("Valor total em estoque: " + p1.calculaEstoque() + ", Impostos aproximados: " + p1.calculaImposto());
		System.out.println();
		System.out.println("Id: " + p2.getId() + ", " + "Nome: " + p2.getNome() + ", " + "Preco: " + p2.getPrecoUnitario() + ", Estoque: " + p2.getQuantidadeEstoque() + ", Categoria:" + p2.getCategoriaId());
		System.out.println("Valor total em estoque: " + p2.calculaEstoque() + ", Impostos aproximados: " + p2.calculaImposto());
		System.out.println();
		System.out.println("Id: " + p3.getId() + ", " + "Nome: " + p3.getNome() + ", " + "Preco: " + p3.getPrecoUnitario() + ", Estoque: " + p3.getQuantidadeEstoque() + ", Categoria:" + p3.getCategoriaId());
		System.out.println("Valor total em estoque: " + p3.calculaEstoque() + ", Impostos aproximados: " + p3.calculaImposto());
		System.out.println();
		
	
	}
}
