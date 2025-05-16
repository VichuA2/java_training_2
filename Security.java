import java.util.Scanner;
class Security{
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        int password= 1234,pass;
        for(int i=1;i<=3;i++){
            System.out.print("Enter your password : ");
            pass=s.nextInt();
            if(pass==password){
                System.out.println("LOgin successfull !");
                break;
            }
            else{
                System.out.println("Login failed !");
            }
            
        }
    }
}