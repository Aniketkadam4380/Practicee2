package regpract;
//copy constructor 
public class Example9 {
	int id;
	String name;
	Example9(int i,String n){
		id=i;
		name=n;
		
	}
	Example9(Example9 s){
		id=s.id;
		name=s.name;
		
	}
	void dissp() {
		System.out.println(id+" "+name);
	}
	public static void main(String[]args) {
		Example9 ee=new Example9(20,"Sddf");
		Example9 er=new Example9(ee);
		ee.dissp();
		er.dissp();
		
	}

}
// here in this example we are copying the content of one constructor to another constructor 
