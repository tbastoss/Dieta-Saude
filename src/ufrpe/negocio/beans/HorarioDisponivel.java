package ufrpe.negocio.beans;

import java.util.Calendar;

public class HorarioDisponivel {
	private int cod;
	private String descricao;
	private Calendar diaEHoraInicio;
	private Calendar diaEHoraFim;
	
	public HorarioDisponivel (int cod, String descricao, Calendar diaEHoraInicio, Calendar diaEHoraFim){
		this.cod = cod;
		this.descricao = descricao;
		this.diaEHoraInicio = diaEHoraInicio;
		this.diaEHoraFim = diaEHoraFim;
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

	public Calendar getDiaEHoraInicio() {
		return diaEHoraInicio;
	}

	public void setDiaEHoraInicio(Calendar diaEHoraInicio) {
		this.diaEHoraInicio = diaEHoraInicio;
	}

	public Calendar getDiaEHoraFim() {
		return diaEHoraFim;
	}

	public void setDiaEHoraFim(Calendar diaEHoraFim) {
		this.diaEHoraFim = diaEHoraFim;
	}
}
