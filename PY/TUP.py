"""l="kmit"
l=list(l)
print(l)

l=tuple(range(10))
print(l)

#errorl[2]="kmit"
#print(l)"""


l=(1,2,3,"kmit",[1,2,3],{0,1,23})
l[4][2]=121
print(l)