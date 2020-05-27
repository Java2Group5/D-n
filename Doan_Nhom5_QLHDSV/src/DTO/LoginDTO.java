package DTO;

public class LoginDTO {
	private String ID;
	private String password;
	public LoginDTO() {}
	public LoginDTO(String ID, String password) {
		this.password = password;
		this.ID = ID;
	}
	public String getID() {
		return ID;
	}
	public void setID(String iD) {
		this.ID = iD;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
}
