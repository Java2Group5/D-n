package BLL;
import DAL.InforDAL;
import DTO.PeopleDTO;
public class InforBLL {
	public PeopleDTO getInforByID(String ID, int role) {
		InforDAL infor =  new InforDAL();
		return(infor.getInforByID(ID, role));
	}
	public boolean saveInfor(int role, PeopleDTO people) {
		InforDAL inforDAL= new InforDAL();
		boolean flag=inforDAL.setInforByID(role,people);
		return flag;
	}
}
