package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;


public class mainCategoria {
	public static void main(String[] args) {
		
		Categoria c1 = new Categoria(1, "INFORMATICA");
		Categoria c2 = new Categoria(2, "MOVEIS", Status.INATIVA);
		Categoria c3 = new Categoria(3, "LIVROS");
		

		
		System.out.println("Categoria " + c1.getNome() + " (" + c1.getId() + " - " + c1.getStatus() + ")");
		System.out.println("Categoria " + c2.getNome() + " (" + c2.getId() + " - " + c2.getStatus() + ")");
		System.out.println("Categoria " + c3.getNome() + " (" + c3.getId() + " - " + c3.getStatus() + ")");
		
		Categoria c4 = new Categoria(0, "TESTE");
	}
}
