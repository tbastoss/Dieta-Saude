package beans;

import java.sql.Date;
import java.util.ArrayList;
import java.util.Calendar;

public class Secretario extends Funcionario{

	public Secretario(int id, int tipoPessoa, String cpf, String nome,
			Calendar dataDeNascimento, String endereco, String email,
			boolean sexo, ArrayList<String> telefones, int tipoFuncionario) {
		super(id, tipoPessoa, cpf, nome, dataDeNascimento, endereco, email, sexo,
				telefones, tipoFuncionario);
	}
	
	
	public void marcacaoDeConsulta(Nutricionista nut, Paciente pat, Calendar dia){
		Consulta nova = null;
		Date diaConsulta = (Date) dia.getTime();
		for(int i = 0; i < nut.getHorarioDisponivel().size(); i++){
			if(nut.getHorarioDisponivel().get(i).getDiaEHora().getInstance().getTime() == diaConsulta)
				nova = new Consulta(nut, pat, dia);
			else
				System.out.println("horario nao disponivel");
		}
	}
}
