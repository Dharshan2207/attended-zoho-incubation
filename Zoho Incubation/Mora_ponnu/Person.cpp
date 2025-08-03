#include<bits/stdc++.h>
using namespace std;

class Person{
	private : 
		string name;
		string gender;
		Person* father = nullptr;
		Person* mother nullptr;
		vector<Person*> children;
		
		
	public:
		Person(string name, string gender){
			this->name = name;
			this->gender = gender;
		}
};
