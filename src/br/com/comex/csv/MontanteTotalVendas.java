package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class MontanteTotalVendas {

	public static void main(String[] args) throws FileNotFoundException {
		double total = 0;
		LeitorPedidoCsv leitorPedidoCsv = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidoCsv.lerListaPedidos();
		
		for (int i = 0; i<pedidosCsv.size(); i++) {
			String quantidade = pedidosCsv.get(i).getQuantidade();
			String valor = pedidosCsv.get(i).getPreco();
			Integer quantidadeSoma = Integer.valueOf(quantidade);
			Double valorSoma = Double.valueOf(valor);
			total = total + (quantidadeSoma * valorSoma);
        }
		
		System.out.println("Montante de vendas: R$" + total);
	}
}
