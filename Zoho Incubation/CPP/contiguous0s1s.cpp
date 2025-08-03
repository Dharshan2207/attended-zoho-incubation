#include <bits/stdc++.h>
using namespace std;


int main(){
	int arr[] = {1, 1, 0, 1, 0};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	unordered_map<int, int> mp;
	
	int sum = 0;
	int len = 0;
	
	for(int i = 0; i < n; i++){
		if(arr[i] == 1){
			sum += 1;
		}
		else{
			sum += -1;
		}
		
		if(sum == 0){
			len = i + 1;
		}
		else if(mp.find(sum) != mp.end()){
			len = max(len, i - mp[sum]);
		}
		else{
			mp[sum] = i;
		}
	}
	
	cout << len;
}
