package cap06;

public class AreaWithOverload {

	public static void main(String[] args) {
		System.out.println("Squad area: " + AreaWithOverload.calculateArea(3));
		System.out.println("Rectangle area: " + AreaWithOverload.calculateArea(3, 2));
		System.out.println("Triangle area: " + AreaWithOverload.calculateArea(3, 2, 5));
	}

	public static double calculateArea(int x) {
		return (x * x);
	}

	public static double calculateArea(int x, int y) {
		return (x * y);
	}

	public static double calculateArea(int x, int y, int z) {
		return (x * y * z);
	}
}
