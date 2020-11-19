#include <iostream>
#include <cstring>
#include <stdlib.h>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;
/*
bool big(int a, int b, int &big){
	if(a==b){
		return true;
		
	}
	else
	{
	if(a>b){
		big=a;
	}else{
		big=b;
	}
	return false;
		
	}
	
	 
}
*/

//class AA{
//char *p;
//	public:
//          AA(char *pname){
//	int len = strlen(pname)+1;
//	p=new char[len];
//	strcpy(p,pname);
//}
//
//AA(AA &a){
//	return 
//}
//
//~AA(){
//	delete[] p;
//		cout<<"소멸"<<endl;
//}
//void show(){
//cout<<p<<endl;
//}};

//class Music{
//	char *title;
//	int price;
//	
//	public:
//		Music(char *title1,int price){
//			int len = strlen(title1)+1;
//			title=new char[len];
//			strcpy(title,title1);
//			this->price=price;
//		}
//		Music(Music &m){
//			int len = strlen(m.title)+1;
//			this->title=new char[len];
//			strcpy(this->title,m.title);
//			this->price=m.price;
//	
//	 	}
//		~Music(){
//			delete[] title;
//			cout<<"소멸"<<endl;
//		}
//		void set(char *title,int price){
//			int len = strlen(title)+1;
//			title=new char[len];
//			strcpy(this->title,title);
//			this->price=price;
//		}
//		void show(){
//			cout<<title<<' '<<price<<endl;
//		}
//};
/*
class Jun;

class Yoogang{
	private:
	int age;
	char ary[30];
	friend class Jun;
	
	public:
		Yoogang(int n):age(n){
		
		};
	   void show(Jun &j);
	   
	
};
class Jun{
	private:
		char ary[30];
		
	public:
		Jun(char *p){
			strcpy(ary,p);
		};
		void show(Yoogang &y);
	    friend class Yoogang;
};

void Yoogang::show(Jun &j){
	cout<<j.ary<<endl;
}
void Jun::show(Yoogang &y){
	cout<<y.age<<endl;
}
*/
/*
class Acc{
string h;
public:
	
	Acc(string h){
		this->h=h;
	}
	void add(string text){
		h+=text;
	}
	void pr(){
		cout<<h<<endl;
	}
	
	~Acc(){
		cout<<"asd";
	}
	
};
Acc& append(Acc &a,string h){
	a.add(h);
	return a;
}
*/
/*class De{
	int n;
	public:
		De(int num):n(num){
			cout<<n<<endl;
		};
		~De(){
			cout<<"소..멸...!"<<endl;
		}
};

class Der:public De{
	int num;
	public:
		Der(int n):De(n),num(n){
			cout<<num<<endl;
		}
		~Der(){
			cout<<num<<endl;
		}
};*/

//class Base{
//	int num;
//	public:
//		Base():num(20){
//			cout<<"base"<<endl;
//		}
//		Base(int n):num(n){
//			cout<<"base1"<<endl;
//		}
//		void show(){
//			cout<<"baseshow"<<endl;
//		}
//};
//class ball:public Base{
//	int num;
//	public:
//		ball():num(40){
//			cout<<"ball"<<endl;
//		}
//		ball(int n):num(n){
//			cout<<"ball1"<<endl;
//		}
//		ball(int n,int m):Base(n),num(m){
//			cout<<"ball2"<<endl;
//		}
//		void shows(){
//			show();
//				cout<<"ballshow"<<endl;
//		}
//};
/*
class Der{
	private:
		int n1;
	protected:
		int n2;
	public:
	 int n3;
	Der():n1(1),n2(2),n3(3){
		
	}
};
class De:protected Der{
	
};*/
//
//class Rec{
//	int a,b;
//	public:
//		Rec(int a,int b){
//			this->a=a;
//			this->b=b;
//		}
//		void show(){
//			cout<<a*b<<endl;
//		}
//};
//
//class Sq:public Rec{
//	public:
//		Sq(int s):Rec(s,s){}
//		
//};
/*
class Music{
	string a,b;
	int c;
	public:
		Music(string a, string b, int c):a(a),b(b),c(c){
			
		}
		void show(){
			cout<<a<<b<<c<<endl;
		}
};

class Consert:public Music{
	string d;
	public:
		Consert(string a,string b, int c,string d):Music(a,b,c),d(d){
			
		}
		void shows(){
			show();
			cout<<d<<endl;
		}
};
*//*
class AA{

public:
	void aa(){
		cout<<"aa"<<endl;
	}

};

class BB:public AA{
	public:
		void bb(){
			cout<<"bb"<<endl;
		}
};
class CC:public BB{
	public:
		void cc(){
			cout<<"cc"<<endl;
		}
};
*/
class One{
	public:
		virtual void func(){
			cout<<"one"<<endl;
		}
};
class Two:public One{
	public:
		virtual void func(){
			cout<<"Two"<<endl;
		}
};
class Three:public Two{
	public:
	virtual 	void func(){
			cout<<"three"<<endl;
		}
};

int main(int argc, char** argv) {

Three *tp = new Three();

Two *twp =tp;

One *op=tp;

op->func();
twp->func();
tp->func();

delete tp;







/*
AA *pa = new BB();
AA *pb = new CC();
BB *pc = new CC();

pa->aa();
pb->aa();
pc->bb();

delete pa;
delete pb;
delete pc;
*/







/*
Music music("sing","11",40000);
music.show();
 
Consert con("song","22",50000,"key");
con.shows();
*/
//Rec r(5,7);
//r.show();
//
//Sq s(5);
//s.show();






//De d1;
//cout<<d1.n1<<endl;



//ball d1;
//d1.shows();
//
//ball d2(20);
//d2.shows();
//
//
//ball d3(20,40);
//d3.shows();

//Der d1(40);
//Der d2(50);








/*	
	Acc a("hello");
	Acc& tmp = append(a,"hi");
	tmp.pr();//hello
	a.pr();//hi
*/	
	
	
/*
 Yoogang y(22);
   Jun j("jun");
   y.show(j);
   j.show(y);


*/
/*

//Music m("aa",200000);
//Music m1(m);
//
//cout<<&m<<' '<<&m1<<endl;


//AA a("c++");
//AA b(a);
//a.show(); 
// b.show();
 
 */
 
 
 
 /*
 cout<<"2개 정수 입력"<<endl;
 int a,b,max;
 
 cin>>a>>b;
 if(big(a,b,max)){
 	cout<<"두 정수 같다"<<endl;
 }else{
 	cout<<"큰수는"<<max<<endl;
 }
 
	return 0;*/
}
