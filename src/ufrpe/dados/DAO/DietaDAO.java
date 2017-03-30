package ufrpe.dados.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import com.mysql.jdbc.Connection;

import ufrpe.dados.DAO.interfaces.IDietaDAO;
import ufrpe.negocio.beans.Dieta;
import ufrpe.negocio.beans.Objetivo;
import ufrpe.negocio.beans.Paciente;
import ufrpe.negocio.beans.TipoDieta;

public class DietaDAO implements IDietaDAO{
	private DietaDAO instance;
	private BancoConnection connection;
	
	private DietaDAO(){
		connection = this.connection.getInstance();
	}
	
	public DietaDAO getInstance(){
		if (instance == null)
			instance = new DietaDAO();
		return instance;
	}
	
	@Override
	public int cadastrarDieta(Dieta dieta) throws SQLException {
		String query = "insert into dieta_saude.dieta (id_objetivo, cpf_pac, id_tipo_dieta, dt_fim, dt_inicio, finalizada, extendida) values (?, ?, ?, ?, ?, ?, ?)";
		Connection con = (Connection) connection.getConnection();
		PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setInt(1, dieta.getObjetivo().getId());
		ps.setString(2, dieta.getPat().getCpf());
		ps.setInt(3, dieta.getTipo().getId());
		ps.setDate(4, new java.sql.Date(dieta.getDataFim().getTime().getTime()));
		ps.setDate(5, new java.sql.Date(dieta.getDataInicio().getTime().getTime()));
		ps.setBoolean(6, dieta.isFinalizada());
		ps.setBoolean(7, dieta.isProlongada());
		ps.execute();
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		
		int i = rs.getInt(1);
		
		return i;
		
	}

	@Override
	public ArrayList<Dieta> listarDieta() throws SQLException {
		ArrayList<Dieta> dietas = new ArrayList();
		String query = "select * from dieta_saude.dieta";
		
		ResultSet resultSet = this.connection.comandoSQL(query);
		while (resultSet.next()){
			int id_dieta = resultSet.getInt("id_dieta");
			int id_objetivo = resultSet.getInt("id_objetivo");
			String cpf_pac = resultSet.getString("cpf_pac");
			int id_tipo_dieta = resultSet.getInt("id_tipo_dieta");
			
			Date dia1 = resultSet.getDate("dt_fim");
			@SuppressWarnings("deprecation")
			Calendar dt_fim = new GregorianCalendar(dia1.getYear(), dia1.getMonth(), dia1.getDay());
			
			Date dia2 = resultSet.getDate("dt_inicio");
			@SuppressWarnings("deprecation")
			Calendar dt_inicio = new GregorianCalendar(dia2.getYear(), dia2.getMonth(), dia2.getDay());
			
			boolean finalizada = resultSet.getBoolean("finalizada");
			boolean extendida = resultSet.getBoolean("extendida");
			
			Objetivo o = new Objetivo(id_objetivo);
			Paciente pac = new Paciente();
			pac.setCpf(cpf_pac);
			TipoDieta td = new TipoDieta(id_tipo_dieta);
			
			Dieta a = new Dieta(extendida, finalizada, dt_inicio, dt_fim, o, pac, td, null);
			dietas.add(a);
			
			
		}
		return null;
	}
	
	
}
