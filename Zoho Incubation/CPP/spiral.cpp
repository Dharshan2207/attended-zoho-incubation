#include <iostream>
using namespace std;

int main() {
   int arr[] = {10, 3, 15, 5, 4, 13};
    int n = sizeof(arr) / sizeof(arr[0]);
        
        
    int index = 0, maxi, mini;
    int maxIndex = 0;
    int minIndex = 0;
    
    
    for(int i = 0; i < n; i++){
    	maxi = arr[i];
    	mini = arr[i];
    	
    	for(int j = index + 1; j < n; j++){
    		if(arr[j] > maxi){
    			maxi = arr[j];
    			maxIndex = j;
			}
			else if(arr[j] < mini){
				mini = arr[j];
				minIndex = j;
			}
			
		}
		int temp = arr[maxIndex];
		arr[maxIndex] = arr[index];
		arr[index] = temp;
			
		if(index < n-1) index++;
			
		temp = arr[minIndex];
		arr[minIndex] = arr[index];
		arr[index] = temp;
			
		if(index < n-1) index++;
	}
	
	for(int i = 0; i < n; i++){
		cout << arr[i] << " ";
	}

    return 0;
}
