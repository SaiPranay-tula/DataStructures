"""l="kmit"
l=list(l)
print(l)

l=tuple(range(10))
print(l)

#errorl[2]="kmit"
#print(l)


l=(1,2,3,"kmit",[1,2,3],{0,1,23})
l[4][2]=121
print(l)


l=[1,2,3]
di=dict(a='1',b=2)
print(str(l),str(di))
d=l
d[0]=12             #mutable changes the value of l too.
print(l,d)

((a, b), c) = ('SP', 'AM')

print(a,b,c



tup=( ( (1,2),3 ) , ( (2,3) , 4),( (3,4) ,5), ( (4,5),6))
for ((a,b),c) in tup:
    print(a,b,c)  

l=list(range(10))
#a,b,c=l                 error too many values to unpack

a,*b=l                  #0 [1, 2, 3, 4, 5, 6, 7, 8, 9]

*a,b=l                  #[0, 1, 2, 3, 4, 5, 6, 7, 8] 9


*a,b,c=l                #[0, 1, 2, 3, 4, 5, 6, 7] 8 9

a,*b,c=l                #0 [1, 2, 3, 4, 5, 6, 7, 8] 9

#*a,b,*c=l              cannot contain more than 1 * unpacking operator in a statement
a,*b,c="sa"             #s [] a     * can contain >=0 values

#*a=l                    #error *var must be in seq
*a,=l
print(a)
"""
