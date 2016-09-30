import java.util.*;

class A06{
         int kor;
	 int eng;
	 int math;
	 String name;
          void input() {
	  Scanner s=new Scanner(System.in);
	    
             System.out.println("이름 :");
	     this.name=s.next();
	    
	     System.out.println("국어점수를 입력하세요");
	           this.kor=s.nextInt();
	
	     System.out.println("영어점수를 입력하세요");
	        this.eng=s.nextInt();
	
	      System.out.println("수학점수를 입력하세요");
		     this.math=s.nextInt();
		      
		     print();
	       }   
	       
	    void print(){
	            System.out.println("["+this.name+"]님은");
		 
		   double total=this.kor+this.eng+this.math;
		    double avg=total/3;
		   System.out.println("평균은"+avg);
	           if(avg>=95&&avg<=100)
		   System.out.println("학점은 A+입니다.");
		    else if(avg>=90&&avg<95)
		      System.out.println("학점은 A입니다");
                     else if(avg>=85&&avg<90)
		    System.out.println("학점은 B+입니다");
		      else if(avg>=80&&avg<85)
		     System.out.println("학점은 B입니다");
		      else if(avg>=75&&avg<80)
		       System.out.println("학점은 C+입니다");
		        else if(avg>=70&&avg<75)
		      System.out.println("학점은 C입니다");
		       else if(avg>=65&&avg<70)
			System.out.println("학점은 D+입니다");
			 else if(avg>=60&&avg<65)
		         System.out.println("학점은 D입니다");
			 
			 else System.out.println("학점은 F입니다");





	   }

          public static void main(String[] args){
		        new A06().input();

}


}
