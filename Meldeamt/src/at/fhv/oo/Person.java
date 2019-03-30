package at.fhv.oo;

import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Person {
	
	private String _fname;
	private String _lname;
	private String _maidenname;
	private LocalDate _birthday;
	private Gender _gender;
	private Person _person;
	
	public void setPerson(String fname, String lname, LocalDate birthday, Gender gender) {
		_fname = fname;
		_lname = lname;
		_birthday = birthday;
		_gender = gender;
	}
	public String getPeron() {
		return _fname;
	}
}
	
	
	
	

