package hello;

public class Profile {
	
	private int id;
	private String fname = null;
	private String city = null;
	private String contactNo;
	
	public Profile(int id , String fname ,String city , String contactNo) {
		this.id = id;
		this.fname = fname;
		this.city = city;
		this.contactNo = contactNo;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getFname() {
		return fname;
	}

	public void setFname(String fname) {
		this.fname = fname;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}
	
	
	
	
}
