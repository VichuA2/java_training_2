import java.util.*;
public class SwapArray {
    static void Swap(int []arr,int s,int p1,int p2){
        int temp;
            temp=arr[p1];
            arr[p1]=arr[p2];
            arr[p2]=temp;
        System.out.println(Arrays.toString(arr));
    }


    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int p1=s.nextInt();
        int p2=s.nextInt();
        Swap(arr,n,p1,p2);
    }
}
