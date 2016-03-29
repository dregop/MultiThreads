import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class Question3 extends Thread{
	int i=0,proportion1=0,proportion2=0,proportion3=0,proportion4=0,proportion5=0;
	public Question3(File f) throws FileNotFoundException{
	    try{
	        f = new File("C:\\Users\\asus\\workspace\\MultiThreads\\src\\u.data");
	        Scanner scanner = new Scanner(f);
	        
	    scanner.close();
	    }
	    finally{

	    }		
	}
	public void maxTableau(int tableau[]){
		int max=0,user=0;
		for(int i=0;i<100;i++){
			if(tableau[i]>max){
				max=tableau[i];
			    user= i;}
		}
		System.out.println(user);

	}
  public void run(){
		try{
			 FileReader fr = new FileReader("C:\\Users\\asus\\workspace\\MultiThreads\\src\\u.data");
			
			int i,b=0;
			int[] taille= new int[1500];
			
		
			
			String a=null, line;
		
		
			  BufferedReader buff=new BufferedReader(fr);
			while((line=buff.readLine())!=null){
				  for(i=1;i<1500;i++){
				a="" + i;
	            if(line.split("\t")[1].equals(a))
	            {  
	            	taille[i]=taille[i]+1;
	            	
	            }
	      	
		}   
			}
			
			maxTableau(taille);
			
			
		}catch(IOException e){
			System.out.println(e.getMessage());
			
		}
  }       
}