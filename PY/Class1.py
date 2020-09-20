#operator overloading
import class2
class A:
    def __init__(self):
        print("self in A")

class B(A):
    def __init__(self,data):
        self.data=data

    def __add__(self,value):
        return B(self.data+value)

    def __str__(self):
        return f'{self.data}'

    def mul(self,val):
        self.data*=val    


obj1=B(10)
print(obj1)
print(obj1+20+50)
print(obj1)
obj1.mul(10)
print(obj1)

