#include <bits/stdc++.h>
using namespace std;

bool isVowel(char c){
	return (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u');
}

int main(){
	string name = "ragadharshan";
	int n = name.size();
	
	int count = 1;
	int maxCount = 0;
	
	string longest = "";
	string sub = "";
	
	sub += name[0];
	
	for(int i = 0; i < n; i++){
		if(isVowel(name[i])){
			if(count > maxCount){
				maxCount = count;
				longest = sub;
			}
			sub = "";
			count = 0;
		}
		else{
			sub += name[i];
			count++;
		}
	}
	
	cout << longest << " " << maxCount;
	
}
