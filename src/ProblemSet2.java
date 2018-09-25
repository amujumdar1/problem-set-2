import java.util.Scanner;

public class ProblemSet2 {
	public static void main (String[] args) {
		ProblemSet2 ps2 = new ProblemSet2();
		//ps2.sayHello();
		//ps2.gradeMe();
		ps2.groupUs();
		//ps2.info();
		//ps2.initials();
	}
	
	public void sayHello() {
		System.out.println("Please enter your first and last name.");
		
		Scanner in = new Scanner(System.in);
		
		String name = in.nextLine();
		
		System.out.println("Hello, " + name);
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
		
		
		double homeworkAverage = (homework1 + homework2 + homework3) / 3; 
		
		double quizAverage = (quiz1 + quiz2 + quiz3) / 3;
		
		double testAverage = (test1 + test2 + test3) / 3;
		
		
		double finalGrade = (homeworkAverage * .15) + (quizAverage * .30) + (testAverage * .55);
		
		
		System.out.printf("Your final grade is %.2f\n",  finalGrade);
		
	}
	
	public void groupUs() {
		Scanner in = new Scanner(System.in);
		System.out.println("Provide the number of students attending the field trip.");
		int studentNumber = in.nextInt();
		
		System.out.println("Provide the number of teachers attending the field trip.");
		int teacherNumber = in.nextInt();
		
		int totalPeople = studentNumber + teacherNumber + 1;
		
		double busNumber = (double) totalPeople / 47; 
		
		System.out.println("You need " +  (int) Math.ceil(busNumber) + " buses." );
		// uses the built in ceiling function to always round the number up
		
		int peoplePerBus;
		
		do {
			int counter = 1;
			
			peoplePerBus = totalPeople - 47;
			
			System.out.println("Bus #" + counter + " has " + peoplePerBus + "people.");
			
			counter++;
			
		} while (peoplePerBus > 0);
		// int remainingPeople = totalPeople % 47;
		
		
		
		

	}
	
	public void info() {
		Scanner in = new Scanner(System.in);
		
		System.out.println("Type your first name.");
		String firstName = in.nextLine();
		
		System.out.println("Type your last name.");
		String lastName = in.nextLine();
		
		System.out.println("Type your grade.");
		int grade = in.nextInt();
		
		System.out.println("Type your age.");
		int age = in.nextInt();
		
		in.nextLine();
		// so that the home town will be properly printed 
		
		System.out.println("Type your hometown.");
		String hometown = in.nextLine();
		
		System.out.println("NAME     : " + firstName + " " + lastName);
		System.out.println("GRADE    : " + grade);
		System.out.println("AGE      : " + age);
		System.out.println("HOMETOWN : " + hometown);
		
	}
	
	public void initials() {
		Scanner in = new Scanner(System.in);
		
		System.out.print("Please enter your first name: ");
		char firstInitial = in.next().charAt(0);
		
		System.out.print("Please enter your middle name: ");
		char secondInitial = in.next().charAt(0);
		
		System.out.print("Please enter your last name: ");
		char thirdInitial = in.next().charAt(0);
		
		System.out.println("Your initials are " + firstInitial + secondInitial + thirdInitial + ".");
		in.close();
	}
}