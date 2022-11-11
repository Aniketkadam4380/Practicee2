package regpract;
//Example of method overloading with Type promotion 
class Addrr{
	public void sub(int a,long  b) {
		System.out.println((a+b));
		
	}
	public void sub(int a,int b,int c) {
		System.out.println((a+b+c));
	}
}
public class Example3 {
	public static void  main (String[]args) {
		Addrr adr=new Addrr();
		adr.sub(10, 25);
		adr.sub(10,25,36);
	}

}
