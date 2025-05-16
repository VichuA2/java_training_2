import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class Set7{ 
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String s1[]=new String[4];
        String s2[]=new String[4];
        Set<String> n=new HashSet<>();
        for(int i=0;i<4;i++){
            s1[i]=s.nextLine();
        }
        for(int i=0;i<4;i++){
            s2[i]=s.nextLine();
        }
        List<String> n1=new ArrayList<>();
        for(String x:s2){
            for(int i=0;i<4;i++){
                if(x.equals(s1[i])){
                    n1.add(x);
                }
            }
        }
        Collections.sort(n1);
        System.out.print(n1);
    }
} 