import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class Question1 extends Thread{
	int i=0,proportion1=0,proportion2=0,proportion3=0,proportion4=0,proportion5=0;
	public Question1(File f) throws FileNotFoundException{
	    try{
	        f = new File("C:\\Users\\asus\\workspace\\MultiThreads\\src\\u.data");
	        Scanner scanner = new Scanner(f);
	        
	    scanner.close();
	    }
	    finally{

	    }		
	}
  public void run(){
		try{
			 FileReader fr = new FileReader("C:\\Users\\asus\\workspace\\MultiThreads\\src\\u.data");
			Scanner scanner = new Scanner(fr);
			
			
			while(scanner.hasNextLine()){
	            final String[] columns =scanner.nextLine().split("\t");
	           
	           if(columns[2].equals("1"))
	        	   proportion1++;
	           if(columns[2].equals("2"))
	        	   proportion2++;
	           if(columns[2].equals("3"))
	        	   proportion3++;
	           if(columns[2].equals("4"))
	        	   proportion4++;
	           if(columns[2].equals("5"))
	        	   proportion5++;
	           
	           i++;       
			}
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	    finally{
			System.out.println(proportion1);
			System.out.println(proportion2);
			System.out.println(proportion3);
			System.out.println(proportion4);
			System.out.println(proportion5);
	    }
  }       
}