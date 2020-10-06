public class Q31 {
   private int rno;
   private String name;

    void setData(int Srno, String Sname){
        rno=Srno;
        name=Sname;
    }

    void showData(){
        System.out.println(rno, name);
    }
}
    class StudentDemo{
    public static void main(String args[]) {
        Q31 s1 = new Q31();
        s1.setData(22, "Ashish");
        s1.showData();
    }
}
