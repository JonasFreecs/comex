package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class MainTotalProdutosVendidosCsv {

	public static void main(String[] args) throws FileNotFoundException {
		int total = 0;
		LeitorPedidoCsv leitorPedidoCsv = new LeitorPedidoCsv();
		List<PedidoCsv> pedidosCsv = leitorPedidoCsv.lerListaPedidos();
		
		for (int i = 0; i<pedidosCsv.size(); i++) {
			String quantidade = pedidosCsv.get(i).getQuantidade();
            Integer quantidadeEstoque = Integer.valueOf(quantidade);
            total = total + quantidadeEstoque;
        }
		
		System.out.println("Total de produtos vendidos: " + total);

	}

}
