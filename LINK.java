class Node{
    int data;
    Node prev;
    Node next;
    Node(int data)
    {
        this.data=data;
    }
}

public class LINK {
Node head=null;
Node tail=null;
int count=0;
public void add(int data)
{

    Node new_node=new Node(data);
if(head==null)
{
    head=new_node;
}
else{
Node temp=head;
while(temp.next!=null)
{
    temp=temp.next;
}
temp.next=new_node;
}
tail=new_node;
count++;
}

void arbitary(int index)
{
 


}
public static void main(String[] args) {
    
}

    
}
