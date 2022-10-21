package br.com.comex.modelo;

public class Categoria {
	private Long id;
	private String categoriaNome;
	private Status status = Status.ATIVA;
	
public Categoria() {
	
}
	
	public Categoria( Long id, String nome) {
		
		this.categoriaNome = nome;
		IllegalArgumentException ex = new IllegalArgumentException();
		
		int tamanhoNome = this.categoriaNome.length();
		
		if(this.id <= 0 || tamanhoNome < 3) {
			throw ex;
		}
	}
	
public Categoria(Long id, String nome, Status status) {
		
		this.id = id;
		this.categoriaNome = nome;
		this.status = status;
		IllegalArgumentException ex = new IllegalArgumentException();
		
		int tamanhoNome = this.categoriaNome.length();
		
		if(this.id <= 0 || tamanhoNome < 3) {
			throw ex;
		}
	}

public Categoria(String categoriaNome, Status status) {
	this.categoriaNome = categoriaNome;
	this.status = status;
}
	
	public Categoria(String string) {
	this.categoriaNome = string;
}

	public Categoria(long l) {
		this.id = l;
	}

	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCategoriaNome() {
		return categoriaNome;
	}
	public void setCategoriaNome(String nome) {
		this.categoriaNome = nome;
	}

	public Status getStatus() {
		return status;
	}

	public void setStatus(Status status) {
		this.status = status;
	}
	
	@Override
	public String toString() {
		return "ID: " + id + "Categoria: " + categoriaNome + ". Status: " + status.name() ;
		
	}
	
}
