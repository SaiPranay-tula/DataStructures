class Usr_dic(dict):
    def __missing__(self,key):
        if isinstance(key,str):
            raise KeyError(key)
        else:
            return self[str(key)]

    def get(self,key,default):
        try:
            return self[key]
        except KeyError:
            return default

    def __contains__(self,key):
        return self[key] in self.keys() or self[str(key)] in self.keys()                       


Dic=Usr_dic([('1',"one"),("2","two"),("3","three")])
print(Dic)
print(Dic[1])
print(Dic.get(82,"-1"))