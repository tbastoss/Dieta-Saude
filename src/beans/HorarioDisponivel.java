package beans;

import java.util.Calendar;

public class HorarioDisponivel {
	private int cod;
	private String descricao;
	private Calendar diaEHora;
	
	public HorarioDisponivel (int cod, String descricao, Calendar diaEHora){
		this.cod = cod;
		this.descricao = descricao;
		this.diaEHora = diaEHora;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public Calendar getDiaEHora() {
		return diaEHora;
	}

	public void setDiaEHora(Calendar diaEHora) {
		this.diaEHora = diaEHora;
	}
}
