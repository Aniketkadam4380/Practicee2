package regpract;
//Static keyword 
public class Example11 {
	static int count=0;
	Example11(){
		count++;//incrementing the value of count 
		System.out.println(count);
		
	}
	public static void main (String[]args) {
		Example11 ex1=new Example11();
		Example11 ex2=new Example11();
		Example11 ex3=new Example11();
	}

}
//static variable will get the memory only once, if any object changes the value of the static variable, it will retain its value.