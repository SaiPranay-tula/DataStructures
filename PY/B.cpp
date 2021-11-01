#include <iostream>
#include <bits/stdc++.h>
using namespace std;
vector <long> solve (vector< vector <int> > a,vector<vector<long long> > query){


int sum=0,n=a.size(),m=a[0].size(),x=0;
int ro[n];
int co[m];
int l[n+m];
vector< long> arr;
int z=0;
for(int i=0;i<n;i++){
sum=0;
for(int j=0;j<m;j++)
{
    sum+=a[i][j];
}
ro[z++]=sum;
}
z=0;
for(int i=0;i<n;i++){
sum=0;
for(int j=0;j<m;j++)
{
    sum+=a[j][i];
}
co[z++]=sum;
}
int count=0;
for(int i=0;i<query.size();i++)
{
count=0;
for(int i=0;i<n;i++)
{
    if(query[i][0]<=ro[i] && ro[i]<=query[i][1])
    {
        count++;
    }

}
for(int i=0;i<m;i++)
{
    if(query[i][0]<=co[i] && co[i]<=query[i][1])
    {
        count++;
    }
    
}
arr.push_back(count);
l[x++]=count;
}
return arr;
}


int main()
{
    int N;
    cin >> N;
    int M;
    cin >> M;

    vector<vector<int> > a(N,vector<int>(M));
    for(int i_a=0;i_a<N;i_a++)
    {
        for(int j_a=0;j_a<M;j_a++)
        {
            cin >> a[i_a][j_a];
        }
    }
    int Q;
    cin >> Q;
    int S; 
     vector<vector<long long > > query(Q,vector<long long>(S));
     for(int i=0;i<Q;i++)
     for(int j=0;j<S;j++)
     cin >> query[i][j];

     
     vector<long> out;
     out=solve(a,query);
     //int j=sizeof(out)/sizeof(out[0]);
     for(int i=1;i< out.size();i++)
     cout << " " << out[i];
}
    