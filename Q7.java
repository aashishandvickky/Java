import java.util.Scanner;
class Q7{
	public static void main(String args[]){
	int english, hindi, maths, science, history;
	float Total, Percentage;
	Scanner sc = new Scanner(System.in);
	
	System.out.println("Enter marks of 5 subjects");
	english = sc.nextInt();
	hindi = sc.nextInt();
	maths = sc.nextInt();
	science = sc.nextInt();
	history = sc.nextInt();

	Total = english+hindi+maths+science+history;
	Percentage = (Total/500)*100;

	System.out.println("Total Marks = " + Total);
	System.out.println(" Marks Percentage =  " + Percentage);
	}
}
