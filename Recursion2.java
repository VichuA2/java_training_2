import java.util.Scanner;
class Recursion2{
    //INDIRECT METHOD
    static void method1(int n){
        System.out.println(n);
        method2(n-1);
    }

    static void method2(int n){
        if(n<=1){
            return;
        }
        System.out.println(n);
        method1(n-1);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        method1(a);
    }
}