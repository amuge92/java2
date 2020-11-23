#include <iostream>
#include <cstring>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;
//--------------------------------------------------------------------/

/*namespace me{
using namespace std;
class AA{
	public:
		void operator<<(char *p){
			printf("%s",p);
		};
		
		void operator<<(int n){
			printf("%d",n);
		};
		void operator<<(AA& (*fp)(AA &a)){
		fp(*this);	
		};
};
AA& endl(AA &a){
	a<<"\n" ;
	fflush(stdout);//버퍼 비우는 함수. 
	return a;
};
AA cout;

};

*/

//--------------------------------------------------------------------------
/*
class Music{
	
	char* title;
	char* num;
	int price;
	public:
		Music(char *title, char* num, int pr):price(pr){
		this->title= new char[strlen(title)+1];
		this->num= new char[strlen(num)+1];
		strcpy(this->title,title);
		strcpy(this->num,num);
		};
		
		Music(Music& mu):price(mu.price){
		this->title=new char[strlen(mu.title)+1];
		this->num=new char[strlen(mu.num)+1];
		strcpy(this->title,mu.title);
		strcpy(this->num,mu.num);
		};
		
		Music& operator=(Music& mu){
		    title= new char[strlen(title)+1];
		    num= new char[strlen(num)+1];
		    strcpy(this->title,mu.title);
		    strcpy(this->num,mu.num);
		price=mu.price;
		};
		
		void show(){
		cout<<title<<' '<<num<<' '<<price<<endl;	
		};
		~Music(){
			delete[] title;
			delete[] num;
		}
};

class Concert:public Music{
	private:
		char *key;
	public:
		Concert(char *title, char *num, int pr, char *ke):Music(title,num,pr){
			
			key = new char[strlen(ke)+1];
			strcpy(key,ke);
			
		};
		Concert(Concert& c):Music(c){
			key = new char[strlen(c.key)+1];
			strcpy(key,c.key);
			
		};
		Concert& operator=(Concert &c){
		    Music::operator=(c);
			key = new char[strlen(c.key)+1];	
			strcpy(key,c.key);
		};
		void shows(){
		show();	
		cout<<key<<"콘서트"<<endl;
		};
		~Concert(){
			delete[] key;
			cout<<"소멸"<<endl;
		}
		
};
*/
/*
class Two{
	public:
	void one(){
		cout<<"one22"<<endl;
	};
	void two(){
		cout<<"two22"<<endl;
	};
	virtual void th(){
		cout<<"th22"<<endl;
	};
};

class Three:public Two{
	public:
	void one(){
		cout<<"one"<<endl;
	};
	void two(){
		cout<<"two"<<endl;
	};
	virtual void th(){
		cout<<"th"<<endl;
	};
};
*/
/*
class Point{
   private:
      int xx,yy;
   public:
      Point(int x=0,int y=0):xx(x),yy(y){}
      void show() {
         cout<<xx<<' '<<yy<<endl;
      }
      friend ostream& operator<<(ostream& os, Point& po);
      friend istream& operator>>(istream& is, Point& po);
};
ostream& operator<<(ostream& os, Point& po){
   os<<po.xx<<' '<<po.yy<<endl;
   return os;
}
istream& operator>>(istream& is, Point& po){
    is>>po.xx>>po.yy;
	fflush;
    return is;
}*/
/*
class String{
   private:
      int len;
      char *p;
   public:
      String(){
         len=0;
         p=NULL;
      }
      String(const char* ch){
         len=strlen(ch)+1;
         p=new char[len];
         strcpy(p,ch);
      }
      String(const String& s){
         len=s.len;
         p=new char[len];
         strcpy(p,s.p);
      }
      ~String(){
         if(p!=NULL){
            delete[]p;
         }
      }
      String& operator=(const String& s){
         len=s.len;
         p=new char[len];
         strcpy(p,s.p);
         return *this;
      }
      String& operator+=(const String& s){
         len+=(s.len-1);
         char *ch=new char[len];
         strcpy(ch,p); 
         strcat(ch,s.p); //연결
         
         p=ch;
         return *this; 
      }
      bool operator==(const String& s){
         return strcmp(p,s.p)?false:true;
      }
      
      String operator+(const String& s){
         char *ch=new char[len+s.len-1];
         strcpy(ch,p);
         strcat(ch,s.p);
         
         String temp(ch); 
         //String temp=ch;
         return temp;
      }
      
      friend ostream& operator<<(ostream& os, const String& s);
      friend istream& operator>>(istream& is, String& s);
            
};

ostream& operator<<(ostream& os, const String& s){
         os<<s.p;
         return os;
      }
      istream& operator>>(istream& is, String& s){
         char ary[30];
         is>>ary;
         s=String(ary);
         return is;
      }
*//*
template<typename T>
T add(T a,T b){
	T tt= a+b;
	return tt;
};

template<typename T>
void swapa(T &a,T &b){
T t=a;
a=b;
b=t;
};

class Point {
int a,b;
public:
Point (int a,int b){
	this->a=a;
	this->b=b;
};
void show(){
	cout<<a<<' '<<b<<endl;
};
};*//*
template<typename T>
T add(T a[],int b){
	T sum;
	for(int i=0;i<b;i++){
	sum +=a[i];	
	};
	return sum/b;
};
*//*

template<typename T>
class Point{
	private:
	T xx;
	T yy;
	public:
		Point(T x=0,T y=0):xx(x),yy(y){
			
		};
		void show(){
			cout<<xx<<' '<<yy<<endl;
		}
};

template<typename T>
class Simple{
	T a;
	public:
		Simple(T a){
			this->a=a;
		};
		void show(){
		cout<<a<<endl;	
		};
};

template<typename T>
class Sim{
	T *a;
	public:
		Sim(T *p){
			int len = strlen(p)+1;
		a = new char[len];
		strcpy(a,p);	
		};
		void show(){
		cout<<a<<endl;	
		};
		~Sim(){
		delete a;
		}
};

template<>
class Sim<Point <int> >{
	private:
		Point<int> po;
	public:
		Sim(int x, int y):po(x,y){
		};
		void shows(){
		po.show();	
		};
};
*/
/*
template<typename T1, typename T2>
class Simple {
	public:
		void show(){
			cout<<"template"<<endl;
		};
};

template<>
class Simple<int,double> {
	public:
		void show(){
			cout<<"template11"<<endl;
		};
};

template<typename T1>
class Simple<T1,double> {
	public:
		void show(){
			cout<<"template222"<<endl;
		};
};


*//*

template<typename T1,int size>
class Simple{
	private:
		T1 arr[size];
	public:
	
	T1& operator[](int index){
		return arr[index];	
	};
	Simple<T1,size>& operator=(Simple<T1,size>& r){
		for(int i=0;i<size;i++){
			arr[i]=r.arr[i];
		};
		return *this;
	}

};*/
/*
class Ar{
	int *arr;
	int len;
	public:
		Ar(int l):len(l){
			arr = new int[l];
		};
		int& operator[] (int idx){
			if(idx<0||idx>=len){
				cout<<"error"<<endl;
			}else
			return arr[idx];
		}
};
*/

class Number{
	int num;
	public:
		Number(){
			cout<<"Number"<<endl;
		}
		Number& operator=(int a){
			cout<<"Number"<<endl;
			num=a;
			return *this;
		};
		Number& operator+(int a){
			cout<<"Number"<<endl;
			num=num+a;
			return *this;
		};
		void show(){
			cout<<num<<endl;
		}
};

int main(int argc, char** argv) {

Number n1;
n1=40;


Number n2=n1+30;
n2.show();




/*
Ar arr(5);
for(int i=0;i<5;i++){
	arr[i]=(i+1);
cout<<arr[i]<<endl;
}

for(int i=0;i<6;i++){
	arr[i]=(i+1);
	cout<<arr[i]<<endl;
}*/

/*
Simple<int,5> ary1;
for(int i=0;i<5;i++){
	ary1[i]=i;
};
Simple<int,6> ary2;
for(int i=0;i<6;i++){
	ary2[i]=i;
};

Simple<int,6> ary3;
for(int i=0;i<6;i++){
	ary3[i]=i;
};

Simple<int,6> ary4;
ary4=ary3;
for(int i=0;i<6;i++){
	cout<<ary4[i]<<endl;
};


*/




/*
Simple<char, double> sim1;
sim1.show();

Simple<int,double> sim2;
sim2.show();


*/
/*
Simple<int> sim1(100);
sim1.show();

Sim<char> sim2("hi");
sim2.show();

Sim<Point <int> > sim3(3,6);
sim3.shows();

*/

/*
int ary1[]={1,2,3};
cout<<add(ary1,sizeof(ary1)/sizeof(int))<<endl;

double ary2[]={1.4,2.3,3.1};
cout<<add(ary2,sizeof(ary2)/sizeof(double))<<endl;
*/





/*
cout<<add<int>(4,7)<<endl;
cout<<add<double>(4.4,7.6)<<endl;
Point p1(4,6);
Point p2(10,60);

swapa(p1, p2);
p1.show();
p2.show();
*/



	/*
String a="c++";
   cout<<a<<endl;

String b = "java";
String c=a+b;   

   cout<<c<<endl;
   a+=b;
   cout<<a<<endl;
if(a==c){
	cout<<"같다"<<endl;
}   
String d;
cin>>d;
cout<<d<<endl;
   */
   
   /*
   Point p1;
   cout<<p1;
   cout<<"x,y입력";
   cin>>p1;
   cout<<p1;
   
   Point p2;
   cout<<"x,y입력";
   cin>>p2;
   cout<<p2;
*/

	
	/*
using me::cout;
using me::endl;

cout<<"안녕";
cout<<endl;

cout<<100;
endl(cout);
*/
/*
Three th;
th.one();
th.two();
th.th();

Two &tw=th;
tw.one();
tw.two();
tw.th();
*/




/*
Concert c1("aa","bb",11111,"cc");
Concert c2= c1;
Concert c3(c1);
c2.shows();
c3.shows();

Concert c4("dd","ee",3333,"ff");
c4=c3;
c4.shows();

*/	
	return 0;
}
