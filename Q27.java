public class Q27 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        int small = arr[0];
        int large = arr[0];
        
        for(int i = 0; i< arr.length; i++){
            if(arr[i] >= large)
                large = arr[i];
            else if(arr[i] <= small)
                small = arr[i];
            }
            System.out.println("Largest Number is : " + large);
            System.out.println("Smallest Number is : " + small);
        }
}