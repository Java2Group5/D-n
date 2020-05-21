package DTO;

import java.sql.Date;

public class TeacherDTO extends PeopleDTO{

	public TeacherDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public TeacherDTO(String iD, String name, Date birthday, boolean sex, String phoneNumber, String eMail,
			String urlImage, String classID, String falcutyName) {
		super(iD, name, birthday, sex, phoneNumber, eMail, urlImage, classID, falcutyName);
		// TODO Auto-generated constructor stub
	}

}
