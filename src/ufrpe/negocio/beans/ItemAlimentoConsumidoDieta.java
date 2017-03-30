package ufrpe.negocio.beans;

import java.util.Calendar;

public class ItemAlimentoConsumidoDieta {
	private Dieta dieta;
	private Alimento alimentoExtra;
	private int quantidade;
	private int pontos;
	private Calendar data;
	private boolean isDieta;
	private int id;
	
	public ItemAlimentoConsumidoDieta (Dieta id, Alimento alimentoExtra, int quantidade, 
			Calendar data){
		this.dieta = id;
		this.alimentoExtra = alimentoExtra;
		this.quantidade = quantidade;
		this.setPontos(quantidade, alimentoExtra);
		this.data = data;
	}
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public void setDieta(boolean isDieta) {
		this.isDieta = isDieta;
	}

	public boolean isDieta() {
		return this.isDieta;
	}

	public void setIsDieta(boolean isDieta) {
		this.isDieta = isDieta;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Dieta getDieta() {
		return dieta;
	}

	public void setDieta(Dieta d) {
		this.dieta = d;
	}

	public Alimento getAlimentoExtra() {
		return alimentoExtra;
	}

	public void setAlimentoExtra(Alimento alimentoExtra) {
		this.alimentoExtra = alimentoExtra;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int quatidade, Alimento a) {
		this.pontos = a.getPontos() * quantidade;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}
