import java.util.Scanner;
class Checker{
    public static void main(String args[]){
        Scanner S = new Scanner(System.in);
        int pass = 1234;
        for(int i=1;i<4;i++){
            int a = S.nextInt();
            if(a==pass){
                System.out.println("Access Granted");
                break;
            }else{
                System.out.println("password invalid");
            }
        }

    }
    }
