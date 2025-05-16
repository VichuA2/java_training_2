import java.util.Scanner;

class Primeprint{
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = a+b;
        int d =0;
        for(int i = c;i<=c*2;i++){
                    int count =0;
            for(int j = 1;j<=c*2;j++){
                if(i%j==0){
                    count++;}}
                if(count==2){
                    
                    d=i-c;
                    break;
                }
        }
        System.out.println(d);
    
    }}