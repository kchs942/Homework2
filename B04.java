import java.util.*;

class B04{
         int kor;
	 int eng;
	 int math;
          void input() {
	  Scanner s=new Scanner(System.in);
	      
	   System.out.println("국어점수를 입력하세요");
	           this.kor=s.nextInt();
		   System.out.println("영어점수를 입력하세요");
	        this.eng=s.nextInt();
		 System.out.println("수학점수를 입력하세요");
		     this.math=s.nextInt();
		      
		     print();
	       }   
	       
	    void print(){
	           int total=this.kor+this.eng+this.math;
		   System.out.println("총점은"+total);
		   int age=total/3;
		   System.out.println("평균은"+age);
	           if(this.kor>90)
		   System.out.println("국어점수가 우수합니다");
		    if(this.eng>90)
		      System.out.println("영어점수가 우수합니다");
                      if(this.math>90)
		    System.out.println("수학점수가 우수합니다");
	   }

          public static void main(String[] args){
		        new B04().input();

}


}
