import java.util.Scanner;

public class RemoveDupli {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt();
        int[] arr=new int[n];
        int count=0;
        for(int i=0;i<arr.length;i++)
        {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
            if(arr[i]==arr[j]){
                count++;
            }
            }
        }
        int arr1[]=new int[n-count];
        for(int i=0;i<arr1.length;i++){
            for(int j=1;j<n;j++){
            if(arr[i]!=arr[j]){
                arr1=
            }
    }
}
