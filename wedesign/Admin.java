
public class Admin {
	private int adminId;
	private String adminName;
	private String email;
	private String phone;
	private String address;
	
	public Admin(int adminId, String adminName, String email, String phone, String address) {
		this.adminId = adminId;
		this.adminName = adminName;
		this.email = email;
		this.phone = phone;
		this.address = address;
	}
	
	public Employe addEmployee(String employeName, String email, String phone, String address) {
		Employe employe = new Employe(employeName, email, phone, address);
		return employe;
	}
	
	public int getAdminId() {
		return adminId;
	}
	public void setAdminId(int adminId) {
		this.adminId = adminId;
	}
	public String getAdminName() {
		return adminName;
	}
	public void setAdminName(String adminName) {
		this.adminName = adminName;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
}
