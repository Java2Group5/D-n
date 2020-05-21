package DTO;

import java.sql.Date;

public abstract class PeopleDTO {
	private String ID;
	private String name;
	private Date birthday;
	private boolean sex;
	private String phoneNumber;
	private String eMail;
	private String urlImage;
	private String classID;
	private String falcutyName;
	public PeopleDTO() {}
	public PeopleDTO(String iD, String name, Date birthday, boolean sex, String phoneNumber, String eMail,
			String urlImage, String classID, String falcutyName) {
		super();
		ID = iD;
		this.name = name;
		this.birthday = birthday;
		this.sex = sex;
		this.phoneNumber = phoneNumber;
		this.eMail = eMail;
		this.urlImage = urlImage;
		this.classID = classID;
		this.falcutyName = falcutyName;
	}
	public String getFalcutyName() {
		return falcutyName;
	}
	public void setFalcutyName(String falcutyName) {
		this.falcutyName = falcutyName;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		ID = iD;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Date getBirthday() {
		return birthday;
	}
	public void setBirthYear(Date birthday) {
		this.birthday = birthday;
	}
	public boolean isSex() {
		return sex;
	}
	public void setSex(boolean sex) {
		this.sex = sex;
	}
	public String getClassID() {
		return classID;
	}
	public void setClassID(String classID) {
		this.classID = classID;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public String geteMail() {
		return eMail;
	}
	public void seteMail(String eMail) {
		this.eMail = eMail;
	}
	public String getUrlImage() {
		return urlImage;
	}
	public void setUrlImage(String urlImage) {
		this.urlImage = urlImage;
	}
}
