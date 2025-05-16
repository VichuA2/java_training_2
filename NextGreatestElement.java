import java.util.*;
class NextGreaterElement{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a[]=new int[5];
        for(int i=0;i<5;i++){
            a[i]=s.nextInt();
        }
        int arr[]=new int[5];
        for(int i=0;i<5;i++){
            arr[i]=-1;
            for(int j=i+1;j<5;j++){
                if(a[j]>a[i]){
                    arr[i]=a[j];
                    break;
                }
            }
        }
        System.out.print(Arrays.toString(arr));
    
    }
}