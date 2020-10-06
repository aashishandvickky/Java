import java.util.Scanner;
class Welcome{
	public static void main (String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter Your Name");
	String name = sc.next();
	String name1 = sc.next();
	System.out.println("Welcome "+name+" "+name1);
	}
}