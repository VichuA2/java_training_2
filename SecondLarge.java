import java.util.*;
public class SecondLarge {
   
     public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        int f=0;
        int se=0;
        for(int i=0;i<n;i++){
            if(arr[i]>f){
                se=f;
                f=arr[i];
               
            }
            else if(arr[i]>se && arr[i]!=f){
                se=arr[i];
            }
        }
        System.out.print(se);
    }
}
