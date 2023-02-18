package cap05;

public class BooleanLogic {

	public static void main(String[] args) {
		
		
		System.out.println(true + "\n" + false + "\n" + (true && true) + "\n" + (true && false) + "\n"
				+ (true || true) + "\n" + (true || false) + "\n" + (false && false));
		
		System.out.println("now negating...");


		System.out.println(!true + "\n" + !false + "\n" + !(true && true) + "\n" + !(true && false) + "\n"
				+ !(true || true) + "\n" + !(true || false) + "\n" + !(false && false));
	}
}
