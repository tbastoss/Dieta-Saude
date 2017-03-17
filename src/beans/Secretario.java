package beans;

import java.util.ArrayList;
import java.util.Calendar;

public class Secretario extends Funcionario{

	public Secretario(int id, int tipoPessoa, String cpf, String nome,
			Calendar dataDeNascimento, String endereco, String email,
			boolean sexo, ArrayList<String> telefones, int tipoFuncionario) {
		super(id, tipoPessoa, cpf, nome, dataDeNascimento, endereco, email, sexo,
				telefones, tipoFuncionario);
	}
	public void marcacaoDeConsulta(Nutricionista nut, Paciente p){
		
	}
}
