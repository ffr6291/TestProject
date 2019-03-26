package at.fhv.oo;

public class Main {
	public static void main(String[] args) {

		TestPermutation tester = new TestPermutation();
		if (!tester.isPermutationPossible()) {
			System.out.println("Not possible ");
		} else {
			System.out.println("Possible");
		}
		
	}
	Stack s = new Stack(5);
	
}
