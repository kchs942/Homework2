import java.util.*;

class B03{
         int days;
          void input() {
	  Scanner s=new Scanner(System.in);
	      
	   System.out.print("날수를 입력하시오");
	           days=s.nextInt();
	          
	       print();
	       }   
	       
	    void print(){
	          int seconds=this.days*24*60*60;
         System.out.println("날수에 해당되는 기간은"+seconds+"초입니다");
		   int m_count=0;
		 for(int i=1000000;i<=seconds;i=i+1000000)
		   m_count=m_count+1;
		  System.out.println("100만초가 모두"+m_count+"번포함됩니다");
            
	   }

          public static void main(String[] args){
		        new B03().input();

}


}
