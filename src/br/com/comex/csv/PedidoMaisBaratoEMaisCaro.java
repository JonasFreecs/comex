package br.com.comex.csv;

import java.util.Comparator;

public class PedidoMaisBaratoEMaisCaro implements Comparator<PedidoCsv>{


	   @Override
	    public int compare(PedidoCsv lista1, PedidoCsv lista2) {
	        
	        double valorLista1 = Double.parseDouble(lista1.getPreco());
	        int quantidadeLista1 = Integer.parseInt(lista1.getQuantidade());
	        
	        double valorLista2 = Double.parseDouble(lista2.getPreco());
	        int quantidadeLista2 = Integer.parseInt(lista2.getQuantidade());
	        
	        double totalLista1 = valorLista1 * quantidadeLista1;
	        double totalLista2 = valorLista2 * quantidadeLista2;
	        
	        if (totalLista1 > totalLista2) {
	            return 1;
	        }
	        if (totalLista1 == totalLista2) {
	            return 0;
	        }
	        else return -1;
	        
	    }
	}