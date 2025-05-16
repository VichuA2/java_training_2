import java.util.Scanner;
class SetOrNot{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);
        int  n=s.nextInt();
        int k=s.nextInt();
        if((n&(1<<(k-1)))!=0){
            System.out.println("Set");
        }
        else{
            System.out.println("Not Set");
        }
    }
}