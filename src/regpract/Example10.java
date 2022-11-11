package regpract;
//use of static keyword
public class Example10 {
	int count=0;
	Example10(){
	count++;// incrementing value of count 
		System.out.println(count);
	}
	public static void main(String[]args) {
		Example10 errr=new Example10();
		Example10 err1=new Example10();
		Example10 err2= new Example10();
		
	}

}
// in this example we are using instance variable or global variable.the instance variable gets the memory at the time of object creation 
//so in above example i created instance variable name count and give it a value 0 and then increment it in constructor. so
// at the time on line 10 when i create 1st object and calls constructor that time that variable gets its memory then operation performed and 
// and we get output 1 right. but at the time of 2nd object creation we get the copy of that instance variable cause instance variable gets 
//the memory at the time of object creation, so each object will have the copy of the instance variable.
// thats why value of count value is not gonna increment 
// the we use static variable ;-- Example 11