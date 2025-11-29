
public class MyUser {
	private int id;
	private String uname;
	private String email;
	public MyUser() {
		super();
	}
	public MyUser(int id, String uname, String email) {
		super();
		this.id = id;
		this.uname = uname;
		this.email = email;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getUname() {
		return uname;
	}
	public void setUname(String uname) {
		this.uname = uname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	@Override
	public String toString() {
		return "MyUser [id=" + id + ", uname=" + uname + ", email=" + email + "]";
	}
	

}
