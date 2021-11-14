package model;

import java.io.Serializable;

public class ModelLogin implements Serializable {

	private static final long serialVersionUID = 1L;
	private String nome;
	private String senha;

	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getSenha() {
		return senha;
	}
	public void setSenha(String senha) {
		this.senha = senha;
	}
	
	public void Autentica() {
		
		if(this.nome =="admin" && this.senha == "1234") {
			System.out.println("seja bem vindo ao sistema");
		}else {
			System.out.println("Assesso negado");
		}
		
	}
	
	
}
