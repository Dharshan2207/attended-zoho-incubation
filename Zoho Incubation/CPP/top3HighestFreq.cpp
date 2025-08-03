#include <bits/stdc++.h>
using namespace std;


int main(){
	
	int arr[] = {7, 7, 7, 7, 3, 5, 3, 11, 6, 9, 11, 5, 3, 7, 3};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	int top1 = 0;
	int top2 = 0;
	int top3 = 0;
	
	for(int i = 0; i < n; i++){
		int count = 1;
		for(int j = i + 1; j < n; j++){
			if(arr[i] == arr[j]){
				count++;
			}
		}
		if(count > top1){
			top3 = top2;
			top2 = top1;
			top1 = arr[i];
		}
		else if(count <= top1 && count > top2 && arr[i] != top1){
			top3 = top2;
			top2 = arr[i];
		}
		else if(count <= top1 && count <= top2 && count > top3 && arr[i] != top2 && arr[i] != top1){
			top3 = arr[i];
		}
	}
	
	cout << top1 << endl << top2 << endl << top3;
}
