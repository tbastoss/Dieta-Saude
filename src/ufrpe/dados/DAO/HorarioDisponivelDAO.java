package ufrpe.dados.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import com.mysql.jdbc.Connection;

import ufrpe.dados.DAO.interfaces.IHorarioDisponivelDAO;
import ufrpe.negocio.beans.HorarioDisponivel;



public class HorarioDisponivelDAO implements IHorarioDisponivelDAO{
	private static HorarioDisponivelDAO instance;
	private BancoConnection connection;
	
	//SINGLETON
	private HorarioDisponivelDAO (){
		this.connection = BancoConnection.getInstance();
	}
	
	public static HorarioDisponivelDAO getInstance (){
		if (instance == null){
			instance = new HorarioDisponivelDAO();
		}
		return instance;
	}
	
	
	@Override
	public int cadastrarHoriarioDisponivel(HorarioDisponivel hp) throws SQLException {
		int id = 0;
		String query = "intsert into dieta_saude.horario_disponivel_nutricionista (cod, descricao, dia, hr_inicio, hr_fim) values (?, ?, ?, ?, ?)";
		Connection con = (Connection) connection.getConnection();
		PreparedStatement ps = con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);//(PreparedStatement) this.connection.retornoStatement(query);
		ps.setInt(1, hp.getCod());
		ps.setString(2, hp.getDescricao());
		ps.setDate(3, new java.sql.Date(hp.getDiaEHoraFim().getTime().getTime()));
		ps.setTime(4, new java.sql.Time(hp.getDiaEHoraInicio().getTimeInMillis()));
		ps.setTime(5, new java.sql.Time(hp.getDiaEHoraFim().getTimeInMillis()));
		ps.execute();
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		
		id = rs.getInt(1);
		
		return id;
	}

	@Override
	public ArrayList<HorarioDisponivel> listarHorarioDisponivel() throws SQLException {
		ArrayList <HorarioDisponivel> horariosDisponiveis = new ArrayList();
		String query = "SELECT * FROM dieta_saude.horario_disponivel_nutricionista";
		
		ResultSet resultSet = this.connection.comandoSQL(query);
		while (resultSet.next()){
			//INFO HORARIO DISPONIVEL
			int cod = resultSet.getInt("cod");
			String descricao = resultSet.getString("descricao");
			
			Date dia = resultSet.getDate("dia");
			@SuppressWarnings("deprecation")
			Calendar diaHoraInicio = new GregorianCalendar(dia.getYear(), dia.getMonth(), dia.getDay());
			diaHoraInicio.set(Calendar.HOUR_OF_DAY, resultSet.getTime("hr_inicio").getHours());
			
			Calendar diaHoraFim = new GregorianCalendar (dia.getYear(), dia.getMonth(), dia.getDay());
			diaHoraFim.set(Calendar.HOUR_OF_DAY, resultSet.getTime("hr_fim").getHours());
			
			HorarioDisponivel hp = new HorarioDisponivel (cod, descricao, diaHoraInicio, diaHoraFim);
			horariosDisponiveis.add(hp);			
		}
		return horariosDisponiveis;
	}
	
}
