package ayush.test;

public class StringSplit {

	public static void main(String[] args) {
		String s1 = "Ayush557@gmail.com";
		String[] s2 = s1.split("@");
		for (String s : s2) {
			System.out.println(s);
		}
	}
}
