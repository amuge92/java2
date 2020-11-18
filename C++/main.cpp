#include <iostream>

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

int main(void) {
/*int n1 = 10;
int &n2 = n1;//참조 연산자 = 별명 n1=n2=10;
n2=20;//n1도 20으로 바뀐다.
cout<<n1<<' '<< n2<<endl; 
cout<<&n1<<' '<< n2; 
*/

int n1 = 1;
int& n2 = Ref(n1);//함수호출 -> 반환형은 참조형 
n1++;
n2++;
cout<<n1<<endl;
cout<<n2<<endl;




/*Oval a,b(3,4);
    a.set(10, 20);
    a.show();
    cout << b.getWidth() << "," << b.getHeight() << endl;
*/	
}
