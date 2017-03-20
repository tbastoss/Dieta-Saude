package ufrpe.negocio.beans;

import java.util.Calendar;

/**FALTA COLOCAR O LAYOUT DA FICHA... NAO FIZ EM TOSTRING POIS NAO SABIA SE DEVERIA SER MAPEADA ASSIM.*/
class FichaDeAcompanhamento {
	private int id;
	private Calendar dataEmissao;
	private Paciente pat; //Alem das informações de paciente, pegar as informações da dieta desse paciente
	
	public FichaDeAcompanhamento(int id, Calendar dataEmissao, Paciente pat){
		this.id = id;
		this.dataEmissao = dataEmissao;
		this.pat = pat;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Calendar getDataEmissao() {
		return dataEmissao;
	}

	public void setDataEmissao(Calendar dataEmissao) {
		this.dataEmissao = dataEmissao;
	}

	public Paciente getPat() {
		return pat;
	}

	public void setPat(Paciente pat) {
		this.pat = pat;
	}
}
