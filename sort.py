class A:
    def __init__(self,name,age,clas):
        self.name=name
        self.age=age
        self.clas=clas

    def __repr__(self):    # """ For Printing the object"""
        return f'{self.age},{self.name}'

def name_sort(b):
    return b.name

def age_sort(b):
    return b.age    








std1=A("ANME",34,"C")
std2=A("ZPPO",1,"d")

print(std1)

lis=[std1,std2]

print(sorted(lis,key=name_sort))
print(sorted(lis,key=age_sort))
ls=[sorted(lis,key=lambda x:x.clas,reverse=True)]
print(ls)

