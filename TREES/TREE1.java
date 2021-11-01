import java.util.*;
import java.util.Map.Entry;
class Circle{
		
		int data;
		Circle left,right;
		public Circle(int data)	{
			this.data=data;
			left=null;
			right=null;
		}
	}
class Inner{
	int level=0;
	Circle node;
	public Inner(Circle node,int l){
		this.node=node;
		this.level=l;
	}
}
class TREE1
{

	Circle root;
	public void add(int data)	{
		Circle new_node = new Circle(data);
		if(root==null)	{
			
			root = new_node;
		}
		else{
			Queue<Circle> queue = new LinkedList<>();

			
			queue.add(root);
			while(!queue.isEmpty())	{

				Circle temp = queue.poll();
				if(temp.left!=null){
					queue.add(temp.left);
				}
				else if(temp.left==null){
					temp.left=new_node;
					return ;
				}
				if(temp.right!=null)
					queue.add(temp.right);
				else{
					temp.right=new_node;
					return ;
				}
			}

		}


	}
	public void level_order(Circle root)	{
		Queue<Circle> queue = new LinkedList<>();
		queue.add(root);
			while(!queue.isEmpty())	{

				Circle temp = queue.poll();
				System.out.print(temp.data+" ");
				if(temp.left!=null){
					queue.add(temp.left);
				}
				if(temp.right!=null)
					queue.add(temp.right);
			
			}

	}

	public void in_order(Circle root)	{
		if(root==null)
			return;
		in_order(root.left);
		System.out.print(root.data+" ");
		in_order(root.right);

	}
	public void pre_order(Circle root)	{
		if(root==null)
			return;
		System.out.print(root.data+" ");
		pre_order(root.left);
		
		pre_order(root.right);

	}
	public void post_order(Circle root)	{
		if(root==null)
			return;
		
		post_order(root.left);
		
		post_order(root.right);
		System.out.print(root.data+" ");

	}

	public void n_level_order(Circle root){
		if(root==null)
			return;
		System.out.print(root.data+" ");
		/*if(root.left!=null)
			System.out.print(root.left.data);
		if(root.right!=null)
			System.out.print(root.right.data);
		
		*/n_level_order(root.left);
		n_level_order(root.right);
	}

	public int  height(Circle root){
		if(root==null)
			return 0;
		int left_count = height(root.left);
		int right_count = height(root.right);

		return Math.max(left_count,right_count)+1;
	}


	public void level_o_search(Circle root, int key)	{
		// inorder search
		Circle key_node = null, prev = null, curr =null;
		Queue<Circle> queue = new LinkedList<>();
		queue.add(root);

		while(!queue.isEmpty())	{
			prev = curr;
			curr = queue.poll();

			if(curr.data == key){
				key_node = curr;
				break;

			}
			else{
				if(curr.left!=null)
					queue.add(curr.left);
				if(curr.right!=null)
					queue.add(curr.right);
			}


		}
			System.out.println("Search "+key_node.data+"Found");
			System.out.println("Prev"+prev.data);
	}

	public void Iterative_preorder(Circle root)	{


		Stack<Circle> stack = new Stack<Circle>();
		Circle temp=root;

		stack.add(temp);
		while(stack.size()!=0)	{

			temp=stack.pop();
			System.out.print(temp.data+" ");

			if(temp.right!=null)
				stack.add(temp.right);
			if(temp.left!=null)
				stack.add(temp.left);
		}
	}

	public void prnt_level(Circle root, int level)	{
		if(root==null)
			return ;
		if(level==1)	{
			System.out.print(root.data+"-");
		}
		prnt_level(root.left,level-1);
		prnt_level(root.right,level-1);
	}
	public void leaf_nodes(Circle root){
		if(root == null)
			return ;
		if(root.left==null && root.right==null)
			System.out.print(root.data+"  ");
		leaf_nodes(root.left);
		leaf_nodes(root.right);

	}
	public void rev_lvl_order(Circle root){

		int height=height(root);
		for(int i=height;i>0;i--)	{
			prnt_level(root,i);
	}


	}
	public void left_view(Circle root)	{

		Queue<Inner> queue = new LinkedList<>();
		int lvl=0;
		int curr_lvl=0;
		queue.add(new Inner(root,lvl));

		while(queue.isEmpty()==false)	{

			Inner temp=queue.poll();
			//queue.remove();
			if(curr_lvl<=temp.level){
			System.out.print(temp.node.data+" ");
			curr_lvl++;
		}

			if(temp.node.left!=null){
				queue.add(new Inner(temp.node.left,curr_lvl));
			}
			if(temp.node.right!=null)
			{
				queue.add(new Inner(temp.node.right,curr_lvl));
			}

		}
	}

	public static int max_level=0;
	public void right_view(Circle root,int curr_level)	{
		if(root == null)
			return;
		if(max_level<=curr_level)
		{
			System.out.print(root.data+" ");
			max_level++;
		}
		right_view(root.right,curr_level+1);
		right_view(root.left,curr_level+1);
	}

	public Circle mirror_tree(Circle root)	{

		if(root==null)
			return root;
		Circle temp=root.left;
		root.left=mirror_tree(root.right);
		root.right=mirror_tree(temp);

		return root;
	}
	public int get_level(Circle root , int level,int value){

		if(root==null)
			return 0;

		if(root.data==value)
			return level;

		int a=get_level(root.left,level+1,value);
		if(a!=0)
			return a;
		a=get_level(root.right,level+1,value);


		return a;
	}

	
	public void top_view(Circle node,int leftm, int rightm)	{

		Queue<Circle> queue = new LinkedList<>();
		TreeMap<Circle,Integer> t= new TreeMap<>();

		int level;


	}
	public void bottom_view(Circle root)	{
		class NewNode{

			Circle node;
			int height;
			public NewNode()
			{

			}
			public NewNode(int height,Circle node)
			{
				this.node=node;
				this.height=height;
			}
		}

		Queue<NewNode> queue = new LinkedList<>();
		TreeMap<Integer,Circle> tree = new TreeMap<>();

		queue.add(new NewNode(0,root));
		while(!queue.isEmpty())	{

			NewNode temp = queue.poll();

			tree.put(temp.height,temp.node);
			if(temp.node.left!=null)
				queue.add(new NewNode(temp.height-1,temp.node.left));
			if(temp.node.right!=null)	{
				queue.add( new NewNode(temp.height+1,temp.node.right));
			}

		}

		 for (Entry<Integer, Circle> entry :
             tree.entrySet()) {
            System.out.print(entry.getValue().data);
        }
        //DOesnt work

	}

	public void left_boundary(Circle root)	{
		if(root==null)
			return ;
		if(root.left!=null){
			System.out.print(root.data);
			left_boundary(root.left);
		}
		else if (root.right!=null)	{
			System.out.print(root.data);
			left_boundary(root.right);
		}
	}

	public void leaf_boundary(Circle root)	{
		if(root==null)
			return;
		leaf_boundary(root.left);
		if(root.left==null && root.right==null)
			System.out.print(root.data);
		leaf_boundary(root.right);
	}
	public void right_boundary(Circle root)	{
		if(root==null)
			return;
		if(root.right!=null)	{
			right_boundary(root.right);
			System.out.print(root.data);
		}
		else if(root.left!=null)	{
			right_boundary(root.left);
			System.out.print(root.data);
		}
	}
	public void boundary_elements(Circle root)	{
		
		if(root==null)
			return;
		System.out.print(root.data);
		left_boundary(root.left);
		leaf_boundary(root);
		right_boundary(root.right);

	}
	public static void main(String arhs[]){

		TREE1 obj = new TREE1();
		for(int i=1;i<=8;i++)
			obj.add(i);

		/*obj.level_order(obj.root);
		System.out.println();
		obj.in_order(obj.root);
		System.out.println();
		obj.pre_order(obj.root);
		System.out.println();
		obj.post_order(obj.root);
		System.out.println();
		obj.n_level_order(obj.root);
		System.out.println();
		int height = obj.height(obj.root);
		System.out.println(height);

		obj.level_o_search(obj.root,5);
		obj.pre_order(obj.root);

		System.out.println();
		obj.Iterative_preorder(obj.root);
		obj.n_level_order(obj.root);*/
		//obj.prnt_level(obj.root,2);
		
		//obj.leaf_nodes(obj.root);
		//obj.rev_lvl_order(obj.root);
		//obj.left_view(obj.root);
		//System.out.println();
		//obj.right_view(obj.root,0);
		//obj.mirror_tree(obj.root);
		//obj.level_order(obj.root);
		//int s=obj.get_level(obj.root,0,2);
		//System.out.println(s);
		//obj.bottom_view(obj.root);
		obj.boundary_elements(obj.root);

	}
}