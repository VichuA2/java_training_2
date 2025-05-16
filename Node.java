import java.util.*;
class LinkedList4 {
    Node head;
    Node tail;
    int size;
    LinkedList4(){
        this.size=0;
    }

    void InsertFirst(int n){
        if(head==null){
            head=tail;
        }
        Node node=new Node(n);
        node.next=head;
        head=node;
        size++;
    }

    void InsertLast(int n){
        if(head==null){
            head=tail;
        }
        Node node=new Node(n);
        tail.next=node;
        tail=node;
        size++;
    }

    void InsertCenter(int n,int pos){
        if(pos==0){
            InsertFirst(n);
            return;
        }
        if(pos==size){
            InsertLast(n);
            return;
        }
        Node temp=head;
        for(int i=1;i<pos;i++){
            temp=temp.next;
        }
        Node node=new Node(n,temp.next);
        node=temp.next;
        size++;
    }
}
public class Node{
    int value;
    Node next;

    Node(int v){
        this.value=v;
    }
    Node(int v,Node n){
        this.value=v;
        this.next=n;
    }
}
class main{
    public static void main(String[] args) {
        LinkedList4 list=new LinkedList4();


    }
}
