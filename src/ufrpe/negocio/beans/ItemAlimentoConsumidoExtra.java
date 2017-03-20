package ufrpe.negocio.beans;

import java.util.Calendar;

//ALIMENTO CONSUMIDO QUE NAO ESTAVA PLANEJADO PELA DIETA E NAO EXISTIA NO BANCO
public class ItemAlimentoConsumidoExtra {
	private int id;
	private String descricao;
	private Calendar data;
	private int pontos;
	private int quantidade;
	
	public ItemAlimentoConsumidoExtra (int id, String descricao, Calendar data, 
			int pontos, int quantidade){
		this.id = id;
		this.descricao = descricao;
		this.data = data;
		this.pontos = pontos;
		this.quantidade = quantidade;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}
}


