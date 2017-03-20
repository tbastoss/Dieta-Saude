package ufrpe.negocio.beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Refeicao {
	private int id;
	private String descricao;
	private boolean realizada;
	private int diaDaSemana; //0-7
	private boolean isRefeiaoExatra;
	private ArrayList <Alimento> alimentos;
	private ArrayList <Dieta> ditasUtilizandoRefeicao;
	private int pontos;
	
	public Refeicao (int id, String descricao, boolean realizada, 
			int diaDaSemana, boolean isRefeicaoExtra, ArrayList<Alimento> alimentos){
		this.id = id;
		this.descricao = descricao;
		this.realizada = realizada;
		this.diaDaSemana = diaDaSemana;
		this.isRefeiaoExatra = isRefeicaoExtra;
		this.alimentos = alimentos;
		this.setPontos(alimentos);
		this.ditasUtilizandoRefeicao = new ArrayList<Dieta>();
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

	public boolean isRealizada() {
		return realizada;
	}

	public void setRealizada(boolean realizada) {
		this.realizada = realizada;
	}

	public int getDiaDaSemana() {
		return diaDaSemana;
	}

	public void setDiaDaSemana(int diaDaSemana) {
		this.diaDaSemana = diaDaSemana;
	}

	public boolean isRefeiaoExatra() {
		return isRefeiaoExatra;
	}

	public void setRefeiaoExatra(boolean isRefeiaoExatra) {
		this.isRefeiaoExatra = isRefeiaoExatra;
	}

	public ArrayList<Alimento> getAlimentos() {
		return alimentos;
	}

	public void setAlimentos(ArrayList<Alimento> alimentos) {
		this.alimentos = alimentos;
	}

	public int getPontos() {
		return pontos;
	}

	private void setPontos(ArrayList<Alimento> alimentos) {
		for(int i = 0; i < alimentos.size(); i++){
			this.pontos += alimentos.get(i).getPontos();
		}
	}
}
