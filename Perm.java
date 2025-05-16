import java.util.*;
class Perm{
    public static void perm(String s,String d){
        if(s.isEmpty()){
            System.out.println(d);
            return;
        }
            for(int i=0;i<s.length();i++){
                char ch=s.charAt(i);
                String r=s.substring(0,i)+s.substring(i+1);
                perm(r,d+ch);
            }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);        
        String s=sc.nextLine();
        perm(s,"");
    }
}