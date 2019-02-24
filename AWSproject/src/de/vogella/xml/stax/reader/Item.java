package de.vogella.xml.stax.reader;

public class Item {
	private String id;
    private String name;
    private String mail;
    private String password;
    
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getMail() {
		return mail;
	}
	public void setMail(String mail) {
		this.mail = mail;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
    
	 public String toString() {
	        return "Item [id=" + id + ", name=" + name + ", email="
	                + mail + ", password=" + password+"]";
	    }
	

  
}
