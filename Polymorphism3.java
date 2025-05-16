import java.util.*;
class M{
    void order(int a[]){
        Arrays.sort(a);
        for(int x:a){
            System.out.print(x+" ");
        } 
        System.out.println();
    }
    void order(double a[]){
        Arrays.sort(a);
        for(int i=a.length-1;i>=0;i--){
            System.out.print(a[i]+" ");
        }
        System.out.println();
    }
    void order(String a[]){
        Arrays.sort(a);
        for(String x:a){
            System.out.print(x+" ");
        }
        System.out.println();
    }
}
public class Polymorphism3 {
    public static void main(String args[]){
        M ans=new M();
        int arr[]={1,2,3,4,5};
        double ar[]={1.0000,2.0000,3.0000,4.0000,5.0000};
        String a[]={"hi","hello","how are you"};
        ans.order(arr);
        ans.order(ar);
        ans.order(a);
    }
}

    

    