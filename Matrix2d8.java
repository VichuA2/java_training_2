import java.util.Arrays;
import java.util.Scanner;
public class Matrix2d8{ 
    public static void main(String args[])
    {
        //Saddle point
        Scanner s=new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        int arr[][]=new int[r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }
        }
        boolean found=true;
        for(int i=0;i<r;i++){
            int mi=arr[i][0];
            int ci=0;
            for(int j=1;j<c;j++){
                if(arr[i][j]<mi){
                    mi=arr[i][j];
                    ci=j;
                }
            }
            boolean isSaddle=true;
            for(int k=0;k<r;k++){
                if(arr[k][ci]>mi){
                    isSaddle=false;
                    break;
                }
            }
            if(isSaddle){
                System.out.println("Saddle point : "+mi);
                found=true;
                break;
            }
        }
        if(!found){
            System.out.println("Saddle point not found !");
        }

    }
}
