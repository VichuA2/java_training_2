import java.util.*;
public class Transpose{
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int arr1[][]=new int [m][n];
        for(int i=0;i<m;i++){ 
            for(int j=0;j<n;j++){
                arr1[i][j]=arr[j][i];
                System.out.print(arr1[i][j]+" "); 
            }
            System.out.println(); 
        } 
    }
}       