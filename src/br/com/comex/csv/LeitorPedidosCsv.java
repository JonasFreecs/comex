package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

import br.com.comex.csv.LeitorPedidoCsv;
import br.com.comex.csv.PedidoCsv;

public class LeitorPedidosCsv {
	
	public static void main(String[] args) throws FileNotFoundException {
		LeitorPedidoCsv leitorPedidoCsv = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidoCsv.lerListaPedidos();	
		
		System.out.println("Total de pedidos: " + pedidosCsv.size());
	}
}
