import java.util.*;
class Man{

    void add(int a,int b){
        System.out.println(a+b);
    }
    void add(int a,int b,int c){
        System.out.println(a+b+c);
    }
    float add(float a,float b){
        //System.out.println();
        return a+b;
    }
}
public class Polymorphism1 {
    public static void main(String args[]){
        Man ans=new Man();
        ans.add(1,1);
        ans.add(1,1,1);
        System.out.println(ans.add(1.5f,1.5f));
    }
}

    

    