#generators

def prints(ran):
    for i in range(1,ran):
        yield(i*i)


a=prints(10)
print(next(a))

for i in a:
    print(i)



g=(i for i in range(10))    
print(list(g))

#generator dont until they are called 
#they are effecient than list when dont want to store the values 

#generator adds functionality to funtion that it returns value at each step
#when we call the function or encloses yield it returns the value
