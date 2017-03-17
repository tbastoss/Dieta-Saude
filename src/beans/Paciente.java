package beans;

import java.util.ArrayList;
import java.util.Calendar;
	
public class Paciente extends Pessoa{
	private float peso_atual;
	private float peso_Inicial;
	private float imc_Atual;
	private float imc_Inicial;
	private float altura;
	private boolean vegetariano;
	private boolean intoleranteLactose;
	private float tmb;
	private float fatorAtividade;
	private ArrayList<Integer> pontosDiarios;
	private ArrayList <Dieta> dieta;
	private ArrayList <FichaDeAcompanhamento> fichaDeAcompanhamento;
	
	
	public Paciente(int id, int tipoPessoa, String cpf, String nome, Calendar dataDeNascimento, String endereco, String email, 
			boolean sexo, ArrayList<String> telefones, float peso_atual, float altura, boolean vegetariano, 
			boolean intoleranteLactose, float fatorAtividade) {
		super(id, tipoPessoa, cpf, nome, dataDeNascimento, endereco, email, sexo, telefones);
		this.peso_atual = peso_atual;
		this.peso_Inicial = peso_atual;
		this.altura = altura;
		this.vegetariano = vegetariano;
		this.intoleranteLactose = intoleranteLactose;
		this.setFatorAtividade(fatorAtividade);
		//this.setTmb();
	}
	
	public float getAltura() {
		return altura;
	}


	public void setAltura(float altura) {
		if (altura > 0)
			this.altura = altura;
	}


	public ArrayList<Dieta> getDieta() {
		return dieta;
	}


	public void setDieta(ArrayList<Dieta> dieta) {
		if (dieta != null)
			this.dieta = dieta;
	}


	public void setFatorAtividade(float fatorAtividade) {
		if (this.getSexo() == true){
			if(fatorAtividade == 1.2 || fatorAtividade == 1.3 || fatorAtividade == 1.4 || fatorAtividade == 1.5 || fatorAtividade ==  1.6 || fatorAtividade == 1.8)
				this.fatorAtividade = fatorAtividade;
		}
		else {
			if(fatorAtividade == 1.2 || fatorAtividade == 1.3 || fatorAtividade == 1.35 || fatorAtividade == 1.45 || fatorAtividade ==  1.5 || fatorAtividade == 1.7)
				this.fatorAtividade = fatorAtividade;
		}
	}

	public float getPeso_atual() {
		return peso_atual;
	}

	public void setPeso_atual(float peso_atual) {
		if (peso_atual > 0)
			this.peso_atual = peso_atual;
	}

	public float getPeso_Inicial() {
		return peso_Inicial;
	}

	public float getImc_Atual() {
		return imc_Atual;
	}

	public void setImc_Atual(float imc_Atual) {
		if(imc_Atual > 0)
			this.imc_Atual = imc_Atual;
	}

	public float getImc_Inicial() {
		return imc_Inicial;
	}

	public void setImc_Inicial(float imc_Inicial) {
		if (imc_Inicial > 0)
			this.imc_Inicial = imc_Inicial;
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

	private void setTmb(int idade, boolean sexo, float peso) {
		int ano = Calendar.getInstance().get(Calendar.YEAR);
		idade = ano - this.getDataDeNascimento().YEAR;
	}

	public ArrayList<Integer> getPontosDiarios() {
		return pontosDiarios;
	}

	public void setPontosDiarios(ArrayList<Integer> pontosDiarios) {
		if (pontosDiarios != null)
			this.pontosDiarios = pontosDiarios;
	}
	
}
