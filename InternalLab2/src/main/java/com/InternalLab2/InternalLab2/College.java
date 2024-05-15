package com.InternalLab2.InternalLab2;

//The college name and value set through xml configuration
//(This has fixed name and address)
public class College {
	String name="RVCE", address="BLR";
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	@Override
	public String toString() {
		return "College [name=" + name + ", address=" + address + "]";
	}
	
}
