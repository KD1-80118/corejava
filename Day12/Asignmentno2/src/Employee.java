import java.util.Scanner;

public class Employee {

	private int id;
	private float sal;
	
	public Employee() {
		super();
	}
	public Employee(int id, float sal) {
		super();
		this.id = id;
		this.sal = sal;
	}
	public void Accept(Scanner sc)
	{
		System.out.println("Enter the details :");
		System.out.println("Enter the id:");
		id = sc.nextInt();
		System.out.println("Enter the sal:");
		sal = sc.nextFloat();
	}
	@Override
	public String toString() {
		return "Employee [id=" + id + ", sal=" + sal + "]";
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public float getSal() {
		return sal;
	}
	public void setSal(float sal) {
		this.sal = sal;
	}
	
	
}
