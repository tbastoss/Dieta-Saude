package ufrpe.negocio.beans;

import java.util.Calendar;

public class Tmb {
	private int id;
	private boolean sexo; // true M false F
	private FatorAtividade valorFA;
	private Calendar dt_inicio;
	private Calendar dt_fim;
	private int pontos;
	
	public Tmb () {}
	
	public Tmb (int id, boolean sexo, FatorAtividade valorFA, String descricao, Calendar dt_inicio, Calendar dt_fim, int pontos){
		this.id = id;
		this.sexo = sexo;
		this.valorFA = valorFA;
		this.dt_inicio = dt_inicio;
		this.dt_fim = dt_fim;
		this.pontos = pontos;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isSexo() {
		return sexo;
	}

	public void setSexo(boolean sexo) {
		this.sexo = sexo;
	}

	public FatorAtividade getValorFA() {
		return valorFA;
	}

	public void setValorFA(FatorAtividade valorFA) {
		this.valorFA = valorFA;
	}

	public Calendar getDt_inicio() {
		return dt_inicio;
	}

	public void setDt_inicio(Calendar dt_inicio) {
		this.dt_inicio = dt_inicio;
	}

	public Calendar getDt_fim() {
		return dt_fim;
	}

	public void setDt_fim(Calendar dt_fim) {
		this.dt_fim = dt_fim;
	}

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}
}
