package DAL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import DTO.PeopleDTO;
import DTO.StudentDTO;
import UTILS.ConnectionUtil;

public class InforDAL {
	Connection con;
	PreparedStatement preparedStatement;
	public PeopleDTO getInforByID(String id,int role) {
		PeopleDTO people=null;
		String sql;
		if(role==2) {
			sql="SELECT * FROM student WHERE id= ?";
		}
		else {
			sql="SELECT * FROM teacher WHERE id= ?";
		}
		try {
			ResultSet result=null;
			ConnectionUtil conUtil=new ConnectionUtil();
			con=conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,id);
			result = preparedStatement.executeQuery();
			if(result.first())
				people= new StudentDTO(result.getString(1),result.getString(2),result.getDate(3),result.getBoolean(4),result.getString(5),
						result.getString(6),result.getString(7),result.getString(8),result.getString(9));
			result.close();
		}catch(SQLException e){
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
		return people;
	}
	public  boolean setInforByID(int role,PeopleDTO people) {
		String sql="UPDATE student set name = ?, sex = ?, birtday = ?, phonenumber=?, email=?, urlimage= ?, classid=?,facultyname=? where id = ?";
		if(role==2)
			sql="UPDATE teacher set name = ?, sex = ?, birtday = ?, phonenumber=?, email=?, urlimage= ?, classid=?,facultyname=? where id =?";
		try {
			ConnectionUtil conUtil=new ConnectionUtil();
			con= conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,people.getName());
			preparedStatement.setBoolean(2,people.isSex());
			preparedStatement.setDate(3,people.getBirthday());
			preparedStatement.setString(4,people.getPhoneNumber());
			preparedStatement.setString(5,people.geteMail());
			preparedStatement.setString(6,people.getUrlImage());
			preparedStatement.setString(7,people.getClassID());
			preparedStatement.setString(8,people.getFalcutyName());
			preparedStatement.setString(9,people.getID());
			preparedStatement.execute();
		}
		catch(SQLException e) {
			e.printStackTrace();
			return false;
		}
		finally {
			try {
				con.close();
				preparedStatement.close();
			}catch(SQLException e) {
				e.printStackTrace();
			}
			return true;
		}
	}
}