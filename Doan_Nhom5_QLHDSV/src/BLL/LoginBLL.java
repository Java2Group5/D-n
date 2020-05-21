package BLL;

import java.sql.ResultSet;

import DAL.LoginDAL;
import DTO.LoginDTO;

public class LoginBLL {
	public ResultSet login(LoginDTO loginDTO) {
		ResultSet result=null;
		if (loginDTO.getID().equals(""))
			return result;
		else if (loginDTO.getPassword().equals(""))
			return result;
		else {
			LoginDAL loginDAL=new LoginDAL();
			result= loginDAL.getUserIDByNameNPass(loginDTO);
		}
		return result;
	}
}
