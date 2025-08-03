#include <iostream>
using namespace std;


int main(){
	
	int n = 7;
	int oneCount = 0;
	int zeroCount = 0;
	int temp = n;
	
	while(temp > 0){
		int rem = (temp % 2);
		if(rem == 0){
			zeroCount++;
		}
		else{
			oneCount++;
		}
		temp /= 2;
	}
	
	cout << "1 : " << oneCount << endl;
	cout << "0 : " << zeroCount << endl;
}
