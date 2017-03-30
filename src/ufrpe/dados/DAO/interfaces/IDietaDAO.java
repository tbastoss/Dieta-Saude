package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.Dieta;

public interface IDietaDAO {
	public int cadastrarDieta(Dieta dieta) throws SQLException;
	public ArrayList<Dieta> listarDieta() throws SQLException;
}
