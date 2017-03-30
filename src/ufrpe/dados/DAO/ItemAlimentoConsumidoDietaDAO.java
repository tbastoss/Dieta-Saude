package ufrpe.dados.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

import ufrpe.dados.DAO.interfaces.IItemAlimentoConsumidoDietaDAO;
import ufrpe.negocio.beans.Alimento;
import ufrpe.negocio.beans.Dieta;
import ufrpe.negocio.beans.ItemAlimentoConsumidoDieta;

public class ItemAlimentoConsumidoDietaDAO implements
		IItemAlimentoConsumidoDietaDAO {
	private static ItemAlimentoConsumidoDietaDAO instance;
	private BancoConnection connection;
	
	public static ItemAlimentoConsumidoDietaDAO getInstance(){
		if(instance == null){
			instance = new ItemAlimentoConsumidoDietaDAO();
		}
		return instance;
	}
	
	private ItemAlimentoConsumidoDietaDAO() {
		this.connection = BancoConnection.getInstance();
	}
	
	@Override
	public int cadastratItemAlimentoConsumidoDieta(ItemAlimentoConsumidoDieta a)
			throws SQLException {
		String query = "INSERT INTO dieta_saudo.alimento_consumido_dieta(cod_alimento, id_dieta, e_alimento_extra, "
				+ "data_consumo, quantidade, pontos) values(?,?,?,?,?,?)";
		Connection con = connection.getConnection();
		PreparedStatement ps = (PreparedStatement)con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS); 
		ps.setInt(1, a.getAlimentoExtra().getId());
		ps.setInt(2, a.getDieta().getId());
		ps.setBoolean(3, ((ItemAlimentoConsumidoDieta) a).isDieta());
		ps.setDate(4, new java.sql.Date(a.getData().getTime().getTime()));
		ps.setInt(5, a.getQuantidade());
		ps.setInt(6, a.getPontos());
		ps.execute();
		
		ResultSet rs = ps.getGeneratedKeys();
		rs.next();
		
		int i = rs.getInt(1);
		return i;
	}

	@Override
	public ArrayList<ItemAlimentoConsumidoDieta> listarItemAlimnentoConsumidoDieta()
			throws SQLException {
		ArrayList<ItemAlimentoConsumidoDieta> retorno = new ArrayList<ItemAlimentoConsumidoDieta>();
		String query = "SELECT * FROM dieta_saude.alimento_consumido_dieta";
		ResultSet rs = connection.comandoSQL(query);
		while(rs.next()){
			int id = rs.getInt("seq");
			int cod_alimento = rs.getInt("cod_alimento");
			int cod_dieta = rs.getInt("cod_dieta");
			boolean e_alimento_extra = rs.getBoolean("e_alimento_extra");
			Date data = rs.getDate("data_consumo");
			int quantidade = rs.getInt("quantidade");
			int pontos = rs.getInt("pontos");
			Dieta d = new Dieta();
			d.setId(cod_dieta);
			Alimento a = new Alimento();
			a.setId(cod_alimento);
			Calendar c = new GregorianCalendar(data.getYear(), data.getMonth(), data.getDay());
			ItemAlimentoConsumidoDieta item = new ItemAlimentoConsumidoDieta(d, a, quantidade, c);
			item.setId(id);
			item.setPontos(pontos);
			item.setDieta(e_alimento_extra);
			retorno.add(item);
		}	
		return retorno;
	}

	//TESTAR PARA V SE ESTÁ DELETANDO.
	@Override
	public void deletarItemAlimentoConsumidoDieta(ItemAlimentoConsumidoDieta a) throws SQLException {
		String query = "DELETE FROM dieta_saude.alimento_consumido_dieta WHERE seq = ?";
		Connection con = connection.getConnection();
		PreparedStatement ps = (PreparedStatement)con.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		ps.setInt(1, a.getId());
		ps.execute();
	}
}
