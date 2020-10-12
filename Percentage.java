package lu;
import java.util.Scanner;

public class Percentage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("please enter your marks: ");
		
		int maths = sc.nextInt(); 
		int science = sc.nextInt();
		int computers = sc.nextInt();
		int english = sc.nextInt();
		int french = sc.nextInt();
		int percentage = ((maths+science+computers+english+french)/100)*100;
		if(percentage>=90) {
			System.out.println("'A' garde and percentage is "+percentage);
		}
		else if(percentage>=80 && percentage<90) {
			System.out.println("'B' garde and percentage is "+percentage);
		}
		else if(percentage>=70 && percentage<80) {
			System.out.println("'C' garde and percentage is "+percentage);
		}
		else if(percentage>=60 && percentage<70) {
			System.out.println("'D' garde and percentage is "+percentage);
		}
		else if(percentage>=50 && percentage<60) {
			System.out.println("'E' garde and percentage is "+percentage);
		}
		else {
			System.out.println("better luck next time ");
		}

	}

}
