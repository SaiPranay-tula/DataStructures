class Node{
    int data;
    Node left;
    Node right;

    Node(int data)
    {
    this.data=data;
    }
}

public class BST {

    Node root=null;

    void add(int data)
    {
        root=add(root,data);
    }

    Node add(Node node,int data)
   {
       if(node==null)
       {
           Node new_node = new Node(data);
           node=new_node;
           return node;
       }

       else if(node.data< data)
       {
           node.right=add(node.right,data);
       }
       else if(node.data>data)
       {
           node.left=add(node.left,data);
       }
   }

   void add1(int data)
   {
       Node new_node=new Node(data);
       if(root==null)
       {
           root=new_node;
           return;
       }
       else{
           Node current=root;
           Node parent;
           while(true)
           {
               parent=current;
               if(current.data>data)
               {
                   current=current.left;
               }

               else if(current.data<data)
               {
                   current=current.right;
               }

               else if(current==null)
               {
                   current=new_node;
                   return;
               }      
            }
        }

    }
    void Post_order(Node node)
    {
        if(node==null)
        return;
        Post_order(node.left);
        Post_order(node.right);
        System.out.print(node.data+" ");
    }

    public static void main(String[] args) {
        

        BST b=new BST();
        for(int i=0;i<10;i++)
        {
            b.add(i);
        }

        b.Post_order(b.root);
    }
    
}
