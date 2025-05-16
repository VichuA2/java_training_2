import java.util.*;
public class Matrix2d9{
    public static void main(String args[])
    {
        //Multiplication Matrix
        Scanner s =new Scanner(System.in);
        int n=s.nextInt(),m=s.nextInt();
        int r=s.nextInt(),c=s.nextInt();
        if(m!=c){
            System.out.print("Not applicable !");
        }
        int arr[][]=new int [n][m];
        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int arr1[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr1[i][j]=s.nextInt();
            }
        }
        int ans[][]=new int[n][c];
        for(int i=0;i<n;i++){ 
            for(int j=0;j<m;j++){
                for(int k=0;k<r;k++){
                    ans[i][j]=ans[i][j]+arr[i][k]*arr1[k][j];
                }
            } 
        }
        for(int i=0;i<n;i++){ 
            for(int j=0;j<c;j++){
                System.out.print(ans[i][j]+" ");
            }
            System.out.println(); 
        }
    }
}