package ayush.test;

import java.text.NumberFormat;
import java.util.*;

class StringSplit {


	
	public static void main(String args[]) {
		NumberFormat formatter = NumberFormat.getCurrencyInstance(Locale.US);
		String us = formatter.format(12345.567);
		System.out.println(us);
		
		String s = "ayushprasad";
		for(int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if(s.indexOf(c) == s.lastIndexOf(c)) {
				System.out.println(c);
				break;
			}
		}
		Map<Character, Integer> map = new LinkedHashMap<>();
		for (int i = 0; i < s.length(); i++) {
			char c = s.charAt(i);
			if (!map.containsKey(c)) {
				map.put(c,1);
			} 
		}
		StringBuilder ss = new StringBuilder();
		
		for(char ch : map.keySet()) {
			ss.append(ch);
		}
		System.out.println(ss);
	}
}
