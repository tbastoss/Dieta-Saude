package ufrpe.dados.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ufrpe.dados.DAO.interfaces.IPessoaDAO;
import ufrpe.negocio.beans.Pessoa;

public class PessoaDAO implements IPessoaDAO{
	private static PessoaDAO instance;
	private BancoConnection connection;
	
	//SINGLETON
	private PessoaDAO (){
		this.connection = BancoConnection.getInstance();
	}
	
	public static PessoaDAO getInstance (){
		if (instance == null){
			instance = new PessoaDAO();
		}
		return instance;
	}
	
	@Override
	public void cadastrarPessoa(Pessoa pessoa) throws SQLException{
		String query = "insert into dieta_saude.pessoa(cpf, senha, nome, data_nascimento, endereco, email, sexo, tipo) values (?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = (PreparedStatement) this.connection.retornoStatement(query);
		ps.setString(1, pessoa.getCpf());
		ps.setString(2, pessoa.getSenha());
		ps.setString(3, pessoa.getNome());
		ps.setDate(4, new java.sql.Date(pessoa.getDataDeNascimento().getTime().getTime())); //DATA
		ps.setString(5, pessoa.getEndereco());
		ps.setString(6, pessoa.getEmail());
		ps.setString(7, pessoa.getSexo() ? "M":"F");
		boolean tipo = true;
		if (pessoa.getTipoPessoa() == 0)
			tipo = false;
		ps.setBoolean(8, tipo);
		ps.execute();
	}

	@Override
	public ArrayList<Pessoa> listarPessoa() throws SQLException{
		ArrayList<Pessoa> pessoas = new ArrayList();
		String query = "select * from dieta_saude.pessoa";
		int i = 0;
		
		ResultSet resultSet = connection.comandoSQL(query);
		while (resultSet.next()){
			
			//INFO PESSOA
			String cpf = resultSet.getString("cpf");
			String senha = resultSet.getString("senha");
			String nome = resultSet.getString("nome");
			Date dataDeNascimento = resultSet.getDate("data_nascimento");
			@SuppressWarnings("deprecation")
			Calendar nasc = new GregorianCalendar (dataDeNascimento.getYear(), dataDeNascimento.getMonth(), dataDeNascimento.getDay());
			String endereco = resultSet.getString("endereco");
			String email = resultSet.getString("email");
			boolean sexo = true;
			String sexoString = resultSet.getString("sexo");
			if (sexoString == "M")
				sexo = true;
			else 
				sexo = false;
			int tipoPessoa = resultSet.getBoolean("tipo") ? 1:0;
			
			Pessoa pessoa = new Pessoa (i, tipoPessoa, cpf, nome, nasc, endereco, email, sexo, null, senha);
			pessoas.add(pessoa);
			i++;
		}
		return pessoas;
	}
	
}
