import java.util.Scanner;

public class String2 {
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String s1=s.nextLine();
        String a=s1.replaceAll("[^0-9]","");
        String b=s1.replaceAll("[0-9]","");
        String c=a.concat(b);
        System.out.print(c);

    }
}