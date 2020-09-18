import sys
import time

"""
temp=sys.stdout
sys.stdout=open('LOG.txt','a')
print('SPAM')
print(1, 2, 3)
sys.stdout.close()

print(open('LOG.txt','r').read()) """

log=open('LOG.txt','a')

print("TO FILE FROM HERE time=",time.time(),file=log)