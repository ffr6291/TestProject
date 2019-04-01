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
	private Person _person;
	
	public void setfname(String fname)throws Exception {
		_fname = fname;
		if(_fname == null) {
			throw new Exception("Halt dein Maul:");
		}
		else {
			System.out.println(_fname);
		}
	}
	public String getfname() {
		return _fname;
	}
	public void setlname(String lname	) {
		_lname=lname;
	}
	public String getlname() {
		return _lname;
	
		
	}
}
	
	
	
	

