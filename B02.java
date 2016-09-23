import java.util.*;

class B02{
          String kind;
	  double in_degree;
          void input() {
	  Scanner s=new Scanner(System.in);
	      
	   System.out.print("온도를 입력하세요");
	           
		   this.in_degree=s.nextDouble();
	          System.out.println("섭씨온도 이면c,화씨온도이면f");
		  this.kind=s.next();
	        print();
	       }   
	       
	    void print(){
	           if(this.kind.equals("c")){
                   double out_degree=(this.in_degree*1.8)+32;
		   System.out.println("변환된 온도는"+out_degree);
		   }
		   if(this.kind.equals("f")){
		   double out_degree=(this.in_degree-32)/1.8;
		    System.out.println("변환된 온도는"+out_degree);
		    }
	   }

          public static void main(String args[]){
		        new B02().input();

}


}
