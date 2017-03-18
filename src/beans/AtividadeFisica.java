package beans;

public class AtividadeFisica {
	private int id;
	private TipoAtividadeFisica tipo;
	private float periodo;
	
	public AtividadeFisica (int id, TipoAtividadeFisica tipo, float periodo){
		this.id = id;
		this.tipo = tipo;
		this.periodo = periodo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public TipoAtividadeFisica getTipo() {
		return tipo;
	}

	public void setTipo(TipoAtividadeFisica tipo) {
		this.tipo = tipo;
	}

	public float getPeriodo() {
		return periodo;
	}

	public void setPeriodo(float periodo) {
		this.periodo = periodo;
	}
}
