package TREES;

class Node{
    int data;
    Node left,right;

    Node(int data)
    {
        this.data=data;
    }

}

public class Tree{

    Node root;
    int count=0;


    void add(int element)
    {
        root=addNode(root,element);
        
    }

    Node addNode(Node node,int element)  //Recursive Way
    {
        
        if(node==null){
        node=new Node(element);
        }

        else{

            if(element >node.data)
            {
                System.out.println("Added1");
                node.right=addNode(node.right,element);
            }

            else{
                node.left=addNode(node.left, element);
                System.out.println("Added2");
            }
        }


        return node;
    }


    void add1(int element)   //ITERATIVE WAY
    {
        Node new_node=new Node(element);
        if(root==null)
        {
            root=new_node;
            return;
        }
        Node current_node=root;
        Node parent;
        while(true)
        {
            parent=current_node;

            if(current_node.data>element)
            {
                current_node=current_node.left;

                if(current_node==null)
                {
                parent.left=new_node;
                return;
                }

            }
            else{
                current_node=current_node.right;
                if(current_node==null){
                parent.right=new_node;
                return;
                }

            }


        }
    }

void pre_Order(Node node)
{
    if(node==null)
    return;
    System.out.println(node.data);
    pre_Order(node.left);
    pre_Order(node.right);
}

void In_Order(Node node)
{
    if(node==null)
    return;
    
    In_Order(node.left);
    System.out.println(node.data);
    In_Order(node.right);
}

void Post_Order(Node node)
{
    if(node==null)
    return;
    
    Post_Order(node.left);
    Post_Order(node.right);
    System.out.println(node.data);
}



    public static void main(String[] args) {

        Tree bst=new Tree();
        /*for(int i=1;i<10;i++)
        {
            bst.add1(i);
        }*/
        int arr[]={30 , 20 , 10 , 15 , 25 , 23 , 39 , 35 , 42};
        for(int a:arr)
        bst.add(a);
    

        bst.In_Order(bst.root);



   
    }
    
}
