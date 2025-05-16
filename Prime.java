import java.util.Scanner;
public class Prime {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),count=0;
        for(int i=1;i<=n;i++){
            if(n%i==0){
                count++;
            }
        }
        if(count==2){
            System.out.println("It is an Prime Number !");
        }
        else{
            System.out.println("It is Not an Prime Number !");
        }
    }
}
