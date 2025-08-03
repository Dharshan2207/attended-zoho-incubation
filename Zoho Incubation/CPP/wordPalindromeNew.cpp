#include <iostream>
using namespace std;


bool checkEqual(int leftIndex, int rightIndex, int size, string input){
	int counter = 0;
	for(int i = 0; i < size; i++){
		if(input[leftIndex] != input[rightIndex]){
			return false;
		}
		leftIndex++;
		rightIndex++;
	}
	return true;
}





bool checkPalindrome(int left, int right, int leftIndex, int rightIndex, string input, int n){
	int leftCounter = 0;
	while(left < right){
		
		if(input[right] != ' '){
			right--;
			counter++;
		}
		
		else if(input[right] == ' '){
			if(right + 1 < n){
				rightIndex = right + 1;
			}
			leftIndex = left;
			left += counter;
			if(!checkEqual(leftIndex, rightIndex, counter, input)){
				return false;
			}
			
			counter = 0;
			right--;
		}
		
		
	}
	return true;
}

int main(){
	
	string input = "i read a story a read i";
	int n = input.size();
	
	int left = 0, right = n-1;
	string leftWord = "";
	string rightWord = "";
	
	int leftIndex = left;
	int rightIndex = right;
	
	if(checkPalindrome(left, right, leftIndex, rightIndex, input, n)){
		cout << "palindrome";
	}
	else{
		cout << "Not palindrome";
	}
	
	
}

