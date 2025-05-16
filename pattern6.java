import java.util.Scanner;
public class pattern6 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=i;j<n;j++){
                System.out.print(" ");
            }
            for(char k='A';k<'A'+i;k++){
                System.out.print(k);
            }
            for(int l=(int)'A'+i-2;l>='A';l--){
                System.out.print((char)l);
            }
            System.out.println();
        }
    }
}
