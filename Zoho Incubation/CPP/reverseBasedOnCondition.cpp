#include <bits/stdc++.h>
using namespace std;


void reverse(int arr[], int len, int left, int right){
	while(left <= right){
        int temp = arr[left];
        arr[left] = arr[right];
        arr[right] = temp;
        left++;
        right--;
    }
}
    int main() {

        int arr[] = {7, 9, 13, 5, 3, 15, 2, 8, 12, 10};

        int len = sizeof(arr) / sizeof(arr[0]);
        int n = 4;
        int left = 0;
        int right = n-1;

        int i = 0;
        while(i < len){
            if(i + n <= len - 1){
                left = i;
                right = i + (n - 1);

                
                i += n-1;
            }
            else{
                left = i;
                right = len-1;

				
                i += (len - i);
            }
            reverse(arr, len, left, right);
            i++;
        }
        
        for(int j = 0; j < len; j++){
        	cout << arr[j]  << " ";
		}
    }

