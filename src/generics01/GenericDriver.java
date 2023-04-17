package generics01;

public class GenericDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Generic<Integer> intObj = new Generic<>(5);
	    System.out.println("Generic Class returns the value: " + intObj.getData());

	    
	    Generic<String> strObj = new Generic<>("This is example for Generics");
	    System.out.println("Generic Class returns the string: " + strObj.getData());

	}

}
