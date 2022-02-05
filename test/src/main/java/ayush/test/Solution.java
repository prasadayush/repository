package ayush.test;

class Solution {

//	public static String reverse(String str) {
//		StringBuffer sb = new StringBuffer();
//		for (int i = str.length() - 1; i >= 0; i--) {
//			sb.append(str.charAt(i));
//		}
//		return sb.toString();
//	}
//
//	public static void main(String args[]) {
//		String s = "saippuakivikauppias";
//		if (s.equals(reverse(s))) {
//			System.out.println("palindrome");
//		} else {
//			System.out.println("not palindrome");
//		}
//	}
	
	static void printPermutn(String str, String ans)
    {
  
        // If string is empty
        if (str.length() == 0) {
            System.out.println(ans + " ");
            return;
        }
  
        for (int i = 0; i < str.length(); i++) {
  
            // ith character of str
            char ch = str.charAt(i);
  
            // Rest of the string after excluding 
            // the ith character
            String ros = str.substring(0, i) + 
                         str.substring(i + 1);
  
            // Recurvise call
            printPermutn(ros, ans + ch);
        }
    }
	
	public static void main(String[] args)
    {
        String s = "ayush";
        printPermutn(s, "");
    }
}