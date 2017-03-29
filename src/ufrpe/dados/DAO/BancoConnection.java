package ufrpe.dados.DAO;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Level;
import java.util.logging.Logger;

import ufrpe.dados.DAO.interfaces.IBancoConnection;

public class BancoConnection implements IBancoConnection {
	private static BancoConnection instance;
	private Connection connection;
	private PreparedStatement statement;
	private ResultSet resultSet;
	
	//atributos static finals
	private final static String userAdm = "adnSistema";
	private final static String passAdm = "thiago1234";
	private final static String userNutricionista = "nutricionistaSistema";
	private final static String passNutricionista = "thiago1234";
	private final static String userSecretario = "secretarioSistema";
	private final static String passSecretario = "thiago1234";
	private final static String userPaciente = "pacienteSistema";
	private final static String passPaciente = "thiago1234";
	private static int usuario;
	private static int novoLogin;
	
	static {
		try{
			Class.forName("com.mysql.jdbc.Driver");
		}catch (Exception e){
			System.out.println("Nao carrega driver do MySQL!!!");
		}
	}
	
	public static BancoConnection setInstance(int i){
		novoLogin = i;
		if (novoLogin != usuario){
			usuario = i;
			instance = new BancoConnection(i);
		}else {
			if (instance == null){
				instance = new BancoConnection();
			}
		}
		System.out.println(usuario);
		return instance;
	}
	
	public static BancoConnection getInstance (){
		usuario = 2;
		if (instance == null){
			instance = new BancoConnection();
		}
		return instance;
	}
	
	private BancoConnection (){
		try{
			connection = setConnection (usuario);
			connection.setAutoCommit(false);
		}catch (SQLException ex){
			Logger.getLogger(BancoConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	private BancoConnection (int user){
		try{
			connection = setConnection(user);
		}catch (SQLException ex){
			Logger.getLogger(BancoConnection.class.getName()).log(Level.SEVERE, null, ex);
		}
	}
	
	//FALTA TERMINAR POIS NAO ENTENDI	
	private Connection setConnection(int i) throws SQLException {
		Connection retorno = null;
		switch (i){
		case 1:
			retorno = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dieta_saude?autoReconnect=true&useSSL=false",userNutricionista , passNutricionista); 
			retorno.setAutoCommit(false);
			System.out.println("Logou como nutricionista");
			break;
		case 2:
			retorno = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dieta_saude?autoReconnect=true&useSSL=false",userSecretario , passSecretario); 
			retorno.setAutoCommit(false);
			System.out.println("Logou como secretario");
			break;
		case 3:
			retorno = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dieta_saude?autoReconnect=true&useSSL=false",userPaciente , passPaciente); 
			retorno.setAutoCommit(false);
			System.out.println("Logou como paciente");
			break;
		case 4:
			retorno = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/dieta_saude?autoReconnect=true&useSSL=false",userAdm , passAdm);
			retorno.setAutoCommit(false);
			System.out.println("Logou como ADM");
			break;
		}
		return null;
	}/**/
	
	public PreparedStatement retornoStatement (String query){
		try{
			this.statement = (com.mysql.jdbc.PreparedStatement) this.connection.prepareStatement(query, PreparedStatement.RETURN_GENERATED_KEYS);
		}catch (SQLException ex){
			ex.getStackTrace();
		}
		return this.statement;
	}
	
	public ResultSet comandoSQL (String query){
		try{
			this.resultSet = this.statement.executeQuery();
		}catch (SQLException ex){
			ex.printStackTrace();
		}
		return this.resultSet;
	}
	
	public Connection getConnectionCommit(){
		try{
			this.connection.setAutoCommit(true);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return this.connection;
	}
	@Override
	public Connection getConnection() {
		try {
			this.connection.setAutoCommit(false);
		}catch (SQLException e){
			e.printStackTrace();
		}
		return this.connection;
	}

	@Override
	public void setConnectioNull() {
		this.connection = null;
		instance = null;		
	}

	@Override
	public boolean commit() throws SQLException {
		boolean comitou = false;
		try{
			this.connection.commit();
			comitou = true;
			System.out.println("comitou!");
		}catch (SQLException e){
			System.out.println("ERRO!!!");
			this.connection.rollback();
		}
		return comitou;
	}
	
	public static void setUsuario(int user){
		usuario = user;
	}
	
	public void closeConnection (){
		try {
			this.connection.close();
		}catch (SQLException e){
			e.printStackTrace();
		}
	}
}
