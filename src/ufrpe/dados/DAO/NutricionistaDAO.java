package ufrpe.dados.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ufrpe.dados.DAO.interfaces.INutricionistaDAO;
import ufrpe.negocio.beans.Nutricionista;
import ufrpe.negocio.beans.Funcionario;

public class NutricionistaDAO implements INutricionistaDAO{
	private static NutricionistaDAO instance;
	private BancoConnection connection;
	
	//SINGLETON
	private NutricionistaDAO (){
		this.connection = BancoConnection.getInstance();
	}
	
	public static NutricionistaDAO getInstance (){
		if (instance == null){
			instance = new NutricionistaDAO();
		}
		return instance;
	}

	@Override
	public void cadastrarNutricionista(Nutricionista nut) throws SQLException {
		String query = "insert into dieta_saude.nutricionista (cpf_nut) values (?)";
		PreparedStatement ps = (PreparedStatement) this.connection.retornoStatement(query);
		ps.setString(1, nut.getCpf());
		ps.execute();
	}

	@Override
	public ArrayList<Nutricionista> listarNutricionista() throws SQLException {
		ArrayList<Nutricionista> nutricionistas = new ArrayList();
		String query = "select * from dieta_saude.nutricionista";
		
		ResultSet resultSet = this.connection.comandoSQL(query);
		while(resultSet.next()){
			String cpf = resultSet.getString("cpf_nut");
			
			Nutricionista nut = new Nutricionista(-1, 0, cpf, null, null, null, null, false, null, null, 1);
			nutricionistas.add(nut);
			
		}
		return nutricionistas;
	}
	
	
}
