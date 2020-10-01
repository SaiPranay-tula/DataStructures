class Node1{
    int data;
    Node1 next;
    Node1(int data){
        this.data=data;
    }

}

public class CI{

Node1 head=null;
static int count=0;

void add(int data)
{
   // System.out.println(data);
        Node1 newNode=new Node1(data);
        count++;
    if(head==null)
    {
        head=newNode;
        head.next=head;
    }

    else{
        Node1 temp;
        temp=head;
        while(temp.next != head)
        temp=temp.next;

        temp.next=newNode;
        newNode.next=head;

    }
}

void add(int data,int pos)
{
    if(pos>count)
    {
        return;
    }

    Node1 newNode=new Node1(data);
    if(head==null)
    {
        head=newNode;
        head.next=head;
    }
    else{
        Node1 temp=head;
        while(temp.data!=pos)
        {
            temp=temp.next;
        }
        newNode.next=temp.next;
        temp.next=newNode;
    }

}
void delete(int pos)
{
    if(head==null)
    {
        return ;
    }
    else{
        Node1 temp=head;
        Node1 temp2=null;
        while(temp.data!=pos){
        temp2=temp;
        temp=temp.next;
        }
        
        temp2.next=temp.next;
    }
}




void print(Node1 temp)
{
    while(temp.next!=head)
    {
        System.out.print(temp.data);
        temp=temp.next;
    }
    System.out.print(temp.data);
}


public static void main(String[] args) {
 
    CI a=new CI();
    for(int i=0;i<10;i++)
    a.add(i);

   // a.print(a.head);
    a.add(14,4);
    a.print(a.head);
    System.out.println("###########################");
        a.delete(4);
    a.print(a.head);


}
}