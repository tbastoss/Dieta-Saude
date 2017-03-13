package beans;

import java.util.ArrayList;
import java.util.Date;

public class Paciente extends Pessoa{
	
	public Paciente(int id, String cpf, String nome, Date dataDeNascimento, String endereco, String email, char sexo, ArrayList<String> telefones) {
		super(id, cpf, nome, dataDeNascimento, endereco, email, sexo, telefones);
		
	}
}
