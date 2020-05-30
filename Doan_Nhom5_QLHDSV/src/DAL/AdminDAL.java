package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;

import DTO.LoginDTO;
import UTILS.ConnectionUtil;

public class AdminDAL {
	Connection con;
	PreparedStatement preparedStatement;
	public Vector getUserList() {
		Vector vector =new Vector();
		String sql="SELECT id,password FROM ?";
	try {
		ResultSet result=null;
		ConnectionUtil conUtil=new ConnectionUtil();
		con=conUtil.getConnection();
		preparedStatement = con.prepareStatement(sql);
		preparedStatement.setString(1,"student");
		result = preparedStatement.executeQuery();
		try {
			while(result.next()) {
				LoginDTO login =new LoginDTO(result.getString(1),result.getString(2),2);
				vector.add(login);
			}
		}catch(SQLException e) {}
		preparedStatement.setString(1,"teacher");
		result = preparedStatement.executeQuery();
		while(result.next()) {
			LoginDTO login =new LoginDTO(result.getString(1),result.getString(2),3);
			vector.add(login);
		}
		result.close();
	}catch(SQLException e){}
	finally {
		try {
			con.close();
			preparedStatement.close();
		}catch(SQLException e) {
			e.printStackTrace();
		}
	}
	return vector;
	}
	public boolean addUSer(LoginDTO login) {
		String sql;
		if (login.getRole()==2) {
			sql="INSERT INTO student (`id`, `password`) VALUES ('?', '?')";
		}else {
			sql="INSERT INTO teacher (`id`, `password`) VALUES ('?', '?')";
		}
		
		try {
			ConnectionUtil conUtil=new ConnectionUtil();
			con=conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,login.getID());
			preparedStatement.setString(2,login.getPassword());
			return preparedStatement.execute();
		}catch(SQLException e){}
		finally {
			try {
				con.close();
				preparedStatement.close();		
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
	public boolean updatePassByID(LoginDTO login) {
		String sql;
		if (login.getRole()==2) {
			sql="UPDATE student SET `password` = ? WHERE id= ?";
		}else {
			sql="UPDATE teacher SET `password` = ? WHERE id= ?";
		}
		
		try {
			ConnectionUtil conUtil=new ConnectionUtil();
			con=conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,login.getPassword());
			preparedStatement.setString(2,login.getID());
			return preparedStatement.execute();
		}catch(SQLException e){}
		finally {
			try {
				con.close();
				preparedStatement.close();		
			}catch(SQLException e) {
				e.printStackTrace();
			}
		}
		return false;
	}
}
