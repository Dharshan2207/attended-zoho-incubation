#include <iostream>
using namespace std;


void swap(int arr[], int left, int right){
	while(left < right){
		if(arr[left] % 2 == 0){
			left++;
		}
		else if(arr[right] % 2 == 0){
			right--;
		}
		else if(arr[left] % 2 == 1 && arr[right] % 2 == 1){
			int temp = arr[left];
			arr[left] = arr[right];
			arr[right] = temp;
			left++;
			right--;
		}
	}
}

int main(){
	int arr[]  = {15, 2, 15, 10, 13, 1, 6};
	int n = sizeof(arr) / sizeof(arr[0]);
	
	int left = 0;
	int right = n-1;
	
	swap(arr, left, right);
	
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}
	
	
}
