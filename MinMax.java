import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt(),max=n,min=n,sum=n,count=1;
        while(n!=-1){
            n=s.nextInt();
            if(n==-1){
                break;
            }
            if(n>max){
                max=n;
            }
            if(n<min){
                min=n;
            }
            sum+=n;
            count++;
        }
        float avg=(float)sum/(float)count;
        System.out.println("Max : "+max+"Min : " +min);
        System.out.println("Sum : "+sum+"Average : " +avg);
    }
    
}
