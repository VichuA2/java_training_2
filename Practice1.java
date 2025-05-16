import java.util.*;
class Student{
  int roll;
  String name;
  int m1;
  int m2;
  int m3;
  void setDetails(int a,String b,int c,int d,int e){
    this.roll=a;
    this.name=b;
    this.m1=c;
    this.m2=d;
    this.m3=e;
  }
  int calculateTotalMarks(){
    return m1+m2+m3;
  }
  public void displayStudentDetails(){
    System.out.println("Roll Number: "+roll);
    System.out.println("Name: "+name);
    System.out.println("Total Marks: "+calculateTotalMarks());
  }
}
class Practice{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int id=s.nextInt();
    s.nextLine();
    String name=s.nextLine();
    int m1=s.nextInt(),m2=s.nextInt(),m3=s.nextInt();
    Student ans=new Student();
    ans.setDetails(id,name,m1,m2,m3);
    ans.displayStudentDetails();
  }
}