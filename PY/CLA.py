#ENCAPSULATION

class CLA:
    """ENCAPSULATION"""

    def __init__(self, *args):
        self.__name= args[0]
        self.__age= args[1]
    
    def set_name(self, new_name):
        self.__name= new_name
    
    def get_name(self):
        return self.__name        

    def __str__(self):
        return f"{self.__name} is above  {self.__age}"

obj1=CLA("PRAN","123")
#print(obj1)
#print(obj1.__name)  ERROR NO ATTRIBUTE

print(obj1._CLA__name)  # ACCESSING WITH CLASS NAME OUTSIDE OF CLASS

