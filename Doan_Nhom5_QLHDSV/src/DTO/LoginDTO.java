package DTO;

public class LoginDTO {
	private String ID;
	private String password;
	private int role;
	public LoginDTO() {}
	public LoginDTO(String ID, String password) {
		this.password = password;
		this.ID = ID;
		this.role= role;
		
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
