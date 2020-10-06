public class Q25 {
    public static void main(String args[]){
        int sumE = 0;
        int sumO = 0;
        int arr[]={1,2,3,4,5};
        for (int i=0; i<=arr.length;i++){
            if(arr[i]%2==0){
                sumE = sumE + arr[i];
            }
            else{
                sumO = sumO + arr[i];
            }
            System.out.println("The sum of ODD is "+sumO);
        }
        System.out.println("The sum of EVEN is "+sumE);
    }
}
