package cap06;

public class UseMethods {
	
	public static void main(String[] args) {
		MethodsWithoutReturn.printText("Using methods of the other class");
		MethodsWithReturn.sum(20, 30);
		System.out.println(MethodsWithReturn.showDay(5));
		System.out.println(MethodsWithReturn.countLettersA("Cat"));
	}
}
