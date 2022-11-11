package regpract;
//here the example of default constructor 


public class Example6 {
	int id;
	String name;
	void disp() {
		System.out.println(id+" "+name);
	}
	public static void main (String[]args) {
		Example6 exx=new Example6();
		Example6 esx=new Example6();
		exx.disp();
		esx.disp();
		
		
	}

}
//In the above class,you are not creating any constructor so compiler provides you a default constructor. 
//Here output  0 and null values are provided by default constructor.
