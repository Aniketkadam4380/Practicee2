package regpract;
//A static method belongs to the class rather than the object of a class.
//A static method can be invoked without the need for creating an instance of a class.
//A static method can access static data member and can change the value of it.
class Exaaa{
	int rollno;
	String name;
	static String clg="JIT";
	Exaaa(int i,String n){
		rollno=i;
		name=n;
	}
	void ddissp() {
		System.out.println(rollno+" "+name+" "+clg );
	}
  static void change() {
	   clg="MIT";
  }
	
}
public class Example13 {
	public static void main(String[]args) {
		Exaaa ea1=new Exaaa(123,"Adf");//upto this line i.e 24 if we execute the prog. the we not gonna get output not even 0 and null cause here 
		Exaaa ea2=new Exaaa(234,"bdf");//we created object then it invoke the constructor implicitly  but in constructor we don't have any print
		Exaaa.change();//this line will change the name of clg cause line 3 of rule. and if we comment it off then name will be same as static name
		               //i.e JIT 
		ea1.ddissp();
		ea2.ddissp();//here we calling method ddissp then it will perform the operations init
	}                  

}
//There are two main restrictions for the static method. They are
//The static method can not use non static data member or call non-static method directly.
//this and super cannot be used in static context
