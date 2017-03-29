package ufrpe.dados.DAO.interfaces;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.negocio.beans.Paciente;

public interface IPacienteDAO {
	public void cadastrarPaciente(Paciente paciente) throws SQLException;
	public ArrayList<Paciente> listarPacientes () throws SQLException;
}
