package abstraction;

public class  Abstraction1 extends AbstractionExample {
	

public static void main (String args[]) {
	
	Abstraction1 o=new Abstraction1();
	o.addnumb();
	o.method();
	
}
	

	@Override
	public void addnumb() {
System.out.println("abstract methods");		
	}

}
