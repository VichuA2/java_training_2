import java.util.*;

public class Replace {
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt();
        int arr[]=new int[a];
        int in=0;
        for (int i = 0; i < arr.length; i++) {
            arr[i]=s.nextInt();
        }
        for(int i=0;i<a;i++){
            if(arr[i]!=0){
                arr[in++]=arr[i];
            }            
        }
        while(in<a){
            arr[in++]=0;
        }
        System.out.print(Arrays.toString(arr));
        

        
    }
}
