package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import database.*;

import pojos.Vendor;

public class VendorsDaoImpl implements VendorDao {

	private Connection cn;
	private PreparedStatement pst1;
	private String vendorString;
	
	public VendorsDaoImpl() throws Exception {
		this.cn = Connect.getConnection();
		this.pst1 = cn.prepareStatement("select * from vendors");
	}


	@Override
	public List<String> getAllVendors() throws Exception {
		ArrayList<String> Arr = new ArrayList<>();
		
		try(ResultSet rst = pst1.executeQuery())
		{
			while( rst.next())
			{
				Vendor vendor1 = new Vendor(rst.getString(1),rst.getString(2),rst.getString(3));
				vendorString = vendor1.toString();
				Arr.add(vendorString);
			}
			
		}
		return Arr;
	}

}
