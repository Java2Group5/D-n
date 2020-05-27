package BLL;
import DAL.InforDAL;
import DTO.PeopleDTO;
public class InforBLL {
	public PeopleDTO getInfor(String ID, int role) {
		InforDAL infor =  new InforDAL();
		return(infor.getInforByID(ID, role));
	}
}
