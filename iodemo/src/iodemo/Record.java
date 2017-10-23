package iodemo;

import java.io.Serializable;
import java.util.Date;

public class Record implements Serializable {

	private int id;
	private String firstName;
	private String lastName;
	private String status;
	private String gender;
	private int year;
	
	private Date date;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	public Date getDate() {
		return date;
		
	}
	public void setDate(Date date) {
		this.date = date;
	}
	
	
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	
	public String dateInfo() {
		return date.getDate()+"-"+(date.getMonth()+1)+"-"+(date.getYear()+1900);
	}
		
	
}
