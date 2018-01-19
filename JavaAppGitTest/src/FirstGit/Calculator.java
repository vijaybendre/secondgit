package FirstGit;

public class Calculator {

	public static void main(String[] args) {
		
		
		Operations o = new Operations();
		int addition = o.add(2, 5);
		System.out.println("Addition of two numbers is: " + addition);
		
		int sub = o.sub(9, 5);
		System.out.println("Subtraction of two numbers is: " + sub);

	}

}
