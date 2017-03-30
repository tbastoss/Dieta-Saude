package ufrpe.negocio.beans;

public class Objetivo {
	private int id;
	private String descricao;
	
	public Objetivo (int id){
		this.setId(id);
		this.setDescricao();
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id){
		if (id <= 3 && id > 0)
			this.id = id;
	}

	public String getDescricao() {
		return descricao;
	}
	
	public void setDescricao(){
		if (id == 1)
			this.descricao = "PERDA DE PESO";
		else if(id == 2)
			this.descricao = "MANUTENCAO DO PESO";
		else if (id == 3)
			this.descricao = "GANHO DE PESO";
	}
}
