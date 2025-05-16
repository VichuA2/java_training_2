import java.util.Arrays;
import java.util.Scanner;
public class Matrix2d6{ 
    public static void main(String args[])
    {
        //Identity Matrix
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        boolean ans=true;
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                if(arr[i][i]!=1 || arr[i][j]!=0){
                    ans=false;
                }
            }
        }
        if(ans){
            System.out.println("Identity");
        }
        else{
            System.out.println("Not Identity");
        }
    }
}
