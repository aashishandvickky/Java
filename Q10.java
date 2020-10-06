import java.util.Scanner;
class Q10{
	public static void main(String args[]){
		double a, f;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter F temp= ");
		f=sc.nextDouble();

		a=(f-32)*5/9;
	System.out.println("Temp in Celsius= "+a);
		
	}
}