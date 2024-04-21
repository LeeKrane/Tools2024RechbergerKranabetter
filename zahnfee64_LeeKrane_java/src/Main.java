public class Main {
	public static void main (String[] args) {
		System.out.println("Hello world!");
		System.out.println("We are learning Git! :D");
	}
	
	public void thisIsANewMethod () {
		System.out.println("Mina's change");
		System.out.println("Krane's change!");
		int uselessVar = 10;
		System.out.println(uselessVar);
		System.out.println(add(uselessVar, 20));
		System.out.println(mul(uselessVar, 20));
	}
	
	private int add (int originalVar, int addition) {
		return originalVar + addition;
	}
	
	private int mul (int originalVar, int multiplicator) {
		return originalVar * multiplicator;
	}
}