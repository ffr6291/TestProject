package at.fhv.oo;

import java.time.LocalDateTime;

public class Main {
	public static void main(String[] args)  {
	Person Maria = new Person("Maria", "Franz", LocalDateTime.now());
	Person Fabian = new Person("Fabian", "Franz", LocalDateTime.now());
	
	Fabian.setGender("Male");
	Maria.setGender("Male");
	Fabian.Marriage(Maria, Fabian);
	
	
	
	
	
	
	
	
	
	
	
	
	
	}
		
	}


