package DTO;

import java.sql.Date;

public class StudentDTO extends PeopleDTO{

	public StudentDTO(String iD, String name, Date birthday, boolean sex, String phoneNumber, String eMail,
			String urlImage, String classID, String falcutyName) {
		super(iD, name, birthday, sex, phoneNumber, eMail, urlImage, classID, falcutyName);
		// TODO Auto-generated constructor stub
	}
	public StudentDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

}
