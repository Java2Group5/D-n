package BLL;

import java.util.Vector;

import DAL.AdminDAL;

public class AdminBLL {
	public Vector getUserList() {
		AdminDAL adminDAL = new AdminDAL();
		return(adminDAL.getUserList());
	}
}
