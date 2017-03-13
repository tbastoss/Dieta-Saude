package beans;

import java.util.ArrayList;
import java.util.Date;
	
public class Paciente extends Pessoa{
	private float peso;
	private int imc;
	private float altura;
	private boolean vegetariano;
	private boolean intoleranteLactose;
	private float tmb;
	private float fatorAtividade;
	private int pontosDiarios;
	private Dieta dieta;
	private Consulta consulta;
	
	
	public Paciente(int id, String cpf, String nome, Date dataDeNascimento, String endereco, String email, char sexo, ArrayList<String> telefones, float peso, float altura, boolean vegetariano, boolean intoleranteLactose, float fatorAtividade) {
		super(id, cpf, nome, dataDeNascimento, endereco, email, sexo, telefones);
		this.peso = peso;
		this.altura = altura;
		this.vegetariano = vegetariano;
		this.intoleranteLactose = intoleranteLactose;
		this.fatorAtividade = fatorAtividade;
	}


	public float getPeso() {
		return peso;
	}


	public void setPeso(float peso) {
		if(peso > 0)
			this.peso = peso;
	}


	public int getImc() {
		return imc;
	}


	public void setImc(int imc) {
		if (imc > 0)
			this.imc = imc;
	}


	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}


	public boolean isVegetariano() {
		return vegetariano;
	}


	public void setVegetariano(boolean vegetariano) {
		this.vegetariano = vegetariano;
	}


	public boolean isIntoleranteLactose() {
		return intoleranteLactose;
	}


	public void setIntoleranteLactose(boolean intoleranteLactose) {
		this.intoleranteLactose = intoleranteLactose;
	}


	public float getTmb() {
		return tmb;
	}


	public void setTmb(float tmb) {
		if (tmb > 0)
			this.tmb = tmb;
	}


	public float getFatorAtividade() {
		return fatorAtividade;
	}


	public void setFatorAtividade(float fatorAtividade) {
		if (this.getSexo() == 'm' || this.getSexo() == 'M'){
			if(fatorAtividade == 1.2 || fatorAtividade == 1.3 || fatorAtividade == 1.4 || fatorAtividade == 1.5 || fatorAtividade ==  1.6 || fatorAtividade == 1.8)
				this.fatorAtividade = fatorAtividade;
		}
		else {
			if(fatorAtividade == 1.2 || fatorAtividade == 1.3 || fatorAtividade == 1.35 || fatorAtividade == 1.45 || fatorAtividade ==  1.5 || fatorAtividade == 1.7)
				this.fatorAtividade = fatorAtividade;
		}
			
		
	}


	public int getPontosDiarios() {
		return pontosDiarios;
	}


	public void setPontosDiarios(int pontosDiarios) {
		if (pontosDiarios > 0)
			this.pontosDiarios = pontosDiarios;
	}


	public Dieta getDieta() {
		return dieta;
	}


	public void setDieta(Dieta dieta) {
		if (dieta != null)
		this.dieta = dieta;
	}


	public Consulta getConsulta() {
		return consulta;
	}


	public void setConsulta(Consulta consulta) {
		if (consulta != null)
			this.consulta = consulta;
	}
	
}
