package day10;

//public class Manager {

	import java.util.Scanner;

	public class Manager extends Employee{
			private double bonus;

			public Manager() {
		        this.designation = "Manager";
		        this.bonus = 0;
		    }
			public Manager(int id, float sal, float bonus) {
				super();
		    	this.bonus = bonus;
		    }
			public void accept()
		    {
				super.accept();
		        System.out.println("Enter bonus : ");
		        this.bonus= new Scanner(System.in).nextFloat();
		    }
			public void display()
		    {
		        System.out.println("----------------------");
				super.display();
		        System.out.println(" Bonus : "+this.bonus);
		    }
			public double getBonus()
		    {
		        return this.bonus;
		    }
			public void setBonus(float bonus)
		    {
		        this.bonus = bonus;
		    }
			@Override
			public double calcTotalSalary() {
				return super.calcTotalSalary()+this.getBonus();
			}
	}
//}
