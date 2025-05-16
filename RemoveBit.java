import java.util.Scanner;
class RemoveBit{
    public static void main(String args[]) {
        Scanner s = new Scanner(System.in);        
        int a=s.nextInt();
        
        System.out.println(a&a-1);
        //Removing rightmost ON bit of binarystring.
    }
}