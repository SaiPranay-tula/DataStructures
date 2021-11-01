class C:
    """
    opertaor overloading 
    and method overloading """

    def __init__(self,name=None):

        self.name=name

    def __add__(self,obj1):
    
        if isinstance(obj1,C):
            return C(self.name +"   " +obj1.name)
        else:    
            return self.name+"  "+obj1  

    def __mul__(self,obj1):

        if isinstance(obj1,C):
            return "Nothing"
        return self.name*obj1 

    def Upper(self):
        return self.name.upper()                 

    def __str__(self):
        return f"value={self.name}"


"""obj=C("Name")
obj1=C("NO NAME")
print(obj+"hello")                    #adding 2 objects
print(obj*2)                          #multiplying 

ob=C()
print(C.__dict__)
print()
print(C.__dict__.keys())
print(C.__base__)
print(ob.__class__)
"""
obj=C("Hello")
print(obj.Upper())