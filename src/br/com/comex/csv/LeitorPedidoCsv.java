package br.com.comex.csv;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class LeitorPedidoCsv {
			
		public List<PedidoCsv> lerListaPedidos() throws FileNotFoundException {
			List<PedidoCsv> pedidos = new ArrayList<PedidoCsv>();
			
			Scanner scanner = new Scanner(new File ("pedido.csv"));
			scanner.nextLine();
			while (scanner.hasNextLine()) {
				String linha = scanner.nextLine();
				Scanner linhaScanner = new Scanner(linha);
				linhaScanner.useDelimiter(",");
				
				String categoria = linhaScanner.next();
				String nome = linhaScanner.next();
				String valor = linhaScanner.next();
				String quantidade = linhaScanner.next();
				String data = linhaScanner.next();
				String cliente = linhaScanner.next();
				
				PedidoCsv pedido = new PedidoCsv(categoria, nome, cliente, valor, quantidade, data);
				
				pedidos.add(pedido);
				
				linhaScanner.close();
				
			}
			
			scanner.close();
			 
			return pedidos;
		}
		
	}
			


