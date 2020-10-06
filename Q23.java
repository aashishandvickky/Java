public class Q23 {
    public static void main(String args[]){
        int arr[] = {1,2,3,4,5,6};
        // System.out.println("Original array is");
        // for(int i=0; i<=arr.length; i++){
        //     System.out.println(arr[i]+" ");
        // }
        // System.out.println();
        System.out.println("Reverse array is");
        for(int i= arr.length-1; i>=0; i--){
            System.out.println(arr[i]+ " ");
        }
    }
}