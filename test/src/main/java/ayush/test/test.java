package ayush.test;

import java.util.Arrays;
//public class test {
//	public static void main(String args[]) {
//		int[] a = { 2, 7, 3, 8, 1, 12, 43, 67 };
//		int max1 = Integer.MIN_VALUE, max2 = Integer.MIN_VALUE;
//		for (int i = 0; i < a.length; i++) {
//			if (a[i] > max1) {
//				max2 = max1;
//				max1 = a[i];
//			}
//		}
//		
//		System.out.println(max2);
//	}
//
//}
import java.util.HashMap;
import java.util.Map;

public class test {
	public static void main(String[] args) {
		String s = "dugud";
		String s1 = "guddu";
		char[] ss1 = s.toCharArray();
		char[] ss2 = s1.toCharArray();
		Arrays.sort(ss1);
		Arrays.sort(ss2);
		if (Arrays.equals(ss1, ss2)) {
			System.out.println("anagram from sort");
		} else {
			System.out.println("not anagram from sort");
		}

		Map<Character, Integer> map1 = new HashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map1.containsKey(c)) {
				map1.put(c, 1);
			} else {
				int oldVal = map1.get(c);
				int newVal = oldVal + 1;
				map1.put(c, newVal);
			}
		}
		Map<Character, Integer> map2 = new HashMap<>();
		for (int i = 0; i < s1.length(); i++) {
			char c = s1.charAt(i);
			if (!map2.containsKey(c)) {
				map2.put(c, 1);
			} else {
				int oldVal = map2.get(c);
				int newVal = oldVal + 1;
				map2.put(c, newVal);
			}
		}
		System.out.println(map1.entrySet());
		for (Map.Entry<Character, Integer> data : map1.entrySet()) {
			if (data.getValue() > 1) {
				System.out.println(data.getKey());
			}
		}
		System.out.println(map1);
		System.out.println(map2);
		if (map1.equals(map2)) {
			System.out.println("anagram");
		} else {
			System.out.println("not anagram");
		}
	}

}
