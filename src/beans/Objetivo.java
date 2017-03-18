package beans;

public class Objetivo {
	private int id;
	private String descricao;
	
	public Objetivo (int id, String descricao){
		this.id = id;
		this.descricao = descricao;
	}

	public int getId() {
		return id;
	}

	public String getDescricao() {
		return descricao;
	}
}
