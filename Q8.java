import java.util.Scanner;
class Q8{
	public static void main(String args[]){
		float P,N,T, SI;
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the Principal Amount");
	P = sc.nextFloat();
	System.out.println("Enter no. of days");
	N = sc.nextFloat();
	System.out.println("Enter the Time");
	T = sc.nextFloat();
	 SI = (P * N * T)/100;
	System.out.println("Simple Interest is: "+SI);
	}
}