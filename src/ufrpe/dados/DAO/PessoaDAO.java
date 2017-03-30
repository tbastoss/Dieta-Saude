package ufrpe.dados.DAO;

import java.sql.Connection;
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
		System.out.println("Cadastrou");
	}

	@Override
	public ArrayList<Pessoa> listarPessoa() throws SQLException{
		ArrayList<Pessoa> pessoas = new ArrayList();
		String query = "select * from dieta_saude.pessoa;";
		
		ResultSet resultSet = connection.comandoSQL(query);
		while (resultSet.next()){
			
			//INFO PESSOA
			String cpf = resultSet.getString("cpf");
			String senha = resultSet.getString("senha");
			String nome = resultSet.getString("nome");
			Date dataDeNascimento = resultSet.getDate("data_nascimento");
			//@SuppressWarnings("deprecation")
			Calendar nasc = Calendar.getInstance();
			nasc.setTime(dataDeNascimento);
			nasc = new GregorianCalendar (nasc.get(Calendar.MONTH), nasc.get(Calendar.DAY_OF_MONTH), nasc.get(Calendar.YEAR));
			//System.out.println(nasc);
			String endereco = resultSet.getString("endereco");
			String email = resultSet.getString("email");
			boolean sexo = true;
			String sexoString = resultSet.getString("sexo");
			if (sexoString == "M")
				sexo = true;
			else 
				sexo = false;
			int tipoPessoa = resultSet.getBoolean("tipo") ? 1:0;
			
			Pessoa pessoa = new Pessoa (-1, tipoPessoa, cpf, nome, nasc, endereco, email, sexo, null, senha);
			pessoas.add(pessoa);
		}
		return pessoas;
	}
	
	public static void main (String [] args){
		PessoaDAO repPessoa = PessoaDAO.getInstance();
		BancoConnection bc = BancoConnection.setInstance(4);
		Calendar data_nasc = Calendar.getInstance();
		data_nasc.set(Calendar.MONTH, 3);
		data_nasc.set(Calendar.DAY_OF_MONTH, 16);
		data_nasc.set(Calendar.YEAR, 1996);	
		Connection con = bc.getConnection();
		
		Pessoa a  = new Pessoa(0, 1, "12345678901", "testJava", data_nasc, "endMeu", "emailMeu@hotmail.com", true, null, "1234");
		try{
			repPessoa.cadastrarPessoa(a);
			con.commit();
				
		}catch(SQLException e){
			try {
				System.out.println(e.getMessage());
				con.rollback();
			} catch (SQLException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		}
//		ArrayList<Pessoa> pessoas = repPessoa.listarPessoa();
		//System.out.println(pessoas);
	}
	
}
