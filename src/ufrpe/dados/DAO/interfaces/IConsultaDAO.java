package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.Consulta;

public interface IConsultaDAO {
	public int cadastraConsulta (Consulta consulta) throws SQLException;
	public ArrayList<Consulta> listarFuncionario () throws SQLException;
}
