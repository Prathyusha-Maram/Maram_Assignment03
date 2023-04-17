package override04;

public class Child {

	public static void staticMethod() {
        System.out.println("This is the child static method.");
    }

    // Attempt to override superclass private method
    private void privateMethod() {
        System.out.println("This is the child private method.");
    }
	
}
