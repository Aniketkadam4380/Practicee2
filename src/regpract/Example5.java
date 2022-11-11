package regpract;
// constructor in java:- default constructor 
public class Example5 {
	Example5(){
		System.out.println("Default Constructor");
	}
public static void main (String[]args) {
	Example5 ex=new Example5();
	
	
}
}
//It is a special type of method which is used to initialize the object
//
// default constructor or parameter less constructor is the constructor where we do not give or pass any parameter 
//Every time an object is created using the new() keyword, at least one constructor is called.
//It calls a default constructor if there is no constructor available in the class.
//In such case, Java compiler provides a default constructor by default
//The default constructor is used to provide the default values to the object like 0, null, etc., depending on the type. ex6