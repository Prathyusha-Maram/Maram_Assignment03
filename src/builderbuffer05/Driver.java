package builderbuffer05;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StringBuffer buffer = new StringBuffer("Welcome");
        StringBuilder builder = new StringBuilder("World");

        buffer.append("!");
        builder.append("!");

        System.out.println(buffer.toString());    
        System.out.println(builder.toString());   

        buffer.reverse();
        builder.reverse();

        System.out.println(buffer.toString());    
        System.out.println(builder.toString());   
		
	}

}
