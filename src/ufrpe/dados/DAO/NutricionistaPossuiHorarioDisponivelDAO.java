package ufrpe.dados.DAO;

import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.GregorianCalendar;

import ufrpe.dados.DAO.interfaces.INutricionistaPossuiHorarioDisponivelDAO;
import ufrpe.negocio.beans.NutricionistaPossuiHorarioDisponivel;

public class NutricionistaPossuiHorarioDisponivelDAO implements INutricionistaPossuiHorarioDisponivelDAO {
	private static NutricionistaPossuiHorarioDisponivelDAO instance;
	private BancoConnection connection;
	
	//SINGLETON
	private NutricionistaPossuiHorarioDisponivelDAO (){
		this.connection = BancoConnection.getInstance();
	}
	
	public static NutricionistaPossuiHorarioDisponivelDAO getInstance (){
		if (instance == null){
			instance = new NutricionistaPossuiHorarioDisponivelDAO();
		}
		return instance;
	}

	@Override
	public void cadastrarNutricionistaPossuiHorarioDisponivel(NutricionistaPossuiHorarioDisponivel horarioNutricionista) throws SQLException {
		String query = "insert into dieta_saude.nutricionista_possui_horario_disponivel(cpf_nut, cod_horario) values (?, ?)";
		PreparedStatement ps = (PreparedStatement) this.connection.retornoStatement(query);
		ps.setString(1, horarioNutricionista.getNut().getCpf());
		ps.setInt(2, horarioNutricionista.getHorario().getCod());
		ps.execute();
	}

	@Override
	public ArrayList<NutricionistaPossuiHorarioDisponivel> listarNutricionistaPossuiHorarioDisponivelDAO() throws SQLException {
		return null;
	}
	
	
}
