class Node:
    
    def __init__(self,data=None):
        self.data=data
        self.left=None
        self.right=None

class TPY:
    root=Node()


    def __init__(self):
        pass

    def add(self,element):
        root=add1(root,element)


    def add1(self,node,element):
        if node==None:
            node=Node(element)
            return node
        else:
            if element>node.data:
                node.right=add1(node.right,element)   
            else:
                node.left=add1(node.left,element) 

        return node                

    def In_Order(self,node):
        if node==None:
            return
        In_Order(node.left)
        print(node.data)
        In_Order(node.right)        



T=TPY()
for i in {30 , 20 , 10 , 15 , 25 , 23 , 39 , 35 , 42}:
    T.add(i)








