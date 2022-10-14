package br.com.comex.main;

import br.com.comex.modelo.Produto;
import br.com.comex.modelo.ProdutoIsento;
import br.com.comex.modelo.ProdutoTributado;

public class MainProduto {
	public static void main(String[] args) {
		
		Produto p1 = new ProdutoTributado(1, "Notebook Samsung", 3253, 1, "Informatica");
		Produto p2 = new ProdutoIsento(2, "Clean Architecture", 102.90, 2, "Livros");
		Produto p3 = new ProdutoTributado(3, "Monitor Dell 27", 1889, 3, "Informatica");
		
		System.out.println("Informacoes dos produtos: ");
		System.out.println();
		System.out.println("Id: " + p1.getId() + ", " + "Nome: " + p1.getNome() + ", " + "Preco: " + p1.getPrecoUnitario() + ", Estoque: " + p1.getQuantidadeEstoque() + ", Categoria:" + p1.getCategoria());
		System.out.println("Valor total em estoque: " + p1.calculaEstoque() + ", Impostos aproximados: " + p1.calculaImposto());
		System.out.println();
		System.out.println("Id: " + p2.getId() + ", " + "Nome: " + p2.getNome() + ", " + "Preco: " + p2.getPrecoUnitario() + ", Estoque: " + p2.getQuantidadeEstoque() + ", Categoria:" + p2.getCategoria());
		System.out.println("Valor total em estoque: " + p2.calculaEstoque() + ", Impostos aproximados: " + p2.calculaImposto());
		System.out.println();
		System.out.println("Id: " + p3.getId() + ", " + "Nome: " + p3.getNome() + ", " + "Preco: " + p3.getPrecoUnitario() + ", Estoque: " + p3.getQuantidadeEstoque() + ", Categoria:" + p3.getCategoria());
		System.out.println("Valor total em estoque: " + p3.calculaEstoque() + ", Impostos aproximados: " + p3.calculaImposto());
		System.out.println();
		
	
	}
}
