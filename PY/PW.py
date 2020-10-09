import PyPDF2  as pd
from itertools import permutations
l=[]
for i in range(65,65+26):
    l.append(chr(i))

l
j=[]
g=list(permutations(l,4))
for i in g:
    j.append("".join(i)+"9571")


#/*with open('a.txt','w') as f:
  #  for i in j:
   #     f.write(i+'\n')*/

filename = r"C:\Users\vinay\Downloads\J.pdf"

file = open(filename, 'rb')
pdfReader = pd.PdfFileReader(file)

tried = 0

if not pdfReader.isEncrypted:
    print('The file is not encryted! You can successfully open it!')

else:
    wordListFile = open(r'Q:\PRANAY\DataStructures\a.txt', 'r')
    
    

    for i in range(len(j)):
        word = j[i]
        print('Trying dencryption by: {}'.format(word))
        result = pdfReader.decrypt(word)
        if result == 1:
            print('Success! The password is: ' + word)
            break

        elif result == 0:
            tried += 1
            print('Password tried: ' + str(tried))
            continue