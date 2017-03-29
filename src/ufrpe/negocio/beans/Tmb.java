package ufrpe.negocio.beans;

public class Tmb {
	private static int id = 20;
	private boolean sexo; // true M false F
	private float fator;
	private String descricao;
	
	public Tmb (boolean sexo, float fator, String descricao){
		id++;
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

	public float getFator() {
		return fator;
	}

	public void setFator(float fator) {
		this.fator = fator;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
}
