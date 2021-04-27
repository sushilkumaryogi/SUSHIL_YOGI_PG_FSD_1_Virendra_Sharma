package sushil_pg_fsd_1;

import java.io.File;
import java.io.FileFilter;
import java.util.Arrays;
import java.util.Comparator;

public class RetrunFile01 {

	public static void main(String[] args)
	  {
	    File dir = new File("E:\\JAVA project vi\\project");
	    if(dir.isDirectory())
	    {
	      // Fetching the list from the directory
	      File[] files = dir.listFiles();

	      System.out.println("All the files including folders");
	      System.out.println("--------------------------------");
	      
	      //Lists only files since we have applied file filter
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	   
	   // Creating a filter to return only files.
	      FileFilter fileFilter = new FileFilter()
	      {
	        @Override
	        public boolean accept(File file) {
	          return !file.isDirectory();
	        }
	      };
	   
	   files = dir.listFiles(fileFilter);
	   
	      System.out.println("\nAfter filtering the folders");
	      System.out.println("--------------------------------");

	      // Sort files by name
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2) {
	          return ((File) f1).getName().compareTo(((File) f2).getName());
	        }
	      });

	      //Prints the files in file name ascending order
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by name");
	      System.out.println("----------------------------------");

	      // Sort files by size.
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2)
	        {
	          if (((File) f1).length() < ((File) f2).length())
	          {
	            return -1;
	          }
	          else if (((File) f1).length() > ((File) f2).length())
	          {
	            return 1;
	          }
	          else
	          {
	            return 0;
	          }
	        }
	      });

	      //Prints files in order by file size
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("\nAfter sorting by length");
	      System.out.println("-------------------------------");

	      // Sort files by date.
	      Arrays.sort(files, new Comparator()
	      {
	        @Override
	        public int compare(Object f1, Object f2)
	        {
	          if (((File) f1).lastModified() < ((File) f2).lastModified())
	          {
	            return -1;
	          }
	          else if (((File) f1).lastModified() > ((File) f2).lastModified())
	          {
	            return 1;
	          }
	          else
	          {
	            return 0;
	          }
	        }
	      });

	      //Prints files in order by last modified date
	      for(File file:files)
	      {
	        System.out.println(file.getName());
	      }
	      System.out.println("-------------------------");
	    }
	  }

}
