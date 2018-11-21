package javabean;

import java.util.List;

import dao.VendorsDaoImpl;

public class VendorBean {
	private String name,email,city;
	private VendorsDaoImpl dao;
	
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
	public VendorsDaoImpl getDao() {
		return dao;
	}
	public void setDao(VendorsDaoImpl dao) {
		this.dao = dao;
	}

	public VendorBean() throws Exception {
		super();
		dao = new VendorsDaoImpl();
	}
	
	public List<String> AllVendors() throws Exception {
		
		return dao.getAllVendors();
	}
	
	

}
