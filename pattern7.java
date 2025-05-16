import java.util.Scanner;
public class pattern7 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<n*2;i++){
            if(n>=i){
            for(int j=i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=i;k<=n;k++){
                System.out.print(k);
            }
            System.out.println();
        }
            
            if(i>n){
            for(int j=n*2-i-1;j>=1;j--){
                System.out.print(" ");
            }
            for(int k=n*2-i;k<=n;k++){
                System.out.print(k);
            }
            System.out.println();
            }
            
        
        }
    }
}
