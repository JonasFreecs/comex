package br.com.comex.modelo;

public class Categoria {
	private int id;
	private String nome;
	private Status status = Status.ATIVA;
	
	public Categoria(int id, String nome) {
		
		this.id = id;
		this.nome = nome;
		IllegalArgumentException ex = new IllegalArgumentException();
		
		int tamanhoNome = this.nome.length();
		
		if(this.id <= 0 || tamanhoNome < 3) {
			throw ex;
		}
	}
	
public Categoria(int id, String nome, Status status) {
		
		this.id = id;
		this.nome = nome;
		this.status = status;
		IllegalArgumentException ex = new IllegalArgumentException();
		
		int tamanhoNome = this.nome.length();
		
		if(this.id <= 0 || tamanhoNome < 3) {
			throw ex;
		}
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	
	
}
