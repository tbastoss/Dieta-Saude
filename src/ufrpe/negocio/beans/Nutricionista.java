package ufrpe.negocio.beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Nutricionista extends Funcionario{
	
	
	public Nutricionista(int id, int tipoPessoa, String cpf, String nome,
			Calendar dataDeNascimento, String endereco, String email,
			boolean sexo, ArrayList<String> telefones, int tipoFuncionario) {
		super(id, tipoPessoa, cpf, nome, dataDeNascimento, endereco, email, sexo,
				telefones, tipoFuncionario);
	}
}
