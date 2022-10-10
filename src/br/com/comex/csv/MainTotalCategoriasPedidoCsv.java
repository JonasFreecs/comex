package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MainTotalCategoriasPedidoCsv {
	 
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidoCsv leitorPedidoCsv = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidoCsv.lerListaPedidos();
		
		int totalDeCategorias = 0;
		ArrayList<String> comparadora = new ArrayList<String>();
		
		for (int i = 0; i < pedidosCsv.size(); i++) {
			if(!comparadora.contains(pedidosCsv.get(i).getCategoria())) {
				comparadora.add(pedidosCsv.get(i).getCategoria());
				//Teste de saída
				//System.out.println(comparadora);
				totalDeCategorias++;
			}
		}
		System.out.println("Total de categorias: " + totalDeCategorias );
}

}