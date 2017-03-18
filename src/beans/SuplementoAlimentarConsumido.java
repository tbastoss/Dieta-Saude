package beans;

import java.util.Calendar;

public class SuplementoAlimentarConsumido {
	private int id;
	private SuplementoAlimentar suplementoConsumido;
	private int quantidade;
	private int pontosConsumidos;
	private Calendar data;
	
	public SuplementoAlimentarConsumido(int id, SuplementoAlimentar suplementoConsumido, 
			int quantidade, int pontosConsumidos, Calendar data) {
		this.id = id;
		this.suplementoConsumido = suplementoConsumido;
		this.quantidade = quantidade;
		this.setPontosConsumidos(suplementoConsumido);
		this.data = data;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public SuplementoAlimentar getSuplementoConsumido() {
		return suplementoConsumido;
	}

	public void setSuplementoConsumido(SuplementoAlimentar suplementoConsumido) {
		this.suplementoConsumido = suplementoConsumido;
	}

	public int getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(int quantidade) {
		this.quantidade = quantidade;
	}

	public int getPontosConsumidos() {
		return pontosConsumidos;
	}

	public void setPontosConsumidos(SuplementoAlimentar sup) {
		this.pontosConsumidos = sup.getPontos() * this.quantidade;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}
}
