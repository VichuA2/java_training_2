import java.util.Scanner;
class Recursion1{
    //DIRECT METHOD
    static void display(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        display(n-1);
    }


    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        display(a);
    }
}