package at.fhv.oo;

import java.util.Scanner;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class Person {

	private String _fname;
	private String _lname;
	private String _maidenname;
	private LocalDateTime _birthday;
	private Person _person;
	private String _gender;

	public Person(String fname, String lname, LocalDateTime now) {
		_fname = fname;
		_lname = lname;
		
		_birthday = now;	}
	public String setGender (Person p1) {
		Scanner sc = new Scanner(System.in);
		_gender = sc.toString();
		return _gender;
	}

}
