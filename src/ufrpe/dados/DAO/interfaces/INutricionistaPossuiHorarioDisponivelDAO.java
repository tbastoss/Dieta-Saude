package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.NutricionistaPossuiHorarioDisponivel;

public interface INutricionistaPossuiHorarioDisponivelDAO {
	public void cadastrarNutricionistaPossuiHorarioDisponivel (NutricionistaPossuiHorarioDisponivel horarioNutricionista) throws SQLException;
	public ArrayList<NutricionistaPossuiHorarioDisponivel> listarNutricionistaPossuiHorarioDisponivelDAO () throws SQLException;
}
