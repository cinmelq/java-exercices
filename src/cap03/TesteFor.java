package cap03;

public class TesteFor {
	
	public static void main(String[] args) {
		
		for(double x=5; x <= 10; x=x+0.5) {
			System.out.println(x);
		}
		System.out.println();
		
		for (int x=10; x>=0; x=x-2) {
			System.out.println(x);
		}
		System.out.println();
		
		for(int x=0; x<=10; x++) {
			System.out.println(x);
		}
	}
}
