#include <iostream>
using namespace std;


int main(){
	int ip = 12345;
	int k = 2;
	
	int temp = ip;
	int counter = 0;
	
	while(temp > 0){
		counter++;
		temp /= 10;
	}
	
	int place = 1;
	for(int i = 0; i < (k); i++){
		place = place * 10;
	}
	
	int firstHalf = ip / place;
	int secondHalf = ip % place;
	
	place = 1;
	
	for(int i = 0; i < counter-k; i++){
		place = place * 10;
	}
	
	int result = secondHalf * place + firstHalf;
	
	
	
	cout << firstHalf << endl << secondHalf << endl << result;
}
