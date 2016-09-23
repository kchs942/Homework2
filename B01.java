import java.util.*;

class B01{
         int age;
        void input(){
	   Scanner s=new Scanner(System.in);
	   System.out.print("태어난 년도를 입력하시오");
	   int birth=s.nextInt();
           this.age=2014-birth+1;
	  print();
	}

	void print(){
	   if(age<20)
	   System.out.println("미성년자 입니다");
	   else System.out.println("미성년자가 아닙니다");
	
	}
           public static void main(String[] args){
	   
	   new B01().input();  
	   
	   }
}
