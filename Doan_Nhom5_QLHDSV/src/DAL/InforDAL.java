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
			String sql="SELECT * FROM student WHERE id= ?";
		if(role==2)
			sql="SELECT * FROM teacher WHERE id= ?";
		try {
			ResultSet result=null;
			ConnectionUtil conUtil=new ConnectionUtil();
			con=conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,id);
			result = preparedStatement.executeQuery();
			if(result.first())
				people= new StudentDTO(result.getString(1),result.getString(2),result.getDate(3),result.getBoolean(4),result.getNString(5),
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
	public void setInforByID(String id,int role,PeopleDTO people) {
		String sql="UPDATE student set id = ?, name = ?, sex = ?, birtday = ?, phonenumber=?, email=?, urlimage= ?, classid=?,facultyname=?";
		if(role==2)
			sql="UPDATE teacher set id = ?, name = ?, sex = ?, birtday = ?, phonenumber=?, email=?, urlimage= ?, classid=?,facultyname=?";
		try {
			ConnectionUtil conUtil=new ConnectionUtil();
			con= conUtil.getConnection();
			preparedStatement = con.prepareStatement(sql);
			preparedStatement.setString(1,people.getID());
			preparedStatement.setString(2,people.getName());
			preparedStatement.setBoolean(4,people.isSex());
			preparedStatement.setDate(5,people.getBirthday());
			preparedStatement.setString(6,people.getPhoneNumber());
			preparedStatement.setString(7,people.geteMail());
			preparedStatement.setString(8,people.getUrlImage());
			preparedStatement.setString(9,people.getClassID());
			preparedStatement.setString(10,people.getFalcutyName());
			preparedStatement.execute();
		}
		catch(SQLException e) {
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
	}
}