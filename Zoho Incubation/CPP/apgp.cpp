#include<bits/stdc++.h>
using namespace std;


void apGp(int a, int d, int n, int add, int mul){
	int temp = a;
	
	for(int i = 0; i < n; i++){
		cout << temp << " ";
		temp = temp * mul + add;
	}
}


int main(){
	int a = 5;
	int d = 3;
	int n = 4;
	char type = 'g';
	
	int mul, add;
	
	if(type == 'a'){
		mul = 1;
		add = d;
	}
	else if(type == 'g'){
		add = 0;
		mul = d;
	}
	
	apGp(a, d, n, add, mul);
	
}
