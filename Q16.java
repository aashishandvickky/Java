import java.util.*;

public class Q16{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter No. of which table you want"); 
		int n = sc.nextInt();
		for(int i=1; i<=10; ++i){
		System.out.println(n+"x"+i+"="+n * i);
		}
		
	}
}