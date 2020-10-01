def MCQResult(key,paper):
    wrng=0
    crct=0
    for i in range(len(key)):
        if paper[i]>0:
            if paper[i]==key[i]:
                crct+=1
            else:
                wrng+=1

    return (crct*3)-(wrng)            


#key=[int(x) for x in input().split(" ")]
#paper=[int(x) for x in input().split(" ")]
#print(MCQResult(key,paper))


def sum(n,m):
    sum=0
    for i in range(0,m+1,n):
        sum+=i
    return sum
n=int(input())
m=int(input())
print(sum(n,m))
