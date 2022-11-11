package regpract;
// method overloading by changing the type of argument 
class Addr{
	public  int summ(int a,int b) {
		return(a+b);
	}
	public double summ(double a,double b) {
		return (a+b);
	}
}
public class Example2 {
	public static void main(String[]args) {
		Addr a=new Addr();
		System.out.println("Addition of two numbers:-"+a.summ(11,25));
		System.out.println("Addition of two numbers:-"+a.summ(25.5, 58.8));
	}

}
// here we perform method overloading by changing the type of argument 
// when we pass integer as input the control goes to first method where parameters are integer same for double 