import java.util.*;
import java.util.Set;
import java.util.HashMap;
public class Set3{ 
    public static void main(String args[])
    {
        Integer[] arr1={1,2,3,4};
        Integer[] arr2={2,3,4,5};
        Set<Integer> n=new HashSet<>();
        n.addAll(Arrays.asList(arr1));
        n.addAll(Arrays.asList(arr2));
        for(int m:n){
            System.out.print(m);
        }
    }
} 