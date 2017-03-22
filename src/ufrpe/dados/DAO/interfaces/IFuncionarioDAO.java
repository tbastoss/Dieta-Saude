package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.Funcionario;

public interface IFuncionarioDAO {
	public void cadastraFuncionario (Funcionario funcionario) throws SQLException;
	public ArrayList<Funcionario> listarFuncionario () throws SQLException;
}
