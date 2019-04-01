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
	public void setGender (String gender) {
		_gender = gender;
		
	}
	public String getGender(){
		return _gender;
	}
	public boolean Marriage(Person p1, Person p2) {
		boolean marrypossible = true;

		if (p1.getGender() != p2.getGender()) {
			System.out.println("Heirat möglich");

			return marrypossible;
		} else {
			marrypossible = false;
			System.out.println("Homoehe nicht möglich");
			return marrypossible;
		}
	}
	

}
