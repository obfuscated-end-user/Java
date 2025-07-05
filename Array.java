import java.util.ArrayList;
import java.util.List;

public class Array {
	public static void main(String[] args) {
		//creating an instance of ArrayList
		List<Integer> list1=new ArrayList<Integer>();
		list1.add(17);
		list1.add(2);
		list1.add(15);
		list1.add(67);
		//how to print the elements
		System.out.println("The list of elements:"+ list1);
		//how to print the element using for-each loop
		for (int i : list1) {
			int value = list1.indexOf(i);
			System.out.println("Element stored at index " + value + " : "+i);
		}
	}
}
