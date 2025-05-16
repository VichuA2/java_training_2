import java.util.*;
class CStack{
    int data[];
    public static final int DEFAULT_SIZE=10;
    
    CStack(){
        this(DEFAULT_SIZE);
    }
    
    CStack(int size){
        this.data=new int[size];
    }
    
    int ptr=-1;
    
    public boolean push(int n) throws StackException{
        if(isFull()){
            throw new StackException("Stack is full cannot push!");
          
        }
        ptr++;
        data[ptr]=n;
        return true;
    }
    
    public int pop() throws StackException{
        if(isEmpty()){
            throw new StackException("Stack is Empty cannot pop!");
        }
        return data[ptr--];
    }
    
    public int peek(){
        return data[ptr];
    }
    
    public boolean isFull(){
        return ptr==data.length-1;
    }
    
    public boolean isEmpty(){
        return ptr==-1;
    }
}
class StackException extends Exception{
    StackException(String msg){
        super(msg);
    }
}
class Stack2{
    public static void main(String args[]) throws StackException{
        CStack st=new CStack();
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);
        st.push(50);
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
        System.out.println(st.pop());
    }
}