package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.LoginDTO;
import UTILS.ConnectionUtil;
public class LoginDAL {
	ResultSet result= null;
	Connection con;
	PreparedStatement preparedStatement;
	public ResultSet getUserIDByNameNPass(LoginDTO loginDTO){
		String sql="select * from user where id= ? and password= ?";
		try {
			ConnectionUtil conUtil=new ConnectionUtil();
			con=conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, loginDTO.getID());
			preparedStatement.setString(2, loginDTO.getPassword());
			this.result = preparedStatement.executeQuery();
		} catch(SQLException e){
			e.printStackTrace();	
			}
		finally {
			try {
				con.close();
				preparedStatement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return result;
	}
}
