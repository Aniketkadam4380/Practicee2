package regpract;
//Constructor example 
public class Example8 {
	int i=10;
	String n="Sagd";
	Example8(int id,String name){
		System.out.println(id+" "+name);
	}
	Example8(){
		int empid=i;
		String empname=n;
		System.out.println(empid+" "+empname);
	}
	public static void main(String[]args) {
		System.out.println("Default or parameterless constructor");
		Example8 e=new Example8();
		System.out.println("Parametrized Constructor");
		Example8 ew=new Example8(20,"aniket");
		
	}

}
// here in main program starts then it prints 1st line after that when we create object off class at the time implicitly constructor initiate the
// object.and because we didn't pass any arguments so control goes directly to the default constructor and perform operation inside it 
// after that control goes to main line 17 then it print that  at  line 18 because we pass arguments control goes to parameterized constructor.so on