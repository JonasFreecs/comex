package br.com.comex.csv;

import java.io.FileNotFoundException;
import java.util.List;

public class TestePedidoMaisBaratoEMaisCaro {

		public static void main(String[] args) throws FileNotFoundException {
			
			LeitorPedidoCsv leitorPedidoCsv = new LeitorPedidoCsv();
			List<PedidoCsv> pedidosCsv = leitorPedidoCsv.lerListaPedidos();
			
			PedidoMaisBaratoEMaisCaro comparator = new PedidoMaisBaratoEMaisCaro();
			
			pedidosCsv.sort(comparator);
			
			//Falta implementar
			
			
			
			
		}
}
