import java.util.Scanner;
class Recursion4{
    //DIRECT METHOD - HEAD

    // {
    //     recursion
    //     .
    //     .
    //     statement
    // }

    static void head(int n){
        
        if(n==0){
            return;
        }
        head(n-1);
        System.out.println(n);
    }

    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        head(a);
    }
}