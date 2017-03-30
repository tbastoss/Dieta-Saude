package ufrpe.negocios;

import java.sql.SQLException;
import java.util.ArrayList;

import ufrpe.dados.DAO.PessoaDAO;
import ufrpe.dados.DAO.interfaces.IPessoaDAO;
import ufrpe.excecoes.ExcecaoSistema;
import ufrpe.excecoes.UsuarioNaoExistente;
import ufrpe.negocio.beans.Pessoa;

public class LoginController {
	private static LoginController instance;
	private IPessoaDAO repPessoa;
	
	private LoginController(){
		repPessoa = PessoaDAO.getInstance();
	}
	
	public static LoginController getInstance(){
		if(instance == null){
			instance = new LoginController();
		}
		return instance;
	}
	
	public int autenticarUser(String cpf, String senha) throws SQLException, ExcecaoSistema{
		Pessoa p = this.existePessoa(cpf);
		if(p != null){
			if(p.getSenha().equals(senha)){
				return p.getTipoPessoa();
			}else{
				throw new ExcecaoSistema("Senha Incorreta", 1);
			}
		}else{
			throw new ExcecaoSistema("Usuário não cadastrado", 2);
		}
	}
	
	private Pessoa existePessoa(String cpf) throws SQLException{
		Pessoa retorno = null;
		ArrayList<Pessoa> lista = repPessoa.listarPessoa();
		for(Pessoa p : lista){
			if(p.getCpf().equals(cpf)){
				retorno = p;
				break;
			}
		}
		return retorno;
	}
	
	
}
