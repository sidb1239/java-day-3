package lu;
import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		String name = sc.nextLine();
		int date = sc.nextInt();
		int month = sc.nextInt();
		int year = sc.nextInt();
		int monthly_salary= sc.nextInt();
		int anual_salary = monthly_salary*12;
		double tax=0;
		if(anual_salary>500000) {
			tax = anual_salary*0.2;
			System.out.println("name: "+name+"DOB: "+date+"-"+month+"-"+year+"salary "+anual_salary+" tax paid"+tax);
		}
		else if(anual_salary<500000 && anual_salary>400000) {
			tax = anual_salary*0.15;
			System.out.println("name: "+name+"DOB: "+date+"-"+month+"-"+year+"salary "+anual_salary+" tax paid"+tax);
		}
		else if(anual_salary<400000 && anual_salary>300000) {
			tax = anual_salary*0.1;
			System.out.println("name: "+name+"DOB: "+date+"-"+month+"-"+year+"salary "+anual_salary+" tax paid"+tax);
		}
		else if(anual_salary<300000 && anual_salary>200000) {
			tax = anual_salary*0.05;
			System.out.println("name: "+name+"DOB: "+date+"-"+month+"-"+year+"salary "+anual_salary+" tax paid"+tax);
		}
		

	}

}
