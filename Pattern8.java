import java.util.Scanner;
public class Pattern8 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            }
            for(int  k=1;k<=2*(n-i);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                if(l==1 || l==i){
                    System.out.print("* ");
                }
                else{
                    System.out.print("  ");
                }
            
        }System.out.println();
    }


        for(int i=n-1;i>=1;i--){
            for(int j=1;j<=i;j++){
                if(j==1 || j==i){
                    System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            for(int  k=1;k<=(n*2)-(i*2);k++){
                System.out.print("  ");
            }
            for(int l=1;l<=i;l++){
                if(l==1 || l==i){
                    System.out.print("* ");
                    }
                    else{
                        System.out.print("  ");
                    }
            }
            System.out.println();
        }
    }
}

