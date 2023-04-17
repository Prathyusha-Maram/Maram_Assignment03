package bufferstring06;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String str = "Welcome"; 
		str.concat(" World");
		System.out.println(str); 

		StringBuffer strBuf = new StringBuffer("Welcome"); 
		strBuf.append(" World");
		System.out.println(strBuf); 
		
	}

}
