package beans;

public class TipoExame {
	private int cod;
	private String Descricao;
	
	public TipoExame(int cod, String descricao){
		this.cod = cod;
		this.Descricao = descricao;
	}

	public int getCod() {
		return cod;
	}

	public void setCod(int cod) {
		this.cod = cod;
	}

	public String getDescricao() {
		return Descricao;
	}

	public void setDescricao(String descricao) {
		Descricao = descricao;
	}
}
