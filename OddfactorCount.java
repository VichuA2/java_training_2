import java.util.Scanner;
public class OddfactorCount {
    static int Factor(int n){
        int sum=0;
        for(int i=1;i<n;i++){
            if(n%i==0){
                if(i%2!=0){
                    sum+=i;
                }
            }
        }

        return sum;
    }

    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Factor(n));
    }
}
