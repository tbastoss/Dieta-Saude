package beans;

import java.util.Calendar;

public class HorarioDisponivel {
	private int cod;
	private String descricao;
	private	Calendar horaInicio;
	private Calendar horaFim;
	private Calendar dia;
	
	public HorarioDisponivel (int cod, String descricao, Calendar horaInicio, 
			Calendar horaFim, Calendar dia){
		this.cod = cod;
		this.descricao = descricao;
		this.horaInicio = horaInicio;
		this.horaFim = horaFim;
		this.dia = dia;
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

	public Calendar getHoraInicio() {
		return horaInicio;
	}

	public void setHoraInicio(Calendar horaInicio) {
		this.horaInicio = horaInicio;
	}

	public Calendar getHoraFim() {
		return horaFim;
	}

	public void setHoraFim(Calendar horaFim) {
		this.horaFim = horaFim;
	}

	public Calendar getDia() {
		return dia;
	}

	public void setDia(Calendar dia) {
		this.dia = dia;
	}
}
