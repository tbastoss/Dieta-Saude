package beans;

import java.util.ArrayList;
import java.util.Date;

public class Pessoa {
	private int id;
	private String cpf;
	private String nome;
	private Date dataDeNascimento;
	private String endere�o;
	private String email;
	private char sexo;
	private ArrayList<String> telefones;
	
	
	public Pessoa(int id){
		this.id = id;
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


	public String getEndere�o() {
		return endere�o;
	}


	public void setEndere�o(String endere�o) {
		this.endere�o = endere�o;
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
