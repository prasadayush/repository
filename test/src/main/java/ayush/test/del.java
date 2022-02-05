package ayush.test;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;

public class del {

	public static void main(String[] args) {
		String s = "class";

		
		Map<Character, Integer> map = new LinkedHashMap<>();
		int i = 0;
		while( i < s.length()){
			char c = s.charAt(i);
			if(!map.containsKey(c)){
				map.put(c, 1);
			}else {
				int old = map.get(c);
				int newVal = old + 1;
				map.put(c,newVal);
			}
			i++;
		}
		
		for(Map.Entry<Character, Integer> data : map.entrySet()){
			if(data.getValue() != 1){
				System.out.println(data.getKey());
			}
		}

	}

}
