import java.util.Scanner;

class Hallow {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        for(int i = 1;i<=n;i++){
            
            for(int j=n-1;j<=(2*i-1);j--){
                if((j==2*i-1)||j==1){
                    System.out.print("*");
                }else{
                System.out.print(" ");
            }
            }System.out.println();

                }}}