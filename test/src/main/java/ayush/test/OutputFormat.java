package ayush.test;

import java.util.ArrayList;
import java.util.Iterator;

public class OutputFormat {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		// first input as string...if less than 15 digits pad with spaces
//		// second input as int if not 3 digit...pad with leading zeros
//		System.out.println("================================");
//		for (int i = 0; i < 3; i++) {
//			String s1 = sc.next();
//			int x = sc.nextInt();
//			String g = null;
//			if (x < 10) {
//				g = "00" + Integer.toString(x);
//			} else if (x >= 10 && x < 100) {
//				g = "0" + Integer.toString(x);
//			} else {
//				g = Integer.toString(x);
//			}
//			int a = 15 - s1.length();
//			for (int k = 0; k < a; k++) {
//				s1 = s1 + " ";
//			}
//			System.out.println(s1 + g);
//			// Complete this line
//		}
//
//		System.out.println("================================");
//
//	}

		int[] a = { 23, 45, 34, 56, 45, 75, 78, 89, 65, 90, 34, 67, 123, 234, 534, 56, 236 };
		int m1 = Integer.MIN_VALUE;
		int m2 = Integer.MIN_VALUE;
		for (int i = 0; i < a.length; i++) {
			if (m1 < a[i]) {
				m2 = m1;
				m1 = a[i];
			} else if (m1 > a[i] && m2 < a[i]) {
				m2 = a[i];
			}
		}
		System.out.println(m2);
//		int[] a = { 23, 45, 34, 56, 45, 75, 78, 89, 65, 90, 34, 67, 123, 234, 534, 56, 236 };
//		ArrayList<Integer> list = new ArrayList<>();
//		for (int i = 0; i < a.length; i++) {
//			list.add(a[i]);
//		}
//		
//		Iterator itr = list.iterator();
//		while (itr.hasNext()) {
//			System.out.println(itr.next());
//			list.remove(4);
//		}

	}
}
