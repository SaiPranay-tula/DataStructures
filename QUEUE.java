class node2{
    int data;
    node2  next;
    node2(int data)
    {
        this.data=data;
    }
}

public class QUEUE {

    node2 front,rear=null;

    void enqueue(int data)
    {
        node2 new_node=new node2(data);
        if(front==null)
        {
            front=new_node;
            rear=front;
        }
        else{
            node2 temp=front;
            while(temp.next!=null)
            temp=temp.next;
            temp.next=new_node;
            rear=new_node;
        }



    }
    void dequeue(){
        if(front!=null)
        {
            System.out.println("DELETE ELEMENT IS"+front.data);
            front=front.next;
        }
        else{
            System.out.println("QUEUE is EMPTY");

        }
    }
    void display()
    {
        node2 temp=front;
        while(temp!=null)
        {
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }
    public static void main(String[] args) {
        


        QUEUE q=new QUEUE();
        for(int i=1;i<=10;i++)
        q.enqueue(i);
        q.display();

        for(int i=0;i<9;i++)
        q.dequeue();

        q.display();
        q.dequeue();
    }
    
}
