package at.fhv.oo;

public class Marriage {

	private boolean marrypossible = true;

	public boolean Marriage(Person p1, Person p2) {

		if (p1.getGender() != p2.getGender()) {
			System.out.println("Heirat möglich");

			return marrypossible;
		} else {
			marrypossible = false;
			return marrypossible;
		}
	}
}
