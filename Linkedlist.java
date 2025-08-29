public class Linkedlist {
class Node{
    int data;
    Node next;
    public Node(int data){
        this.data=data;
        this.next=null;
    }
}
public static Node head;
public static Node tail;

public void addfirst(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;

    }
    newNode.next=head;
    head= newNode;
}
public void addlast(int data){
    Node newNode=new Node(data);
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}
public void print(){
    Node temp= head;
}
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.addfirst(1);
        ll.addfirst(2);
    }
}
