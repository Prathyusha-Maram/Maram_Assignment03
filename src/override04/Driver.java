package override04;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Parent.staticMethod();  

        
        Child.staticMethod();   

        
        Child subclass = new Child();
        //subclass.privateMethod();		//results in compilation error
		
	}

}
