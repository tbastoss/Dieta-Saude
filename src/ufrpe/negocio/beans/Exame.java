package ufrpe.negocio.beans;

import java.util.Calendar;

public class Exame {
	private int idExame;
	private String obs;
	private Calendar dataSolicitacao;
	private Calendar dataRealizacao;
	private TipoExame tipo;
	private Consulta consulta;
	
	public Exame (int idExame, String obs, Calendar dataSolicitacao, 
			Calendar dataRealizacao, TipoExame tipo, Consulta consulta){
		this.idExame = idExame;
		this.obs = obs;
		this.dataSolicitacao = dataSolicitacao;
		this.dataRealizacao = dataRealizacao;
		this.tipo = tipo;
		this.consulta = consulta;
	}

	public int getIdExame() {
		return idExame;
	}

	public void setIdExame(int idExame) {
		this.idExame = idExame;
	}

	public String getObs() {
		return obs;
	}

	public void setObs(String obs) {
		this.obs = obs;
	}

	public Calendar getDataSolicitacao() {
		return dataSolicitacao;
	}

	public void setDataSolicitacao(Calendar dataSolicitacao) {
		this.dataSolicitacao = dataSolicitacao;
	}

	public Calendar getDataRealizacao() {
		return dataRealizacao;
	}

	public void setDataRealizacao(Calendar dataRealizacao) {
		this.dataRealizacao = dataRealizacao;
	}

	public TipoExame getTipo() {
		return tipo;
	}

	public void setTipo(TipoExame tipo) {
		this.tipo = tipo;
	}

	public Consulta getConsulta() {
		return consulta;
	}

	public void setConsulta(Consulta consulta) {
		this.consulta = consulta;
	}
}
