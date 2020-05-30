package DTO;

public class LoginDTO {
	private String ID;
	private String password;
	private int role;
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
	public LoginDTO(String ID, String password, int role) {
		super();
		this.ID = ID;
		this.password = password;
		this.role = role;
	}
	public int getRole() {
		return role;
	}
	public void setRole(int role) {
		this.role = role;
	}
}
