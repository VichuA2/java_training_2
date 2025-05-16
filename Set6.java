import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class Set6{ 
    public static void main(String args[])
    {
        //Check if one array is subset of another
        
        Integer[] arr1={1,2,3,4};
        Integer[] arr2={1,4};
        Set<Integer> n=new HashSet<>();
        Set<Integer> n1=new HashSet<>();
        n.addAll(Arrays.asList(arr1));                                          
        n1.addAll(Arrays.asList(arr2));
        System.err.println(n.containsAll(n1));
    }
} 