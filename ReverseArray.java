import java.util.*;
public class ReverseArray{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        for(int i=n;i>=1;i--){
            if(n>5){
            System.out.print(i+""+(i+1)+" ");
            }
            else{
                System.out.print(i+" ");
            }
        }  
    }
}