def pit(*args,**kwargs):
    print(args)
    print(kwargs)
    if __name__=="__main__":
        print("TRUE")
    else:
        print(__name__)    

"""
l=[1,2,3,4,5,5] 
g=dict([('1',2),('2',3),('5',6)])
print(g)
pit(l,**g)"""