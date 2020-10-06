class Account{
    int a,e;
    int b,f;
    
     public void setData(int a ,int b){
      e = a;
      f = b;
     }
     public void showData(){
       System.out.println("Value of A ="+e);
       System.out.println("Value of B ="+f);
     }
     public static void main(String args[]){
       Account obj = new Account();
       obj.setData(2,3);
       obj.showData();
     }
    }