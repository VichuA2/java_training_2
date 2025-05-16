import java.util.*;
class Ma{

     public void area(int a){
        System.out.println("Square: "+(a*a));
    }
    public void area(int a,int b){
        System.out.println("Rectangle: "+(a*b));
    }
    public void area(float a){
        System.out.println("Circle: "+(float)(Math.PI * a * a));
    }
}
public class Polymorphism2 {
    public static void main(String args[]){
        Ma ans=new Ma();
        ans.area(2);
        ans.area(2,5);
        ans.area(2f);
    }
}

    

    