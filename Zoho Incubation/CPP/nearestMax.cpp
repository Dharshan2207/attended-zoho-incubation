#include <bits/stdc++.h>
using namespace std;


int main(){
	int arr[] = {9, 3, 11, 4};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	int maxi = 0;
	int maxiIndex = 0;
	int firstIndex = 0;
	
	
	for(int i = 0; i < n; i++){
		maxi = arr[i];
		firstIndex = i;
		
		for(int j = i + 1; j < n; j++){
			if(arr[j] > maxi){
				maxi = arr[j];
				maxiIndex = j;
				
				swap(arr[maxiIndex], arr[firstIndex]);
				break;
			}
			else if(maxi == arr[i]){
				arr[i] = -1;
			}
		}
	}
	
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}
}
