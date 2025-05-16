import java.util.*;

public class PossibleCombination {
     public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int n=s.nextInt();
        int arr[]=new int[n],count=0;
        int in=0;
        for (int i = 0; i < n; i++) {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                System.out.println("{"+arr[i]+","+arr[j]+"}");
            }
        }
    }
}