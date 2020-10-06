import java.util.*;

public class Q17{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		reversed = 0;
		
		while(n!=0){
		int digit = num%10;
		reversed = reversed * 10 + digit;
		num/= 10;	
		}
		System.out.println("Reversed No. "+reversed);
	}
}