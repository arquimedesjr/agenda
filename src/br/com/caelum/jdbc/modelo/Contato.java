package br.com.caelum.jdbc.modelo;

import java.util.Calendar;

public class Contato {
	private int id;
	private String nome;
	private String email;
	private String endereco;
	private Calendar dataNascimento;

	

	public String getNome() {
		return this.nome;
	}

	public void setNome(String novo) {
		this.nome = novo;
	}

	public String getEmail() {
		return this.email;
	}

	public void setEmail(String novo) {
		this.email = novo;
	}

	public String getEndereco() {
		return this.endereco;
	}

	public void setEndereco(String novo) {
		this.endereco = novo;
	}

	public int getId() {
		return this.id;
	}

	public void setId(long id2) {
		this.id = (int) id2;
	}

	public Calendar getDataNascimento() {
		return this.dataNascimento;
	}

	public void setDataNascimento(Calendar dataNascimento) {
		this.dataNascimento = dataNascimento;
	}
}
