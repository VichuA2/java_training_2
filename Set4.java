import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class Set4{ 
    public static void main(String args[])
    {
        //Intersection
        
        Integer[] arr1={1,2,3,4};
        Integer[] arr2={2,3,4,5};
        Set<Integer> n=new HashSet<>();
        Set<Integer> n1=new HashSet<>();
        n.addAll(Arrays.asList(arr1));
        n1.addAll(Arrays.asList(arr2));
        n.retainAll(n1);
        for(int m:n){
            System.out.print(m+" ");
        }
    }
} 