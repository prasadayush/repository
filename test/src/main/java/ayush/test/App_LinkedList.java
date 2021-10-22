package ayush.test;
import java.util.LinkedList;


/**
 * Hello world!
 *
 */
public class App_LinkedList 
{
    public static void main( String[] args )
    {
    	LinkedList<String> list = new LinkedList<String>();
    	list.add("Ayush");
    	list.add("Prasad");
    	list.add("Ankur");
    	list.add("Kumar");
    	list.add("Mehta");
    	list.add("Amar");
    	list.add("Anand");
    	list.add(0,"Mr."); // insert element at first
    	list.add(list.size(), "lastElement"); // insert element at last
    	
    	LinkedList<String> list2 = new LinkedList<String>();
    	list2.add("JC");
    	list2.add("Mallick");
    	list2.add("Road");
    	
    	list.addAll(list2);
    	
    	int i = 0;
    	while(i < list.size()) {
    		System.out.println(list.get(i));
    		i++;
    	}
    }
}
