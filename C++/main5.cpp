#include <iostream>
#include <cstring>
#include<cstdlib>
#include<ctime>
using namespace std;

class Game{

public:
	virtual void move()=0;
    virtual int getX()=0;
virtual int getY()=0;

};
class hum:public Game{
	int a,b;
	char m;
	public:
		hum(int a,int b){
			this->a=a;
			this->b=b;
		};
		void move(){
			cout<<"�̵��� ���� ����"<<endl;
			cout<<"'a'=���� , 's'=�Ʒ� , 'd'=������ , 'w'=����"<<endl;
			cin>>m;
			switch(m){
				case 'a' :
					a=a-1;
					if(a<0){
						a=0;
						cout<<"���� ���Դϴ�."<<endl;
					}
					break;
				case 's' :
					b=b+1;
					if(b>5){
						b=5;
						cout<<"���� ���Դϴ�."<<endl;
					}
					break;
				case 'd' :
					a=a+1;
					if(a>5){
						a=5;
						cout<<"���� ���Դϴ�."<<endl;
					}
					break;
				case 'w' :
					b=b-1;
					if(b<0){
						b=0;
						cout<<"���� ���Դϴ�."<<endl;
					}
					break;
			}
			cout<<"����� ��ġ�� "<<a<<','<<b<<"�Դϴ�"<<endl;
		};
		int getX(){
		return a;
		};
		int getY(){
		return b;
		};
};
class mon:public Game{
	int a,b;
	public:
		mon(int a,int b){
			this->a=a;
			this->b=b;
		};
		void move(){
			while(true){
			
			int x = rand()%4-2;
			int y = rand()%4-2;
			if((x+y)==2||(x+y)==-2||(x+y)==0&&(x!=0&&y!=0)&&(x!=2||y!=-2)&&(x!=-2||y!=2)){
			a=a+x;
			b=b+y;
		
			if(a>5){
			a=5;	

			if(a<0){
			a=0	;
			};
			if(b>5){
			b=5;	
			};
			if(b<0){
			b=0	;
			
			};
			break;
			};};
			cout<<"������ ��ġ�� "<<a<<","<<b<<"�Դϴ�."<<endl;
		};
		int getX(){
		return a;
		};
		int getY(){
		return b;
		};
};
class food:public Game{
	int a,b;
	
	public:
		food(int a,int b){
			this->a=a;
			this->b=b;
		cout<<"������ ��ġ�� ����"<<a<<','<<b<<"�Դϴ�."<<endl; 
		};
		void move(){
			
		};
		int getX(){
		return a;
		};
		int getY(){
		return b;
		};
};

int main(int argc, char** argv) {
	srand((unsigned)time(0));
int ranx = rand()%5;
int rany = rand()%5;
		int cnt;
	hum h(0,0);
	mon m(5,5);
	food f(ranx,rany);
	while(true){
	
	h.move();
	m.move();
	if(h.getX()==f.getX()&&h.getY()==f.getY()){
		cout<<"�ΰ��� �¸��Ͽ����ϴ�."<<endl;
	break;
	};
	if(m.getX()==f.getX()&&m.getY()==f.getY()){
		cout<<"�ΰ��� �й��Ͽ����ϴ�."<<endl;
	break;
	};
	if(h.getX()==m.getX()&&h.getY()==m.getY()){
		cout<<"�ΰ��� �й��Ͽ����ϴ�."<<endl;
	break;
	};
	cout<<endl;
	};
	
	
	return 0;
}
