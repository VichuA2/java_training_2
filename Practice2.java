import java.util.*;
class BankAccount{
  int no;
  String name;
  int bal;
  int dep;
  int wit;
  void setDetails(int a,String b,int c,int d,int e){
    this.no=a;
    this.name=b;
    this.bal=c;
    this.dep=d;
    this.wit=e;
  }
  float deposit(){
    return bal+dep;
  }
  float withdraw(){
    return deposit()-wit; 
  }
  public void displayAccountDetails(){
    System.out.printf("Balance after deposit: %.1f\n",deposit());
    System.out.printf("Balance after withdrawal: %.1f\n",withdraw());
    System.out.println("Account Number: "+no);
    System.out.println("Account Holder Name: "+name);
    System.out.printf("Balance: %.1f",withdraw());
  }
}
class Practice2{
  public static void main(String args[]){
    Scanner s=new Scanner(System.in);
    int ano=s.nextInt();
    s.nextLine();
    String aname=s.nextLine();
    int b=s.nextInt();
    int de=s.nextInt();
    int wi=s.nextInt();
    BankAccount ans=new BankAccount();
    ans.setDetails(ano,aname,b,de,wi);
    ans.displayAccountDetails();
  }
}