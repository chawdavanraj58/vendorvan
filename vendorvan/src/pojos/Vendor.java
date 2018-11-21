package pojos;

public class Vendor {
	private String name;
	private String email;
	private String city;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String email) {
		this.email = email;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	@Override
	public String toString() {
		return "Vendor [getName()=" + getName() + ", getEmail()=" + getEmail() + ", getCity()=" + getCity() + "]";
	}
	
	public Vendor() {
		super();
	}
	
	
	public Vendor(String name, String email, String city) {
		super();
		this.name = name;
		this.email = email;
		this.city = city;
	}
	
	

}
