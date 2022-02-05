package ayush.test;

public class App_LinkedList {
	static int factorial(int n) {
		int fact = 1;
		for (int i = 1; i <= n; i++) {
			fact *= i;
		}
		return fact;
	}

	public static void main(String[] args) {
		System.out.println(factorial(5));
		
		int n1 = 0, n2 = 1, count = 10,n3;
		System.out.print(n1 + " " + n2 + " ");
		for (int i = 2; i<count;i++) {
			n3 = n2 + n1;
			System.out.print(n3 + " ");
			n1 = n2;
			n2 = n3;
		}
	}
}
