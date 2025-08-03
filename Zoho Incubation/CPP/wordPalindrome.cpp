#include <iostream>
using namespace std;


bool checkEqual(int leftIndex, int rightIndex, int size, string input){
	for(int i = 0; i < size; i++){
		if(input[leftIndex] != input[rightIndex]){
			return false;
		}
	}
	return true;
}





bool checkPalindrome(int left, int right, int leftIndex, int rightIndex, string input, int n){
	int leftCounter = 0;
	while(left < right){
		if(input[left] != ' '){
			leftCounter++;
		}
		
		else if(input[right] != ' '){
			right--;
		}
		
		else if(input[right] == ' '){
			if(right + 1 < n){
				rightIndex = right + 1;
			}
			
			if(!checkEqual(leftIndex, rightIndex, leftCounter, input)){
				return false;
			}
			left += leftCounter;
			leftCounter = 0;
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
