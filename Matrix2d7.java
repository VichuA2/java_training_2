import java.util.Arrays;
import java.util.Scanner;
public class Matrix2d7{ 
    public static void main(String args[])
    {
        //Spiral Matrix
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();                                                                            
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        int top=0;
        int left=0;
        int bottom=arr.length-1;
        int right=arr[0].length-1;
        while(top<=bottom && left<=right){
            for(int i=left;i<=right;i++){
                System.out.print(arr[top][i]);
            }
            top++;
            for(int i=top;i<=bottom;i++){
                System.out.print(arr[i][right]);
            }
            right--;
            if(top<bottom){
                for(int i=right;i>=left;i--){
                    System.out.print(arr[bottom][i]);
                }
            }
            bottom--;
            if(left<right){
                for(int i=bottom;i>=top;i--){
                    System.out.print(arr[i][left]);
                }
            }
            left++;
        }
    }
}
