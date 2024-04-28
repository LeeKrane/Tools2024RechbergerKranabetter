public class Main {
	public static void main (String[] args) {
		System.out.println("Hello world!");
		System.out.println("We are learning Git! :D");
	}
	
	public void thisIsANewMethod () {
		System.out.println("Mina's change");
		System.out.println("Krane's change!");

		System.out.println("Here we go again");
		System.out.println("Max Vestappen");
		System.out.println("bugfix");
		System.out.println("Siuuuuuuuu!!!!");
		System.out.println("Christoph was here");

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
	
	private int pow (int originalVar, int power) {
		int ret = originalVar;
		for (int i = 1; i <= power; i++) {
			ret = ret * originalVar;
		}
		return ret;
	}
}