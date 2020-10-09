from itertools import combinations
l=[]
for i in range(65,65+26):
    l.append(chr(i))

l
j=[]
g=list(combinations(l,4))
for i in g:
    j.append("".join(i)+"9571")


with open('a.txt','w') as f:
    for i in j:
        f.write(i+'\n')

