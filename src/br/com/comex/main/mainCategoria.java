package br.com.comex.main;

import br.com.comex.modelo.Categoria;
import br.com.comex.modelo.Status;


public class MainCategoria {
	public static void main(String[] args) {
		
		Categoria c1 = new Categoria("INFORMATICA");
		Categoria c2 = new Categoria("MOVEIS", Status.INATIVA);
		Categoria c3 = new Categoria("LIVROS");
		

		
		System.out.println("Categoria " + c1.getCategoriaNome() + " (" + c1.getId() + " - " + c1.getStatus() + ")");
		System.out.println("Categoria " + c2.getCategoriaNome() + " (" + c2.getId() + " - " + c2.getStatus() + ")");
		System.out.println("Categoria " + c3.getCategoriaNome() + " (" + c3.getId() + " - " + c3.getStatus() + ")");
		
	}
}
