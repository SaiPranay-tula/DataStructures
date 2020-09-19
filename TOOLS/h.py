def b(a1):
    b.a=a1
    def a2():
        b.a+=1
        print(b.a)
    return a2     
a=b(10)
a()
a()
