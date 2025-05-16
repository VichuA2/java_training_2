import java.util.Scanner;
class Reverse{
    public static void main(String[] args) {
        Scanner s=new Scanner(System.in);
        int a=s.nextInt(),re,rev=0;
        while(a!=0){
            re=a%10;
            rev=rev*10+re;
            a/=10;
        }
        System.out.println(rev);
    }
}