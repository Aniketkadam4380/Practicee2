package regpract;
//parameterized Constructor
//The parameterized constructor is used to provide different values to distinct objects. However, you can provide the same values also
public class Example7 {
 int id;
 String name;
 Example7(int i,String n){
	id=i;
    name=n;
	 
 }
 void display() {
	 System.out.println(id+ "  " +name);
 }
 public static void main (String[]args) {
	 Example7 eg1=new Example7(111,"Aniket");
	 Example7 eg2=new Example7(222,"tekina");
	 eg1.display();
	 eg2.display();
 }
}
// here when we create the object in main at that time we invoke the constructor implicitly 
// in method we need to create the object and after that we need to call that object with param
// but in constructor when we create object at that  java calls constructor 