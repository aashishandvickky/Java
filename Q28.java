public class Q28{
    public static void main(String args[]){
        String arr[]={"Ashish","Sharma","Vicky"};
        System.out.println("By basic loop ");
        for(int i=0; i<=arr.length; i++){
            System.out.println(arr[i]);
        }
        System.out.println("By using ForEach loop ");
        for(String str : arr){
            System.out.println(str);
        }
    }
}