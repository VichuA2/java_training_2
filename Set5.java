import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class Set5{ 
    public static void main(String args[])
    {
        //Elements in 1st array not in the 2nd array
        
        Integer[] arr1={1,2,3,4};
        Integer[] arr2={2,3,4,5};
        Set<Integer> n=new HashSet<>();
        Set<Integer> n1=new HashSet<>();
        n.addAll(Arrays.asList(arr1));                                          
        n1.addAll(Arrays.asList(arr2));
        n.removeAll(n1);
        for(int m:n){
            System.out.print(m+" ");
        }
    }
} 