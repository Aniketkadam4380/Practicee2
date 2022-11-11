package regpract;

public class Example4 {
	 void sum(int a,long b){System.out.println("a method invoked");}  
	  void sum(long a,int b){System.out.println("b method invoked");}  
	  
	  public static void main(String args[]){  
	  Example4 obj=new Example4();  
	//  obj.sum(20,20);// ambiguity 
}
	  }
//If there are no matching type arguments in the method, and each method promotes similar number of arguments, there will be ambiguity