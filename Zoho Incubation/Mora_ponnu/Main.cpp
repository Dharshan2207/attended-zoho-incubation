#include<bits/stdc++.h>
using namespace std;

class Person{
	private : 
		string name;
		string gender;
		Person* father = nullptr;
		Person* mother = nullptr;
		vector<Person*> children;
		
		
	public:
		Person(string name, string gender){
			this->name = name;
			this->gender = gender;
		}
		
		string getName() const{
			return name;
		}
		
		string getGender() const{
			return gender;
		}
		
		Person* getFather() const{
			return father;
		}
		
		Person* getMother() const{
			return mother;
		}
		
		vector<Person*> getChildren(){
			return children;
		}
		
		void setGender(string g){
			gender = g;
		}
		
		void setFather(Person* f){
			father = f;
		}
		
		void setMother(Person* m){
			mother = m;
		}
		
		void addChild(Person* c){
			children.push_back(c);
		}
};

unordered_map<string, Person*> people;


vector<string> split(string line, char delimiter = ',') {
    vector<string> result;
    size_t start = 0, end;

    while ((end = line.find(delimiter, start)) != string::npos) {
        string part = line.substr(start, end - start);
        // Trim leading/trailing whitespace
        while (!part.empty() && isspace(part.front())) part.erase(part.begin());
        while (!part.empty() && isspace(part.back())) part.pop_back();
        result.push_back(part);
        start = end + 1;
    }

    string part = line.substr(start);
    while (!part.empty() && isspace(part.front())) part.erase(part.begin());
    while (!part.empty() && isspace(part.back())) part.pop_back();
    result.push_back(part);

    return result;
}



Person* getPerson(string name){
	if(people.find(name) == people.end()){
		people[name] = new Person(name, "Unknown");
	}
	return people[name];
}


vector<string> getCousins(string personName){
	vector<string> cousins;
	
	Person* person = getPerson(personName);
	set<string> cousinSet;
	
	
	vector<Person*> parents = {person->getFather(), person->getMother()};
	
	for(Person* parent : parents){
		if(!parent) continue;
		
		Person* grandfather = parent->getFather();
		Person* grandmother = parent->getMother();
		
		if(!grandfather && !grandmother){
			continue;
		}
		
		vector<Person*> siblings;
		
		if(grandfather){
			for(Person* child : grandfather->getChildren()){
				if(child->getName() != parent->getName()){
					siblings.push_back(child);
				}
			}
		}
		if(grandmother){
			for(Person* child : grandmother->getChildren()){
				if(child->getName() != parent->getName()){
					siblings.push_back(child);
				}
			}
		}
		
		for(Person* sibling : siblings){
			for(Person* cousin : sibling->getChildren()){
				cousinSet.insert(cousin->getName());
			}
		}
		
	}
	
	for(const string& name : cousinSet){
		cousins.push_back(name);
	}
	
	return cousins;
}




int main(){
	
	vector<string> input = {
        "John, Male, Brad, Lisa",
        "Emma, Female, Brad, Lisa",
        "Alex, Male, John, Jenny",
        "Emily, Female, Steve, Emma",
        "Rachel, Female, Steve, Emma"
    };
    
    
    for(string line : input){
    	vector<string> parts = split(line);
    	
    	string name = parts[0];
    	string gender = parts[1];
    	string fatherName = parts[2];
    	string motherName = parts[3];
	
	
		Person* person = getPerson(name);
		person->setGender(gender);
		
		Person* father = getPerson(fatherName);
		Person* mother = getPerson(motherName);
		
		person->setFather(father);
		person->setMother(mother);
		
		father->addChild(person);
		mother->addChild(person);
	}
	
	string target;
	cout << "Enter target name : ";
	cin >> target;
	
	vector<string> cousins = getCousins(target);
	
	for(string name : cousins){
		cout << name << " ";
	}
	cout << endl;
	
	
	
}
