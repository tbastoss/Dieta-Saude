package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.Nutricionista;

public interface INutricionistaDAO {
	public void cadastrarNutricionista (Nutricionista nut) throws SQLException;
	public ArrayList<Nutricionista> listarNutricionista () throws SQLException;
}
