package ufrpe.negocio.beans;

public class HistoricoPeso {
	private int id;
	private boolean infoPeloPac;
	private float peso;
	
	public HistoricoPeso(int id, boolean infoPeloPac, float peso){
		this.id = id;
		this.infoPeloPac = infoPeloPac;
		this.peso = peso;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public boolean isInfoPeloPac() {
		return infoPeloPac;
	}

	public void setInfoPeloPac(boolean infoPeloPac) {
		this.infoPeloPac = infoPeloPac;
	}

	public float getPeso() {
		return peso;
	}

	public void setPeso(float peso) {
		this.peso = peso;
	}
}
