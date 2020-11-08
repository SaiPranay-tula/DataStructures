mat=[[1,2,3,4],[12,13,14,5],[11,16,15,6],[10,9,8,7]]
st_rw=0
en_rw=len(mat)-1
st_co=0
en_co=len(mat[0])-1
result=[]

while st_rw<=en_rw and st_co<=en_co:
    for i in range(st_co,en_co+1):
        result.append(mat[st_rw][i])
    for i in range(st_rw+1,en_rw+1):
        result.append(mat[i][en_co])
    for i in reversed(range(st_co,en_co)):
        result.append(mat[en_rw][i])
    for i in reversed(range(st_co+1,en_rw)):
        result.append(mat[i][st_co])
    
    st_co+=1
    en_co-=1
    st_rw+=1
    en_rw-=1
        
    


print(result)
