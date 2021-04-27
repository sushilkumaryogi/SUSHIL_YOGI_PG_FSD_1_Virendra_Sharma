package sushil_pg_fsd_1;

import java.io.File;
import java.io.IOException;

public class AddingFile0201 {

	public static void main(String args[]) {
		   try {  
	            File file = new File("E:\\JAVA project vi\\project//login.txt");  // this is used to create the file
	            
	            if (file.createNewFile()) {  
	                System.out.println("New File is created!");  
	            } else {                   
	                if(file.exists())
	                {
	                    System.out.println("File already exists.");	
	                    System.out.println("File path:" + file.getAbsolutePath());
	                    System.out.println("File name:  " + file.getName());               
	                }
	                //--------------Delete the file code below-------------//
	                boolean b = file.delete();
	                if(b==true)
	                {
	                	System.out.println("File deleted !!");
	                }
	                else
	                {
	                	System.out.println("File not deleted");
	                }
	                //------------end of the above code--------------------//
	            }  
	        } catch (IOException e) {  
	            e.printStackTrace();  
	        }  	  
	   }

}
