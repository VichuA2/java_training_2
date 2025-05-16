import java.util.Scanner;
public class Perfect {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),sum=0;
        for(int i=1;i<=n/2;i++){
            if(n%i==0){
                sum+=i;
            }
        }
        if(sum==n){
            System.out.println("It is an Perfect Number !");
        }
        else{
            System.out.println("It is Not an Perfect Number !");
        }
    }
    
}
