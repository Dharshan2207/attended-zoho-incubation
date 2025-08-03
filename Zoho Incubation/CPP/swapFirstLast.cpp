#include <bits/stdc++.h>
using namespace std;


int main(){
	
	int arr[] = {17, 11, 7, 9, 14, 3, 6};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	int left = 0, right = n-1;
	
	int minIndex = 0;
	bool toggle = 0;
	
	for(int i = 0; i < n && i != right; i++){
		int mini = arr[i];
		minIndex = i;
		for(int j = i; j <= right; j++){
			if(arr[j] < mini){
				mini = arr[j];
				minIndex = j;
			}
		}
		
		if(!toggle){
			swap(arr[left], arr[minIndex]);
			toggle = !toggle;
			left++;
		}
		else{
			
			swap(arr[right], arr[minIndex]);
			
			toggle = !toggle;
			right--;
		}
	}
	
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}
}
