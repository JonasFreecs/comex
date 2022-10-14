package br.com.comex.modelo;

public class Cliente {
	private int id;
	private String nome;
	private String cpf;
	private String telefone;
	private String rua;
	private int numero;
	private String complemento; 
	private String bairro;
	private String cidade;
	private String estado;
	
	public Cliente(String nome, String cpf, String telefone, String rua, int numero, String complemento, String bairro, String cidade, String estado) {
		this.nome = nome;
		this.cpf = cpf;
		this.telefone = telefone;
		this.rua = rua;
		this.numero = numero;
		this.complemento = complemento;
		this.bairro = bairro;
		this.cidade = cidade;
		this.estado = estado;
	}
	public Cliente (int id) {
		this.id = id;
	}
	public Cliente (int id, String nome) {
		this.id = id;
		this.nome = nome;
	}
	
	public int getId() {
		return id;
	}
	public String getNome() {
		return nome;
	}
	public String getCpf() {
		return cpf;
	}
	public String getTelefone() {
		return telefone;
	}
	public String getRua() {
		return rua;
	}
	public int getNumero() {
		return numero;
	}
	public String getComplemento() {
		return complemento;
	}
	public String getBairro() {
		return bairro;
	}
	public String getCidade() {
		return cidade;
	}
	public String getEstado() {
		return estado;
	}

	public void setId(int id) {
		this.id = id;
	}

@Override
public String toString() {
	return "ID: " + id + " Nome: " + nome + " CPF: " + cpf + " Telefone:" + telefone + " Endereco: " + rua + ", " + numero + " Comp: " + complemento + " - " + cidade + ", " + bairro + "-" + estado ;
	
}
	
}
