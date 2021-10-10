package ayush.test;
import java.util.LinkedList;

import org.w3c.dom.Node;


/**
 * Hello world!
 *
 */
public class App 
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
    	int i = 0;
    	while(i < list.size()) {
    		System.out.println(list.get(i));
    		i++;
    	}
    }
}
