import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class main {
	
	public static void main(String[ ] args) {
    Scanner sc = new Scanner(System.in);
    
	LinkedList<Employee> list1 = new LinkedList<>();
	Employee al;
	ListIterator<Employee> itr;
	int choice;
	do {
		System.out.print("\n1. Add Album\n2. Display All (Forward + Reverse)\n3. Search  \n4.delete \nEnter choice: ");
		choice = sc.nextInt();
		switch(choice) {
		case 1: // Add
			al = new Employee();
			al.Accept(sc);
			list1.add(al);
			break;
		case 2: // Display All
			System.out.println("Forward display: ");
			itr = list1.listIterator();
			while(itr.hasNext()) {
				al = itr.next();
				System.out.println(al);
			}
			System.out.println("Backward display: ");
			itr = list1.listIterator(list1.size());
			while(itr.hasPrevious()) {
				al = itr.previous();
				System.out.println(al);
			}
			break;
		case 3: // Search
			System.out.print("Enter id of album to find: ");
			int id = sc.nextInt();
			// to search in list of Albums, pass Album object "key".
			// as equals() is based on "id", the "key" should be initialized with the id.
			Employee key = new Employee();
			key.setId(id);
			int index = list1.indexOf(key);
			if(index == -1)
				System.out.println("Employee not found.");
			else {
				System.out.println("Employee Found at Index: " + index);
				al = list1.get(index);
				System.out.println(al);
			}
			break;
			
		case 4:
			System.out.println("delete an Employee entry:");
			for(int i=0 ;i<list1.size();i++)
			{
            list1.remove(i);
			}
		}
	}while(choice != 0);
}
}
