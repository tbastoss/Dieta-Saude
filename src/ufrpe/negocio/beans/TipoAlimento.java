package ufrpe.negocio.beans;

public class TipoAlimento {
	private int id;
	private String descricao;
	
	public TipoAlimento (int id, String descricao){
		this.id = id;
		this.descricao = descricao;
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
}
