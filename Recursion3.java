import java.util.Scanner;
class Recursion3{
    //DIRECT METHOD - TAIL

    // {
    //     statement
    //     .
    //     .
    //     recursion
    // }

    static void tail(int n){
        if(n==0){
            return;
        }
        System.out.println(n);
        tail(n-1);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        tail(a);
    }
}