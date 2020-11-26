#include <iostream>
#include <cstring>
#include<cstdlib>
#include<ctime>
using namespace std;

template<typename T>
T big(T a[], int b){
	T temp = a[0];
	for(int i = 0 ; i<b ; i++){
	if(temp<a[i]){
		temp=a[i];
	}	
	};
	
	return temp;
};

int main(int argc, char** argv) {
	int ary1[]={5,4,2,7,8};
	double ary2[]={4,7.4,2.6,7.7,2.2};
	char ary3[]={'a','n','c','h','t'};
	
	cout<<big(ary1,5)<<endl;
	cout<<big(ary2,5)<<endl;
    cout<<big(ary3,5)<<endl;
		
	return 0;
}
