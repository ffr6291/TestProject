package at.fhv.oo;

public class Marriage {

	public Marriage(Person p1, Person p2) {

		if (p1.getGender() != p2.getGender()) {
			System.out.println("Heirat m�glich");

			
		} else {
			System.out.println("Homoehe nicht m�glich!!");
		}
	}
}
