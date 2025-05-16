import java.util.Scanner;
public class pattern {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            System.out.println("*");
        }
        for(int j=0;j<=n;j++){
            System.out.print("* ");
        }
    }
}
