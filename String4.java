import java.util.Scanner;

public class String4 {
    
    public static void main(String args[])
    {
        Scanner s =new Scanner(System.in);
        String s1=s.nextLine();
        String s2="";
         for(int i=0;i<(s1.length());i++){
            char c=s1.charAt(i);
            if(s2.indexOf(c)==-1){
                s2+=c;
            }
        }
        System.out.print(s2);
    }
}