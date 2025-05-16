import java.util.*;

public class Summa {
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String a=s.nextLine();
        String b=s.nextLine();
        System.out.println(Integer.parseInt(a,2));
        System.out.println(Integer.parseInt(a)+Integer.parseInt(b));
        System.out.println(String.valueOf(Integer.parseInt(a)+Integer.parseInt(b)));
    }
}