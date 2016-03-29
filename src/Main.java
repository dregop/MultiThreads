import java.io.*;


public class Main {
	
	static File f;
	
	  public static void main(String[] args) throws IOException {
		  
		    Question1 q1 = new Question1(f);
		    Question2 q2 = new Question2(f);
		    Question3 q3 = new Question3(f);
		    q1.start();
		    q2.start();
		    q3.start();
		  }

}
