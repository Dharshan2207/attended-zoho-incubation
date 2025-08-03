#include <iostream>
using namespace std;


int main(){
	
	
	int input = 12345;
	
	int k = 2;
	int size = 0;
	
	int temp = input;
	while(temp > 0){
		temp = temp / 10;
		size++;
	}
	
	int result = 0;
	
	int count = 0;
	int multiplier = 1;
	int firstHalf = 0;
	temp = input;
	
	while(temp > 0){
		int rem = temp % 10;
		if(count < (size-k)){
			result = rem * multiplier + result;
		}
		else{
			if(count == size - k){
				multiplier = 1;
			}
			firstHalf = rem * multiplier + firstHalf;
		}
		count++;
		multiplier *= 10;
		temp = temp / 10;
	}
	multiplier = 1;
	for(int i = 0; i < (k); i++){
		multiplier *= 10;
	}
	cout << result << endl;
	cout << firstHalf << endl;
	result = result * multiplier + firstHalf;
	
	cout << result;
	
	
}
