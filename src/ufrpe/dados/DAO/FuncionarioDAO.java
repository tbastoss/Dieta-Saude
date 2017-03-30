package ufrpe.dados.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ufrpe.dados.DAO.interfaces.IFuncionarioDAO;
import ufrpe.negocio.beans.Funcionario;
import ufrpe.negocio.beans.Pessoa;

public class FuncionarioDAO implements IFuncionarioDAO{
	private static FuncionarioDAO instance;
	private BancoConnection connection;
	
	//SINGLETON
	private FuncionarioDAO (){
		this.connection = BancoConnection.getInstance();
	}
	
	public static FuncionarioDAO getInstance (){
		if (instance == null){
			instance = new FuncionarioDAO();
		}
		return instance;
	}

	@Override
	public void cadastraFuncionario(Funcionario funcionario) throws SQLException {
		String query = "insert into dieta_saude.funcionario (cpf_fun, tipo) values (?, ?)";
		PreparedStatement ps = (PreparedStatement) this.connection.retornoStatement(query);
		ps.setString(1, funcionario.getCpf());
		boolean tipo = false;
		if (funcionario.getTipoFuncionario() == 1)
			tipo = true;
		ps.setBoolean(2, tipo);
		ps.execute();
	}

	@Override
	public ArrayList<Funcionario> listarFuncionario() throws SQLException {
		ArrayList<Funcionario> funcionarios = new ArrayList();
		String query = "select * from dieta_saude.funcionario";
		
		ResultSet resultSet = connection.comandoSQL(query);
		while (resultSet.next()){
			//INFO FUNCIONARIO
			String cpf = resultSet.getString("cpf_fun");
			int tipo = 0;
			boolean tipoSchema = resultSet.getBoolean("tipo");
			if (tipoSchema == true)
				tipo = 1;

			Funcionario fun = new Funcionario (-1, 0, cpf, null, null, null, null, false, null, null, tipo);
			funcionarios.add(fun);
			
		}
		return funcionarios;
	}
	
	public static void main (String [] args)throws SQLException{
		FuncionarioDAO funRep = FuncionarioDAO.getInstance();
		ArrayList<Funcionario> funs = funRep.listarFuncionario();
		System.out.println(funs.toString());
	}
	
}
