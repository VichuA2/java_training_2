import java.util.*;
public class Stack1 {
    public static void main(String args[]){
        Scanner s=new Scanner(System.in);
        Stack<Integer> st=new Stack<>();
        int n=s.nextInt();
        for(int i=0;i<n;i++){
            st.push(s.nextInt());
        }
        st.pop();
        for(int a: st){
            System.out.println(a);
        }
    }
}
