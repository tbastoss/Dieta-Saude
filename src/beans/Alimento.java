package beans;

import java.util.ArrayList;

public class Alimento {
	private int id;
	private String descricao;
	private int pontos;
	private TipoAlimento tipo;
	private ArrayList <Substancia> substancias;
	
	public Alimento (int id, String descricao, int pontos, 
			TipoAlimento tipo, ArrayList <Substancia> substancias){
		this.id = id;
		this.descricao = descricao;
		this.pontos = pontos;
		this.tipo = tipo;
		this.substancias = substancias;
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

	public int getPontos() {
		return pontos;
	}

	public void setPontos(int pontos) {
		this.pontos = pontos;
	}

	public TipoAlimento getTipo() {
		return tipo;
	}

	public void setTipo(TipoAlimento tipo) {
		this.tipo = tipo;
	}

	public ArrayList<Substancia> getSubstancias() {
		return substancias;
	}

	public void setSubstancias(ArrayList<Substancia> substancias) {
		this.substancias = substancias;
	}
}
