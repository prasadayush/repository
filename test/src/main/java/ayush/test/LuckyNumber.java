package ayush.test;

public class LuckyNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 5;
		int b = 4;
		int c = a+b;
		int d = a-b;
		int e = b-a;
		int my_list[]={35,1,0,7,25};
		
		int size = my_list.length;
		int count = 0;
		for(int i=0; i<size; i++){
	         if(my_list[i] > 100){
	        	 count = 0 ;
	         }
	        else if(my_list[i] % 5 == 0) {
	        	count ++ ;
	         }
	      } 
		System.out.println(count);
		int start = 16;
		int end = 18;
		
		String s = "Call my office at 888-123-4567.";
		System.out.println(s.length());
		if(start > end || start < 1 || end > s.length()) {
			System.out.println("INVALID");
		} else {
		try {
		String t = "";
		String p = s.substring(start-1, end);
		System.out.println(p);
		char[] x = p.toCharArray();
		for (int i =0; i<x.length;i++) {
			System.out.println(x[i]);
			if(!(x[i] >= '0'
	                && x[i] <= '9')) {
				System.out.println("INVALID");
				break;
			}
			else if(x[i] == '1') {
				t = t+"ONE";
			} else if(x[i] == '2') {
				t = t+"TWO";
			} else if(x[i] == '3') {
				t = t+"THREE";
			}
			String l = s.substring(0,start)+t+s.substring(end, s.length());
			System.out.println(l);
		}
		} catch (Exception ex) {
			System.out.println("INVALID");
		}
		}
		
		if(a == 8 || b == 8 || c ==8 || d == 8 || e == 8) 
			System.out.println(" true ");
		else 
			System.out.println(" false ");

	}

}
