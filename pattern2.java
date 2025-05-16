import java.lang.classfile.instruction.StoreInstruction;
import java.util.Scanner;
public class pattern2 {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
             for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            for(int j=1;j<=i;j++){
                System.out.print("*");
            }
            System.out.println();
        }


        for(int i=n-1;i>=1;i--){
            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            for(int j=1;j<=(n-i)*2;j++){
                System.out.print(" ");
            }

            for(int j=i;j>=1;j--){
                System.out.print("*");
            }
            System.out.println();
        }



        









        // for(int i=n;i>=1;i--){
        //     for(int j=i;j>=1;j--){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // };
    }
    
}