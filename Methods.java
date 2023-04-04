package Day9Assignment;

public class Methods {
 void cube(int x)
 {
	 System.out.println("Cube:"+x*x*x);	 
 }
 void square(int b) 
 { 
	 System.out.println("Square :"+(b*b));
 }
 void greater(int a,int b,int c)
 {
	 int x= a>b ? (a>c ? a:c) : (b>c ? b:c);
	 System.out.println("Greater is:"+x);
 }
	public static void main(String[] args) {
	  int a=3;
	  int b=3;
	  int c=5;
	  Methods T=new Methods();
	  T.cube(a);
	  T.square(b);
	  T.greater(a, b, c);
	  
	  
	  
	  
		 

	
	
	
	}

}
