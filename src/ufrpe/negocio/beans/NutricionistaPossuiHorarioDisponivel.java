package ufrpe.negocio.beans;

public class NutricionistaPossuiHorarioDisponivel {
	private Nutricionista nut;
	private HorarioDisponivel horario;
	
	public NutricionistaPossuiHorarioDisponivel (Nutricionista nut, HorarioDisponivel hp){
		this.nut = nut;
		this.horario = hp;
	}
	
	public Nutricionista getNut() {
		return nut;
	}
	public void setNut(Nutricionista nut) {
		this.nut = nut;
	}
	public HorarioDisponivel getHorario() {
		return horario;
	}
	public void setHorario(HorarioDisponivel horario) {
		this.horario = horario;
	}
	
}
