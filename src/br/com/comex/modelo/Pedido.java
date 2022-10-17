package br.com.comex.modelo;

public class Pedido {
		private Long id;
		private String data;
		private Cliente cliente;
		private int id_cliente;
		
		public  Pedido( String data, Cliente cli) {
			this.data = data;
			this.cliente = cli;
			
			this.id_cliente = cli.getId();
		}
		public Pedido (String data, int id_cliente) {
			this.data = data;
			this.id_cliente = id_cliente;
			this.cliente = new Cliente(id_cliente);
		}
		public Pedido (int id_cliente) {
			this.id_cliente = id_cliente;
			this.cliente = new Cliente(id_cliente);
		}
		public Pedido (Long id, int id_cliente) {
			this.id = id;
			this.id_cliente = id_cliente;
		}
		public Pedido (Long id) {
			this.id = id;
		}
		
		public int getId_cliente() {
			return id_cliente;
		}
		public void setId_cliente(int id_cliente) {
			this.id_cliente = id_cliente;
		}
		public Long getId() {
			return id;
		}

		public String getData() {
			return data;
		}

		public String getCliente() {
			return cliente.getNome();
		}
		public void setId(long long1) {
			this.id = long1;
			
		}
		@Override
		public String toString() {
			return "ID: " + id + ". Data: " + data + ". Id do cliente:" + id_cliente;
			
		}
		
	}
