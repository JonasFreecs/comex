package br.com.comex.modelo;

public class Pedido {
		private int id;
		private String data;
		private Cliente cliente;
		
		public  Pedido( String data, Cliente cli) {
			this.data = data;
			this.cliente = cli;
		}
		
		public int getId() {
			return id;
		}

		public String getData() {
			return data;
		}

		public Cliente getCliente() {
			return cliente;
		}

		
	}
