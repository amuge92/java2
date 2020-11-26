#include <iostream>
#include <cstring>
#include<cstdlib>
#include<ctime>
#include<vector>
using namespace std;

class qu{
	string m,j;
	public:
		qu(string mm,string jj){
			m=mm;
			j=jj;
		};
	    string getm(){
	    	return m;
		};
		string getj(){
	    	return j;
		};
		bool operator ==(qu qu){
		if(m==qu.m){
			return true;
		}	else
		return false;
		};
};
int main(int argc, char** argv) {
vector <qu> v;
int a;
string m,j;
while(1){
	int kk=0;
	cout<<"1:입력 2: 퀴즈 3:종료"<<endl;
	cin>>a;
	if(a==3){
		break;
	}
	if(a==1){
		cin>>m>>j;z
		qu q(m,j);
		for(int i=0;i<v.size();i++){
		qu a = v.at(i);
		if(a==q){
			cout<<"이미 있는 문제임"<<endl;
	    	kk=1;
			break;
		}
		};
		if(kk==0){
	  		 v.push_back(q);			
		};
	};
	if(a==2){
		string j;
	int r=rand()%v.size(); 
	cout<<v.at(r).getm()<<"를 영어로"<<endl;
	cin>>j;
	if(v.at(r).getj()==j){
		cout<<"정답.."<<endl;
	}else 
	cout<<"틀렸따리.."<<endl;
	};
	
	
}


	return 0;
}
