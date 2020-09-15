#decorators is function which takes other fuctions and later them, add functionality  and without modifying orogial function and returns another function

"""
def outer_function(original_function):
    def inner_function():
        return original_function()
    return inner_function

@outer_function
def real_function():
    print("This is Original and Real function")

real_function=outer_function(real_function) 
real_function()

#or 

real_function()    

def outer_function(original_function):
    def inner_function(*args,**kwargs):
        return original_function(*args,**kwargs)
    return inner_function

@outer_function
def real_function(name,age):
    print("This is Original and Real function" ,name ,"  ",age)



real_function("hello",67) 


import time
def time_sec(original_function):
    t1=time.time()
    time.sleep(2)
    def inner_function(*args,**kwargs):
        original_function(*args,*kwargs)
        t2=time.time()-t1
        print("Time=",t2)
    return inner_function    

@time_sec
def disp():
    print("HELLO WORLD")

disp()   """

#decorators that takes args

"""
def dec_prefix(prefix):
    def decorator_function(original_function):
        def wrapper_function(*args,**kwargs):
            print(prefix,"BEFORE EXECUTING FUNCTION ",original_function.__name__)
            original_function(*args,**kwargs)
            print(prefix,"AFTER EXECTUTING ORIGINAL FUNCTION",original_function.__name__)
        return wrapper_function
    return decorator_function

@dec_prefix("__NONE__")
def display():
    print("AM DISPLAYING")           


display()    """
#NESTED DECORATORS
def decorator_function1(original_function):
    def wrapper_function1(*args,**kwargs):
        print("DECORATOR_1")
        original_function(*args,**kwargs)
    return wrapper_function1

def decorator_function2(original_function):
    def wrapper_function2(*args,**kwargs):
        print("DECORATOR_2")
        original_function(*args,**kwargs)
    return wrapper_function2

@decorator_function2
@decorator_function1
def display():
    print("DISPLAYING")




display()











