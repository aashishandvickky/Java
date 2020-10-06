import java.util.Scanner;
class Q6{
	public static void main(String args[]){
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter the radius");
	float r= sc.nextFloat();
	double a=2 * 3.14 * r * r;
	double c = 2 * 3.14 * r;
	System.out.println("The Circumference is "+c);
	System.out.println("The Area is "+a);
	}
}