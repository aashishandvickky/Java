import java.util.*;
public class Q24 {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        int arr[]= {1,2,3,4,5};
        for(int i=0;i<arr.length;i++){
            if(arr[i]==n){
                System.out.println("The entered element "+n+" is found at "+(i+1));
                System.exit(arr[i]);
            }
            
        }
        
    }
}
