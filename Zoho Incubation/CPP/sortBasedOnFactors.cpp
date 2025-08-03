#include <bits/stdc++.h>
using namespace std;

int factorCount(int n){
	int count = 2;
	for(int i = 2; i < n / 2; i++){
		if(n % i == 0) count++;
	}
	return count;
}

int main(){
	
	int arr[] = {11, 6, 16, 27, 9};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	int index = 0;
	
	for(int i = 0; i < n; i++){
		for(int j = i + 1; j < n - 1; j++){
			
		}
	}
}
