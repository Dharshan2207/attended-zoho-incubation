#include <iostream>
using namespace std;


int binaryAddition(int a, int b){
	int result = 0;
	int place = 1;
	int carry = 0;
	
	while(a > 0 || b > 0 || carry > 0){
		int bit1 = a % 10;
		int bit2 = b % 10;
		
		int sum = (bit1 + bit2 + carry);
		carry = sum / 2;
		
		result = result + (sum%2) * place;
		place *= 10;
		a /= 10;
		b /= 10;
	}
	return result;
}

int main(){
	int a = 1010;
	int b = 110;
	
	cout << binaryAddition(a, b);
	
}
