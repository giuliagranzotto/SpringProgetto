package it.betacom.model;

public class Cliente {
	
	private String nome;
	private String cognome;

	public Cliente() {
		// TODO Auto-generated constructor stub
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCognome() {
		return cognome;
	}

	public void setCognome(String cognome) {
		this.cognome = cognome;
	}

	@Override
	public String toString() {
		return "Cliente [nome=" + nome + ", cognome=" + cognome + "]";
	}

	public Cliente(String nome, String cognome) {
		super();
		this.nome = nome;
		this.cognome = cognome;
	}

}