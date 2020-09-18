"""l=list(range(6,10))
D=iter(l)

try:
    while True:
        print(next(D))    
except Exception:
    pass

c=range(10)
enum=enumerate(c)
d=iter(enum)
try:
    while True:
        print(next(d))
except Exception:
    pass   

print(list(enumerate('spam',start=1)))

l=[x for x in range(10)]
l=[x for x in range(10) if x%2==0]
l=[x if x%2==0 else 0 for x in range(10)]
l=[x*y for x in range(5) for y in range(10,15)]
l=[x*y if x*y%2==0 else 0 for x in range(5) for y in range(10,15)]
print(l)"""

a,b=zip((1,2),(9,3))
print(a,b)
a,b=zip(*zip((1,2),(9,3)))
print(a,b)