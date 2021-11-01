from b1 import spam

spam('hellos')

def spam(s):
    print(s)

spam("Hellow") #local scope has high priority so b1 module scope will not to called
#b1.spam("help")# Its an error

import b1

print(b1.var,b1.l)

b1.var=20
b1.l[0]="ok"
print(b1.var,b1.l)

import b1

print(b1.var,b1.l)
print(__name__)