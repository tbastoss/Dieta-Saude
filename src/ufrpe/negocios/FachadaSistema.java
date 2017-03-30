package ufrpe.negocios;

import java.sql.SQLException;

import ufrpe.excecoes.ExcecaoSistema;

public class FachadaSistema {
	private static FachadaSistema fachada;
	private LoginController login;
	
	private FachadaSistema(){
		login = LoginController.getInstance();
	}
	
	public static FachadaSistema getInstance(){
		if(fachada == null){
			fachada = new FachadaSistema();
		}
		return fachada;
	}

	public int autenticarUser(String cpf, String senha) throws SQLException,
			ExcecaoSistema {
		return login.autenticarUser(cpf, senha);
	}
	
	
	
	
	
	
}
