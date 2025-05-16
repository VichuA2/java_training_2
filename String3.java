import java.util.Scanner;

public class String3 {
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String s1=s.nextLine();
        String arr[]=s1.split(" ");
        for(String a:arr){
            if(a.contains("e")){
                System.out.println(a);
            }
        }
    }
}