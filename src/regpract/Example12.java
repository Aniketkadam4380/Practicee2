package regpract;

class Example111{
	int rollno;//instance variable  
	   String name;  
	   static String college ="IIS";//static variable  
	   //constructor  
	   Example111(int r, String n){  
	   rollno = r;  
	   name = n;  
	   }  
	   //method to display the values  
	   void display (){System.out.println(rollno+" "+name+" "+college);}  
	}  
	//Test class to show the values of objects  
	public class Example12{  
	 public static void main(String args[]){ 
	 Example111 s1 = new Example111(161,"Kakdahdfhajf");  
	 Example111 s2 = new Example111(282,"fsfsfs");  
	 s1.display();  
	 s2.display(); 
}
}
// All students have its unique roll-no and name, so instance data member is good in such case.
//Here, "college" refers to the common property of all objects. If we make it static, this field will get the memory only once.
//we can change static variable in static method 

