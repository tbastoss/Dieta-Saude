package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.Pessoa;

public interface IPessoaDAO {
	public void cadastrarPessoa(Pessoa pessoa) throws SQLException;
	public ArrayList<Pessoa> listarPessoa () throws SQLException;
}
