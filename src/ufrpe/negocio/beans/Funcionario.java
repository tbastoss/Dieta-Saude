package ufrpe.negocio.beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Funcionario extends Pessoa{
	private int tipoFuncionario; //0 para secretario e 1 para nutricionista

	public Funcionario(int id, int tipoPessoa, String cpf, String nome,
			Calendar dataDeNascimento, String endereco, String email,
			boolean sexo, ArrayList<String> telefones, int tipoFuncionario) {
		super(id, tipoPessoa, cpf, nome, dataDeNascimento, endereco, email, sexo,
				telefones);
		this.tipoFuncionario = tipoFuncionario;
	}

	public int getTipoFuncionario() {
		return tipoFuncionario;
	}

	public void setTipoFuncionario(int tipoFuncionario) {
		if (tipoFuncionario == 0 || tipoFuncionario == 1)
			this.tipoFuncionario = tipoFuncionario;
	}
	
	
}
