import java.util.*;
public class StockSpan{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int [n];
        for(int i=0;i<n;i++){
            arr[i]=s.nextInt();
        }
        int spam[]=new int[n];
        for(int i=0;i<n;i++){
            spam[i]=1;
            for(int j=i-1;j>=0;j--){
                if(arr[j]<=arr[i]){
                    spam[i]++;
                }
                else{
                    break;
                }
            }
            
        }                                                                                                      
        System.out.print(Arrays.toString(spam));
    }
}