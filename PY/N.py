"""mel = {'name': 'Mark','jobs': ['trainer', 'writer'],'web': 'www.rmi.net/˜lutz','home': {'state': 'CO', 'zip':80513}}
print(mel)

print(mel['jobs'][1])

print(mel['home']['zip'])


for i in mel:
    print(i,"  ",mel[i])


l=(1,2,3,4,5)
z=(6,7,8,9,10)

d=dict(zip(l,z))
print(d)   
#creating dict with only keys known

keys=[1,2,3,4,22]
d=dict.fromkeys(keys,'Nan')
print(d)"""
#UNION and Intersection in Dict

d=dict(a=1,b=2,c=121)
D = dict(a1=1, b2=2, c2=3)
print(dict(d.items() | D.items()))