#include <bits/stdc++.h>


using namespace std;

#define MEM(a, b) memset(a, (b), sizeof(a))

#define FOREACH(it, l) for (auto it = l.begin(); it != l.end(); it++)

#define IN(A, B, C) assert( B <= A && A <= C)

#define MP make_pair
#define FOR(i,a) for(int i=0;i<a;i++)

#define FOR1(i,j,a) for(int i=j;i<a;i++)

#define EB emplace_back

#define INF (int)1e9

#define EPS 1e-9

#define PI 3.1415926535897932384626433832795
#define max1 101
#define MOD 1000000007

#define read(type) readInt<type>()

#define out(x) cout<<x<<'\n'
#define out1(x) cout<<x<<" "
#define END cout<<'\n'
#define int long long
#define sz(v) ((int)(v).size())
#define all(v) (v).begin(), (v).end()
void fast(){
ios::sync_with_stdio(0);
cin.tie(0);
cout.tie(0);

}

int solve(string s)
{
int n = s.length();
queue<int> q[26];
for(int i=0;i<n;i++){
    q[s[i]-'a'].push(i);
}
int ans = INT_MAX;
while(!q[0].empty()){
    int start = q[0].front();
    q[0].pop();
    int cur = start;
    bool allchar=true;
    for(int i=1;i<26;i++){
        while(q[i].size()!=0 && q[i].front()<cur){
            q[i].pop();
        }
        if(q[i].size()==0){
            allchar=false;
            break;
        }
        cur=q[i].front();

    }
    if(allchar==false){break;}
    ans=min(ans,cur-start+1);
}
if(ans==INT_MAX){return -1;}
return ans;
}
signed main() {




   int t;
    //cin>>t;
    t=1;
    //vector<string> v;
    while(t--){
    string s;
    cin>>s;


    int r=solve(s);
    cout<<r<<endl;
    }

}
