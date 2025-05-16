import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class Set2{ 
    public static void main(String args[])
    {
        Set<Integer> s1=new HashSet<>();
        s1.add(2);
        s1.add(6);
        s1.add(5);
        s1.add(2);
        s1.add(3);
        Iterator<Integer> itr=s1.iterator();
        while(itr.hasNext()){
            System.out.print(itr.next());
        }
        

    }
} 