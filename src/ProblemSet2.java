import java.util.Scanner;

public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		ps2.sayHello();
		ps2.gradeMe();
		ps2.groupUs();
		ps2.info();
		ps2.initials();
	}
	
	public void sayHello() {
		Scanner in = new Scanner(System.in);
		String name = in.nextLine();
		System.out.println("Hello, " + name);
		in.close();
	}
	
	public void gradeMe() {
		Scanner in = new Scanner(System.in);
		System.out.println("What is your first homework grade?");
		double homework1 =  in.nextDouble();
		System.out.println("What is your second homework grade?");
		double homework2 =  in.nextDouble();
		System.out.println("What is your third homework grade?");
		double homework3 =  in.nextDouble();
		
		System.out.println("What is your first quiz grade?");
		double quiz1 =  in.nextDouble();
		System.out.println("What is your second quiz grade?");
		double quiz2 =  in.nextDouble();
		System.out.println("What is your third quiz grade?");
		double quiz3 =  in.nextDouble();
		
		System.out.println("What is your first test grade?");
		double test1 =  in.nextDouble();
		System.out.println("What is your second test grade?");
		double test2 =  in.nextDouble();
		System.out.println("What is your third test grade?");
		double test3 =  in.nextDouble();
		
		double finalGrade = double (homework1 + homework2 + homework3) / 3; 
		
	}
	
	public void groupUs() {
		
	}
	
	public void info() {
		
	}
	
	public void initials() {
		
	}
}