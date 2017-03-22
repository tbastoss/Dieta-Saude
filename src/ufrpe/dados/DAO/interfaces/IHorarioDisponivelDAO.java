package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.HorarioDisponivel;

public interface IHorarioDisponivelDAO {
	public int cadastrarHoriarioDisponivel (HorarioDisponivel hp) throws SQLException;
	public ArrayList<HorarioDisponivel> listarHorarioDisponivel () throws SQLException;
}
