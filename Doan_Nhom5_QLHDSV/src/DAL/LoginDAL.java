package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import DTO.LoginDTO;
import UTILS.ConnectionUtil;
public class LoginDAL {
	Connection con;
	PreparedStatement preparedStatement;
	public int login(LoginDTO loginDTO){
		ResultSet result;
		int role=0;
		String sql="SELECT * FROM login WHERE id= ? and password = ?";
		try {
			ConnectionUtil conUtil=new ConnectionUtil();
			con=conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1, loginDTO.getID());
			preparedStatement.setString(2, loginDTO.getPassword());
			result = preparedStatement.executeQuery();
			if(result.first())
				role = result.getInt(3);
			result.close();
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
		return role;
	}
}
