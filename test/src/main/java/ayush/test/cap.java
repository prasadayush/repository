package ayush.test;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class cap {

	public static void main(String[] args) {
		String s = "ayushprasad";
		
		List<Integer> number = Arrays.asList(2,3,4,5);
		List<Integer> square = number.stream().filter(x-> x%2==0).map(x->x*x).collect(Collectors.toList());
		System.out.println(square);

		char y[] = s.toCharArray();
		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		while (i != s.length()) {
			if (map.containsKey(y[i]) == false) {
				map.put(y[i], 1);
			} else {
				int oldVal = map.get(y[i]);
				int newVal = oldVal + 1;
				map.put(y[i], newVal);
			}
			i++;
		}

		int count = 0;
		for (char c : map.keySet()) {
			if (map.get(c) == 1) {
				count++;
				if (count == 2) {
					System.out.println(c);
				}
			}
		}
	}

//	public static int firstUniqChar(String s) {
//		for (int i = 0; i < s.length(); i++) {
//			char c = s.charAt(i);
//			if (s.indexOf(c) == s.lastIndexOf(c)) {
//				return i;
//			}
//		}
//
//		return -1;
//	}

}
