package ufrpe.negocio.beans;

public class SuplementoAlimentar {
	private int id;
	private String descricao;
	private int pontos;
	
	public SuplementoAlimentar(int id, String descricao, int pontos){
		this.id = id;
		this.descricao = descricao;
		this.pontos = pontos;
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
}
