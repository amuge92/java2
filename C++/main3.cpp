#include <iostream>
#include <cstring>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */
using namespace std;
/*
class De{
	
	public:
	virtual void pr(){
		cout<<"데"<<endl;
	}
};

class Der:public De{
	
	public:
		int x;
	    virtual void pr(){
	    cout<<"덜"<<endl;
		De::pr();//기본 클래스의 pr()호출... 
	
	}
};
*//*
class Add{
	protected:
		int add(int a, int b){
			return a+b;
		}
};
class Sub{
	protected:
		int sub(int a, int b){
			return a-b;
		}
};
class Cal:public Add, public Sub{
	public:
	int cal(char a,int b, int c){
		if(a=='+'){
			return add(b,c);
		}else{
			return sub(b,c);
		}
	}
};
*//*
class Cal{
	public:
		virtual int add(int a,int b)=0;
		virtual double avg(int a[],int n)=0;
		
};
class Calcu:public Cal{
	public:
		int add(int a,int b){
			return a+b;
		}
		double avg(int a[],int n){
			double sum=0;
			for(int i=0;i<n;i++){
				sum +=a[i];
			}
			return sum/n;
		}
};*//*
class Cal{
	
	protected:
		int a,b;
		virtual int cal(int a,int b)=0;
	public:
		virtual void run(){
			in();
			cout<<cal(a,b)<<endl;
		}
};
class Add:public Cal{
	int a,b;
	protected:
	int cal
	public:
	void run(){
cout<<"정수 2개 입력"<<endl;
cin>>a>>b;
cout<<a+b<<endl;
	}
}; 
class Sub:public Cal{
	int a,b;
	public:
	void run(){
cout<<"정수 2개 입력"<<endl;
cin>>a>>b;
cout<<a-b<<endl;
	}
};*/
/*
class One{
	char *p;
	public:
		One(char *ch){
			int len = strlen(ch)+1;
			p = new char[len];
			strcpy(p,ch);
		}
		virtual ~One(){
			cout<<"소멸....!"<<endl;
			delete[] p;
		}
};
class Two:public One{
	private:
		char *tp;
	public:
		Two(char *p1,char *p2):One(p1){
			int len = strlen(p2)+1;
			tp = new char[len];
			strcpy(tp,p2);
		}
		~Two(){
			cout<<"소멸...투!"<<endl;
			delete[] tp;
		}
};
*//*
class One{
	public:
		One(){
			cout<<"생성"<<endl;
		}
		void func1(){
			cout<<"one"<<endl;
		}
};
class Two:virtual public One{
	public:
		Two():One(){
			cout<<"생성2"<<endl;
		}
		
		void func2(){
			cout<<"two"<<endl;
		}
};
class Three:virtual public One{
	public:
		Three():One(){
			cout<<"생성3"<<endl;
		}
		
		void func3(){
        func1();
        cout<<"three"<<endl;
        
		}
};
class Four:public Two, public Three{
	public:
		Four():Two(),Three(){
			cout<<"생성5=4"<<endl;
		}
		void func4(){
			func2();
			func3();
			func1();
		}
};
*//*
class One{
	public:

    	void func1(){
    		cout<<"first"<<endl;
		};
		virtual void func(){
			cout<<"func()"<<endl;
		}
		
};
class Two:public One{
	public:
		void func2(){
    		cout<<"투투"<<endl;
		};
		virtual void func(){
			cout<<"func()2"<<endl;
		}
};
class Three:public Two{
	public:
		void func3(){
    		cout<<"써드"<<endl;
		};
		virtual void func(){
			cout<<"func()3"<<endl;
		}
};
*/
/*
class My{
	char *name;
	int age;
	public:
		My(char *n,int age){
			this->age=age;
			int len = strlen(n)+1;
			name = new char[len];
			strcpy(name,n);
			
		}
		
		void show(){
			cout<<name<<' '<<age<<endl;
		}
		~My(){
			delete[] name;
			cout<<"소...멸...1"<<endl;
		}
};
class MyMy:public My{
	char *adr;
	char *phone;
	public:
		MyMy(char *adrr,char *phoner,char *n,int age):My(n,age){
			int len = strlen(adrr)+1;
			adr = new char[len];
			strcpy(adr,adrr);
			
			int len2 = strlen(phoner)+1;
			phone = new char[len2];
			strcpy(phone,phoner);
			
		}
		
		void shows(){
			show();
			cout<<adr<<' '<<phone<<endl;
		}
		~MyMy(){
			delete[]adr;
			delete[]phone;
			cout<<"소멸...!"<<endl;
		}
};*//*
class Rect;
class RectManager{
	public:
		bool equals(Rect r, Rect s);
		void vo(Rect &r,Rect &s);
};

class Rect{
	int a,b;
	public:
		Rect(int a,int b):a(a),b(b){
			
		};
	//friend bool RectManager::equals(Rect r, Rect s);
	friend RectManager;
};
bool RectManager::equals(Rect r, Rect s){
			if(r.a==s.a && r.b==s.b){
		return true;
	}	return false;
		};
void RectManager::vo(Rect &r, Rect &s){
r.a=s.a;
r.b=s.b;	
};*//*
class Po{
	int a,b;
	public:
		Po(){
		};
		Po(int a, int b){
			this->a=a;
			this->b=b;
		};
		
//		Po operator--(int x){
//			Po p(a,b);
//			a--;
//			b--;
//			return p; 
//		}
		Po operator++(int x){
			Po p(a,b);
			a++;
			b++;
			return p; 
		};
		friend Po& operator--(Po &r);
	  friend Po operator--(Po &r,int);
		
		void show(){
			cout<<a<<","<<b<<endl;
		};
};

Po& operator--(Po &r){
	r.a-=1;
	r.b-=1;
	return r;
};
Po operator--(Po &r,int){
Po p(r);
r.a-=1;
r.b-=1;
return p;
	
};*//*
class One{
	int a,b;
	public:
	One(){};
	One(int a,int b){
		this->a=a;
		this->b=b;
	};
	void show(){
		cout<<a<<','<<b<<endl;
	}
};
class Two{
	int a,b;
	public:
		Two& operator=(Two &r){
       	cout<<"two1"<<endl;	
			a=r.a;
         	b=r.b;
		return *this;
};
		Two(){};
	Two(int a,int b){
		this->a=a;
		this->b=b;
	};
		void show(){
		cout<<a<<','<<b<<endl;
	};
	
	
	
	
};*/
class Music{
private:
char *title;
char *num;
int price;	
};
class Concert:public Music{
	private:
		char *key;
};
//뮤직 콘서트 클래스 깊은 복사가 진행되도록 복사 생성자와
//대입연산자를 정의하고 확인 위한 main함수 정의 

int main(int argc, char** argv) {




/*
One one(11,33);
One ocpy;

Two two(44,55);
Two tcpy;

ocpy=one;
tcpy=two;

ocpy.show();
tcpy.show();

One o1,o2;
Two t1,t2;
o1=o2=one;
t1=t2=two;
o1.show();
o2.show();
t1.show();
t2.show();
*/

/*
	Po p(4,6);
	Po cpy;
	
	cpy=p--;
	cpy.show();
	p.show();
	
	cpy=p++;
	cpy.show();
	p.show();
*/	
	
	
	/*
   RectManager rect;
	Rect r(2,1);
	Rect s(1,5);
	rect.vo(s,r);
	
if(rect.equals(r,s)){
	cout<<"ㅁㄴㅇㄹ"<<endl;
}*/
	
	/*
MyMy m("경기","01000000000","이름",10);
m.shows();*/
	/*
Three th;
th.func1();
th.func2();
th.func3();
th.func();
cout<<endl;
Two &tw = th;
tw.func1();
tw.func2();
tw.func();
cout<<endl;
One &on=th;
on.func1();
on.func();

One *o = &th;
o->func();
o->func1();*/

/*
One *op = new Two("aa","bb");
delete op;
*/	
	/*
//추상 클래스 cal상속받는 Add,Sub클래스 
Add add;
Sub sub;

add.run();
sub.run();
*/

	/*
int ary[5]={1,2,3,4,5};
Cal *p = new Calcu();
cout<<p->add(4,6)<<endl;
cout<<p->avg(ary,5)<<endl;
*/


/*
Cal ca;
cout<<ca.cal('+',7,8)<<endl;
cout<<ca.cal('-',5,2)<<endl;
*/



/*
Der d;
De *p=&d;

p->pr();//pr()가 virtual 
p->De::pr();
*/
/*
Der d, *p;
p=&d;
p->pr();

De *pd;
pd=p;
pd->pr();
*/
	return 0;
}
