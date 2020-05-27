package BLL;

import java.sql.ResultSet;

import DAL.LoginDAL;
import DTO.LoginDTO;

public class LoginBLL {
	public int login(LoginDTO loginDTO) {
		int role=0;
		if (loginDTO.getID().equals(""))
			return role;
		else if (loginDTO.getPassword().equals(""))
			return role;
		else {
			LoginDAL loginDAL=new LoginDAL();
			role= loginDAL.login(loginDTO);
		}
		return role;
	}
}
