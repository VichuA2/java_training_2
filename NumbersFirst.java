import java.util.Scanner;

public class String1 {
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String s1=s.nextLine();
        System.out.print(s1.replaceAll('[^0-9]',''));
    }
}