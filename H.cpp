#include <bits/stdc++.h>
typedef long long int lli;
#define pb push_back
#define endl '\n'
#define vi vector<int>
#define MOD 1000000007
using namespace std;
vi adj[100001];
int vis[100001] , in[100001] ,low[100001];
int timer;
set<int> s1;
void dfs(int node , int par)
{
    vis[node] = 1;
    in[node] = low[node] = timer;
    timer++;
    for(int i : adj[node])
    {
        if(i == par) continue;
        if(vis[i] == 1)
        {
            low[node] = min(low[node] , in[i]);
        }
        else
        {
            dfs(i , node);
            if(low[i] > in[node])
                s1.insert(node) , s1.insert(i);
            low[node] = min(low[node] , low[i]);
        }
    }
}
int main()
{
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);
    cout.tie(NULL);
    
    int n , m , a , b;
    cin >> n >> m;
    for(int i = 0;i < n;i++)
    {
        cin >> a >> b;
        adj[a].pb(b);
        adj[b].pb(a);
    }
    dfs(0 , -1);
    for(int i : s1)
        cout << i << endl; 
     return 0;
}