class Happy:
    """
    bool(obj) takes self.__bool__(obj) 
    if its not present then it considers __len__() 
    """
    def __init__(self,A,B):
        self.A=A
        self.B=B
    def __bools__(self):
        return bool(self.A) and bool(self.B)   

    def __len__(self):
        return 0   


H=Happy(10,11)
print(bool(H))    
print(len(H))    