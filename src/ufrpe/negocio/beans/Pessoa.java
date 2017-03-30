package ufrpe.negocio.beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Pessoa {
	private int id;
	private int tipoPessoa; //	0 para funcionario e 1 para paciente
	private String cpf;
	private String nome;
	private Calendar dataDeNascimento;
	private String endereco;
	private String email;
	private boolean sexo;	//true é M false é F
	private ArrayList<String> telefones;
	private String senha;
	
	public Pessoa(){};
	
	public Pessoa(int id, int tipoPessoa, String cpf, String nome, Calendar dataDeNascimento, 
			String endereco, String email, boolean sexo, ArrayList<String> telefones, String senha){
		this.id = id;
		this.tipoPessoa = tipoPessoa;
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.telefones = telefones;	
		this.senha = senha;
	}
	
	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}
	
	public int getTipoPessoa() {
		return tipoPessoa;
	}


	public void setTipoPessoa(int tipoPessoa) {
		if (tipoPessoa == 0 || tipoPessoa == 1)
			this.tipoPessoa = tipoPessoa;
	}


	public String getCpf() {
		return cpf;
	}


	public void setCpf(String cpf) {
		if (cpf.length() == 11)
			this.cpf = cpf;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public Calendar getDataDeNascimento() {
		return dataDeNascimento;
	}


	public void setDataDeNascimento(Calendar dataDeNascimento) {
		if (dataDeNascimento != null)
			this.dataDeNascimento = dataDeNascimento;
	}


	public String getEndereco() {
		return endereco;
	}


	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		if (email != null)
			this.email = email;
	}


	public boolean getSexo() {
		return sexo;
	}


	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}


	public ArrayList<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}
	
	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}
}
