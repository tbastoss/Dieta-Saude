package beans;

import java.util.ArrayList;
import java.util.Date;

public class Pessoa {
	private int id;
	private String cpf;
	private String nome;
	private Date dataDeNascimento;
	private String endereco;
	private String email;
	private char sexo;
	private ArrayList<String> telefones;
	
	
	public Pessoa(int id, String cpf, String nome, Date dataDeNascimento, String endereco, String email, char sexo, ArrayList<String> telefones){
		this.id = id;
		this.cpf = cpf;
		this.nome = nome;
		this.dataDeNascimento = dataDeNascimento;
		this.endereco = endereco;
		this.email = email;
		this.sexo = sexo;
		this.telefones = telefones;		
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
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


	public Date getDataDeNascimento() {
		return dataDeNascimento;
	}


	@SuppressWarnings("deprecation")
	public void setDataDeNascimento(Date dataDeNascimento) {
		Date hoje = new Date ();
		if (dataDeNascimento.getYear() > hoje.getYear())
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
		if (email.contains("@hotmail.com") || email.contains("@gmail.com") || email.contains("@yahoo.com.br"))
			this.email = email;
	}


	public char getSexo() {
		return sexo;
	}


	public void setSexo(char sexo) {
		if (sexo == 'm' || sexo == 'M' || sexo == 'f' || sexo == 'F')
			this.sexo = sexo;
	}


	public ArrayList<String> getTelefones() {
		return telefones;
	}


	public void setTelefones(ArrayList<String> telefones) {
		this.telefones = telefones;
	}	
}
