#include <iostream>
#include <cstring>
/* run this program using the console pauser or add your own getch, system("pause") or input loop */

using namespace std;

/*class Oval{
	private:
		int width,height;
	public:
		Oval(){
			
			
		}
		Oval(int a, int b){
			width=a;
			height=b;
		}
		int getWidth(){
			return width;
		}
		int getHeight(){
			return height;
		}
		void set(int a,int b){
			width=a;
			height=b;		
		}
		void show(){
			cout<<width<<' '<<height<<endl;
		}
		~Oval(){
			cout<<width<<' '<<height<<endl;
		}
			
};*/
/*
int& Ref(int &r){
	r++;
	return r;
} */
/*
class Print{
	private:
		char str[30];
	public:
		void set(char *p){
			strcpy(str,p);
		}
		void show(){
			cout<<str<<endl;
		}
};
*/
/*
class Person{
	private:
		char *p;
	    int age;
	public:
		Person(char *per,int a){
			int len = strlen(per)+1;
			p=new char[len];
			strcpy(p,per);
			p=per;
			age=a;
		}
		void show(){
			cout<<p<<' '<<endl;
		}
		~Person(){
			delete []p;
			cout<<"소멸됨"<<endl;
		}
};
*/
/*
class AA{
	private:
	int num;
	public:
		AA():num(0){}//멤버 이니셜라이저
		AA& create(int n){
			AA *p = new AA(n);
			return *p;
		} 
		show(){
			cout<<num<<endl;
		}
		~AA(){
			
		}
		private:
			AA(int n):num(n){}
};*/
/*
class Person{
	private:
		char *p;
		int age;
	public:
	    void set(char *pp, int agep){
	    	p=pp;
	    	age=agep;
		}
		void show(){
			cout<<p<<' '<<age<<endl;
		}
};*/

/*class AA{
	private:
		int n;
	public:
		AA(int num):n(num){
		cout<<num<<' '<<this<<endl;
		}
		void show(){
			cout<<n<<endl;
		}
		AA* get(){
		return this;//객체 포이터를 반환해라. 
		}
};*//*
class Simple{
	int n1;
	int n2;
	public:
		Simple(int num1,int num2):n1(num1),n2(num2){}
		Simple(Simple &s){
			n1 = s.n1;
			n2 = s.n2;
		cout<<"생성"<<endl;
		}
		
		void show(){
			cout<<n1<<' '<<n2<<endl;
		}
};*/

class Person {
   private:
      char *name;
      int age;
   public:
      Person(char *p, int a) {
         int len=strlen(p)+1;
         name=new char[len];
         strcpy(name,p);
         age=a;
      } 
      void pr() {
         cout<<name<<' '<<age<<endl;
      }
      ~Person() {
         delete []name;
         cout<<"소멸";
      }
};

int main(int argc, char** argv) {
   
   Person p1("길동",30);
   Person p2=p1;
   
   p1.pr();
   p2.pr();  
   
   return 0;
}






/*
Simple sim1(10,20);
Simple sim2 = sim1;
sim2.show();
*/




//	AA a1(100);
//	AA *p = a1.get();
//	cout<<p;
//	p->show();//p를 가르키는 객체 함수 호출 
//a1.show();
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	/*
	Person ary[3];//객체배열
	char name[30];
	char *p;
	int age,len;
	
	for(int i =0 ; i<3;i++){
		cout<<"이름 : ";
	    cin>>name;
		cout<<"나이 : ";
		cin>>age;
		len = strlen(name)+1;
		p=new char[len];
		strcpy(p,name) ;
		ary[i].set(p,age);
		ary[i].show();
	} 
	*/
	
	
	
	
	
	/*
AA a;
a.show();

AA &a1 = a.create(10);
a1.show();

AA &a2 = a.create(20);
a2.show();

delete &a1;
delete &a2;
*//*
Person p1("lee",29);
Person p2("홍길동",40);
p1.show();
p2.show();
 */









/*
Print pr;
pr.set("hello");
pr.show();

pr.set("set");
pr.show();
*/







/*int n1 = 10;
int &n2 = n1;//참조 연산자 = 별명 n1=n2=10;
n2=20;//n1도 20으로 바뀐다.
cout<<n1<<' '<< n2<<endl; 
cout<<&n1<<' '<< n2; 
*/
/*
int n1 = 1;
int& n2 = Ref(n1);//함수호출 -> 반환형은 참조형 
n1++;
n2++;
cout<<n1<<endl;
cout<<n2<<endl;
*/



/*Oval a,b(3,4);
    a.set(10, 20);
    a.show();
    cout << b.getWidth() << "," << b.getHeight() << endl;
*/	

