#include <bits/stdc++.h> // header file includes every Standard library
using namespace std;

int main() {

	// Your code here
    int n,k;
    cin>>n;
    cin>>k;
    long arr[n];
    for(int i =0;i<n;i++)
        cin>>arr[i];
    long mul = 1;
    int mod = 1000000007;
    std::deque<int> Qi(k);
    int i;
    for (i = 0; i < k; ++i){
    	while ((!Qi.empty()) && arr[i] >= arr[Qi.back()])
        Qi.pop_back();
        Qi.push_back(i);
    }
    for (; i < n; ++i){
        mul=(mul%mod*arr[Qi.front()]%mod)%mod;
        while ((!Qi.empty()) && Qi.front() <=i - k)
        Qi.pop_front();
        
		while ((!Qi.empty()) && arr[i] >=arr[Qi.back()])
    	Qi.pop_back();
        Qi.push_back(i);
    }
    mul=(mul%mod*arr[Qi.front()]%mod)%mod;
    cout<<mul;
	return 0;
}
