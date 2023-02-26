package cap06;

public class UseMethodsWithArray {

	public static void main(String[] args) {
		double[] numbers = { 12.4, 3.4, 9, 7.3, 6.6 };
		double maximum = MethodsWithArray.searchMaximum(numbers);
		System.out.println(maximum);

		String[] names = { "Cinthia", "Alzira", "Bruno", "Nelson", "Julia", "Fernando", "Leandro" };
		String[] returnValue = MethodsWithArray.sortWords(names);
		for (int i = 0; i < returnValue.length; i++) {
			System.out.println(returnValue[i]);
		}
	}
}
