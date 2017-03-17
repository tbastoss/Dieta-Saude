package beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Nutricionista extends Funcionario{
	private ArrayList<HorarioDisponivel> horarioDisponivel;
	
	public Nutricionista(int id, int tipoPessoa, String cpf, String nome,
			Calendar dataDeNascimento, String endereco, String email,
			boolean sexo, ArrayList<String> telefones, int tipoFuncionario, ArrayList<HorarioDisponivel> horarioDisponivel) {
		super(id, tipoPessoa, cpf, nome, dataDeNascimento, endereco, email, sexo,
				telefones, tipoFuncionario);
		this.horarioDisponivel = horarioDisponivel;
	}

	public ArrayList<HorarioDisponivel> getHorarioDisponivel() {
		return horarioDisponivel;
	}

	public void setHorarioDisponivel(ArrayList<HorarioDisponivel> horarioDisponivel) {
		this.horarioDisponivel = horarioDisponivel;
	}
}
