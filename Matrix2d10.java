import java.util.*;
public class Matrix2d10{
    public static void main(String args[])
    {
        //Magic Matrix
        Scanner s =new Scanner(System.in);
        int r=s.nextInt(),c=s.nextInt();
        int arr[][]=new int [r][c];
        for(int i=0;i<r;i++){
            for(int j=0;j<c;j++){
                arr[i][j]=s.nextInt();
            }n n                     
        }
        boolean ans=true;
        int fsum=0;
        for(int j=0;j<c;j++){
            fsum+=arr[0][j];
        }
        for(int i=0;i<r;i++){ 
            int rsum=0;
            for(int j=0;j<c;j++){
                rsum+=arr[i][j];
            }
            if(fsum!=rsum){
                ans=false;
                break;
            } 
        }
        if(ans){
        for(int j=0;j<r;j++){ 
            int csum=0;
            for(int i=0;i<c;i++){
                csum+=arr[i][j];
            }
            if(fsum!=csum){
                ans=false;
                break;
            } 
        }
        }
        if(ans){
            int d1sum=0;
            for(int i=0;i<r;i++){ 
                d1sum+=arr[i][i];
            }
            if(fsum!=d1sum){
                ans=false;
            } 
        }
        if(ans){
            int d2sum=0;
            for(int i=0;i<r;i++){ 
                d2sum+=arr[i][c-1-i];
            }
            if(fsum!=d2sum){
                ans=false;
            } 
        }
        if(ans){
            System.out.print("Magic Matrix");
        }
        else{
            System.out.print("Not a Magic Matrix");
        }
    }
}