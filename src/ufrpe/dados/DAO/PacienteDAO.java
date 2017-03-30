package ufrpe.dados.DAO;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.dados.DAO.interfaces.IPacienteDAO;
import ufrpe.negocio.beans.FatorAtividade;
import ufrpe.negocio.beans.Paciente;
import ufrpe.negocio.beans.Pessoa;
import ufrpe.negocio.beans.Tmb;

public class PacienteDAO implements IPacienteDAO {
	private static PacienteDAO instance;
	private BancoConnection connection;
	
	private PacienteDAO() {
		this.connection = BancoConnection.getInstance();
	}
	
	public static PacienteDAO getInstance(){
		if (instance == null)
			instance = new PacienteDAO();
		return instance;
	}
	
	@Override
	public void cadastrarPaciente(Paciente paciente) throws SQLException {
		String query = "insert into dieta_saude.paciente (cpf_pac, id_fator, id_tmb, imc_atual, IMC_inicial, peso_inicial, intol_lactose, vegetariano, altura, peso_atual) values (?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";
		PreparedStatement ps = (PreparedStatement)this.connection.retornoStatement(query);
		ps.setString(1, paciente.getCpf());
		ps.setInt(2, paciente.getFatorAtividade().getId());
		ps.setInt(3, paciente.getTmb().getId());
		ps.setFloat(4, 0);
		ps.setFloat(5, 0);
		ps.setFloat(6, paciente.getPeso_Inicial());
		ps.setBoolean(7, paciente.isIntoleranteLactose());
		ps.setBoolean(8, paciente.isVegetariano());
		ps.setFloat(9, paciente.getAltura());
		ps.setFloat(10, paciente.getPeso_Inicial());
		ps.execute();		
	}

	@Override
	public ArrayList<Paciente> listarPacientes() throws SQLException {
		ArrayList <Paciente> pacientes = new ArrayList();
		String query = "select * from dieta_saude.paciente";
		
		ResultSet resultSet = this.connection.comandoSQL(query);
		while (resultSet.next()){
			String cpf_pac = resultSet.getString("cpf_pac");
			int id_fator = resultSet.getInt("id_fator");
			int id_tmb = resultSet.getShort("id_tmb");
			float imc_atual = resultSet.getFloat("imc_atual");
			float IMC_inicial = resultSet.getFloat("IMC_inicial");
			float peso_inicial = resultSet.getFloat("peso_inicial");
			boolean intol_lactose = resultSet.getBoolean("intol_lactose");
			boolean vegetariano = resultSet.getBoolean("vegetariano");
			float altura = resultSet.getFloat("altura");
			float peso_atual = resultSet.getFloat("peso_atual");
			
			FatorAtividade fa = new FatorAtividade(id_fator);
			Tmb tmb = new Tmb();
			tmb.setId(id_tmb);
			boolean sexo = false;
			if(id_fator > 0 && id_fator <= 6)
				sexo = true;
			
			
			Paciente pac = new Paciente(-1, 1, cpf_pac, null, null, null, null, sexo, null, null, peso_atual, altura, vegetariano, intol_lactose, fa, tmb);
			pacientes.add(pac);	
		}
		return pacientes;
	}
	
}
