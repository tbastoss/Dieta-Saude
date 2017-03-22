package ufrpe.dados.DAO.interfaces;

import java.sql.Connection;
import java.sql.SQLException;;

public interface IBancoConnection {
	public Connection getConnection();
	public void setConnectioNull();
	public boolean commit () throws SQLException;
}
