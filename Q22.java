public class Q22 {
    public static void main(String[] args) {
        int [] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        int temp=0;

        for(int i=0;i<=arr.length;i++){
            System.out.println(arr[i]+" ");
        }
        for(int i=0; i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]<arr[j]){
                    temp = arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println(temp);
    }
}
 