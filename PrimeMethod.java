import java.util.Scanner;
public class PrimeMethod {

    static int Prime(int n){
        int count2 =0;
        for(int i=2;i<n;i++){
            int count1=0;
            for(int j=2;j<=i;j++){
                if(i%j==0){
                    count1++;
                }
            }
            if(count1==1){
                count2++;
            }
        }
        return count2;
    }
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        System.out.println(Prime(n));
    }
}
