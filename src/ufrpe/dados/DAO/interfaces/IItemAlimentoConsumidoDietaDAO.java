package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.ItemAlimentoConsumidoDieta;

public interface IItemAlimentoConsumidoDietaDAO {
	public int cadastratItemAlimentoConsumidoDieta(ItemAlimentoConsumidoDieta a) throws SQLException;
	public ArrayList<ItemAlimentoConsumidoDieta> listarItemAlimnentoConsumidoDieta() throws SQLException;
	public void deletarItemAlimentoConsumidoDieta (ItemAlimentoConsumidoDieta a) throws SQLException;
}
