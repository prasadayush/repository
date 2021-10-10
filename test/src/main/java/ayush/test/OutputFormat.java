import java.util.Scanner;

public class OutputFormat {

    public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            // first input as string...if less than 15 digits pad with spaces
            // second input as int if not 3 digit...pad with leading zeros
            System.out.println("================================");
            for(int i=0;i<3;i++){
                String s1=sc.next();
                int x=sc.nextInt();
                String g = null;
                if(x<10){
                    g = "00" + Integer.toString(x);
                }else if(x>=10 && x<100){
                    g = "0" + Integer.toString(x);
                }else {
                    g = Integer.toString(x);
                }
                String s2 = null;
                if(s1.length()<15){
                   int a = 15 - s1.length();
                   for(int k=0;k<a;k++){
                       s1 = s1+" ";
                   }
                   s2 = s1;
                }else {
                    s2 = s1;
                }
                System.out.println(s2 + g);
                //Complete this line
            }
            
            System.out.println("================================");

    }
}



