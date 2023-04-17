package question12;

public class Driver {
	public void finalize() throws Throwable{
	      System.out.println("Object gc");
	   }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final int value = 20;
		System.out.println(value);
		try{
	         int a = 50;
	         int b = 5;
	         int result = a/b;
	      }catch(Exception e){
	         System.out.println("Error : "+ e.getMessage());
	      }
	      finally{
	         System.out.println("Done.");
	      }
		Driver dr = new Driver();
	      dr = null;
	      System.gc();

	}

}
