package beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Consulta {
	private Nutricionista nut;
	private Paciente pat;
	private Calendar data;
	private boolean efetivada;
	private ArrayList<Exame> exames;
	
	public Consulta (Nutricionista nut, Paciente pat, Calendar data){
		this.nut = nut;
		this.pat = pat;
		this.data = data;
		this.efetivada = false;	
		this.exames = new ArrayList();
	}

	public Nutricionista getNut() {
		return nut;
	}

	public void setNut(Nutricionista nut) {
		this.nut = nut;
	}

	public Paciente getPat() {
		return pat;
	}

	public void setPat(Paciente pat) {
		this.pat = pat;
	}

	public Calendar getData() {
		return data;
	}

	public void setData(Calendar data) {
		this.data = data;
	}

	public boolean isEfetivada() {
		return efetivada;
	}

	public void setEfetivada(boolean efetivada) {
		this.efetivada = efetivada;
	}

	public ArrayList<Exame> getExames() {
		return exames;
	}

	public void setExames(ArrayList<Exame> exames) {
		this.exames = exames;
	}
	
}
