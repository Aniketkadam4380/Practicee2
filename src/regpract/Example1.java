package regpract;
//method overloading by changing no of arguments 
class Add {
	public int sum(int a,int b) {
		return (a+b);
	}
	public int sum(int a,int b,int c) {
		return (a+b+c);
	}
	
}
public class Example1 {
	public static void main (String[]args) {
		Add ad=new Add();
		System.out.println("Addition of two numbers:-"+ad.sum(10,56));
		System.out.println("Addition of three numbers:-"+ad.sum(69,58,98));
	}
	

}
//If a class has multiple methods with same name but different parameters it is known as method overloading 
// if we have to perform only one operation having same method name increases the readability of the program
// here we performed method overloading by changing no of arguments 