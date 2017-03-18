package beans;

import java.util.Calendar;

public class ItemAlimentoConsumidoDieta {
	private int id;
	private Alimento alimentoExtra;
	private int quantidade;
	private int pontos;
	private Calendar data;
	
	public ItemAlimentoConsumidoDieta (int id, Alimento alimentoExtra, int quantidade, 
			int pontos, Calendar data){
		this.id = id;
		this.alimentoExtra = alimentoExtra;
		this.quantidade = quantidade;
		this.pontos = pontos;
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}
