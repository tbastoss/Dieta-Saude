package ufrpe.negocio.beans;

public class TipoDieta {
	private int id;
	private String descricao;
	
	public TipoDieta (int id){
		this.setId(id);
		this.setDescricao();
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		if (id > 0 && id <= 3);
			this.id = 0;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao() {
		if (id == 1)
			this.descricao = "SEM LACTOSE";
		else if (id  == 2)
			this.descricao = "SEM CAFEINA";
		else if (id == 3)
			this.descricao = "NORMAL";
	}
}
