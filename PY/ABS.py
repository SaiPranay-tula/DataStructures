from abc import ABC,abstractmethod

class Interface(ABC):

    @abstractmethod
    def abs_method(self):
        pass


    @staticmethod
    def absmethod():
        print("abs in interface")



class NEW_CLASS(Interface):

    @staticmethod
    def abs_method():
        print("abs in class")

a=NEW_CLASS()
a.abs_method()
a.absmethod()