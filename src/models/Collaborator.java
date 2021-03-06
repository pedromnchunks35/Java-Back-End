package models;

public class Collaborator {
	String name,type,address,county,district,post_code,email;
	int nif,phone_number,id_user,id_collaborator;
	
	
	
	
	
	
	public Collaborator() {
		super();
	}





	public Collaborator(int id_collaborator,int id_user,String name,int nif, String type, String address, String county, String district,
			String post_code,int phone_number) {
		this.id_collaborator=id_collaborator;
		this.name = name;
		this.type = type;
		this.address = address;
		this.county = county;
		this.district = district;
		this.post_code = post_code;
		this.nif = nif;
		this.phone_number = phone_number;
		this.id_user = id_user;
	}
	
	public Collaborator(String name, String address, String county, String district,
			String post_code,int nif,int phone_number, String email,int id_user,int id_collaborator) {
		this.id_collaborator=id_collaborator;
		this.name = name;
		this.address = address;
		this.county = county;
		this.district = district;
		this.post_code = post_code;
		this.nif = nif;
		this.phone_number = phone_number;
		this.id_user = id_user;
		this.email = email;
	}
	
	

	public int getId_collaborator() {
		return id_collaborator;
	}





	public void setId_collaborator(int id_collaborator) {
		this.id_collaborator = id_collaborator;
	}





	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getType() {
		return type;
	}
	
	public void setType(String type) {
		this.type = type;
	}
	
	public String getAddress() {
		return address;
	}
	
	public void setAddress(String address) {
		this.address = address;
	}
	
	public String getCounty() {
		return county;
	}
	
	public void setCounty(String county) {
		this.county = county;
	}
	
	public String getDistrict() {
		return district;
	}
	
	public void setDistrict(String district) {
		this.district = district;
	}
	
	public String getPost_code() {
		return post_code;
	}
	
	public void setPost_code(String post_code) {
		this.post_code = post_code;
	}
	
	public int getNif() {
		return nif;
	}
	
	public void setNif(int nif) {
		this.nif = nif;
	}
	
	public int getPhone_number() {
		return phone_number;
	}
	
	public void setPhone_number(int phone_number) {
		this.phone_number = phone_number;
	}

	public int getId_user() {
		return id_user;
	}

	public void setId_user(int id_user) {
		this.id_user = id_user;
	}





	public String getEmail() {
		return email;
	}





	public void setEmail(String email) {
		this.email = email;
	}
	
	
}
