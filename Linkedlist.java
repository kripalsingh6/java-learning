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
public static int size;

public void addfirst(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;

    }
    newNode.next=head;
    head= newNode;
}
public void addlast(int data){
    Node newNode=new Node(data);
    size++;
    if(head==null){
        head=tail=newNode;
        return;
    }
    tail.next=newNode;
    tail=newNode;
}

public void add(int idx,int data){
    if(idx==0){
        addfirst(data);
        return;
    }
    Node newNode=new Node(data);
    size++;
    Node temp=head;
    int i=0;
    while (i<idx-1) {
        temp=temp.next;
        i++;
    }
    newNode.next=temp.next;
    temp.next= newNode ;
}
public void print(){
    if(head==null){
        System.out.println("ll  is empty");
       return;
    }
    Node temp= head;
    while(temp != null){
        System.out.print(temp.data+" ");
        temp=temp.next;

    }
    System.out.println();
}
    public static void main(String[] args) {
        Linkedlist ll=new Linkedlist();
        ll.print();
        ll.addfirst(1);
        ll.addfirst(2);
        ll.print();
        ll.addlast(3);
       ll.addlast(4);
       ll.add(2, 5);
       ll.print();
      System.out.println(ll.size);
    }
}
