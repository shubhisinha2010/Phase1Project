package phase1project;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class CreateDeleteSearchFile {
	
	static Scanner sc=new Scanner(System.in);

	public static File dir= new File("C:\\shubhi");
	public static void operation(int n)
	{ int num=n;
		while(true) {
		switch(num)
		{
		case 1://Create a file
		{
			create();
			break;
		}
		case 2://delete a file
		{
			delete();
			break;
		}
		case 3://search a file
		{
			search();
			break;
		}
		
		default:
			System.out.println("Invalid Input");
			
		}
		System.out.println("Enter input again-1,2,3 or 0 to go back to previous menu");
		num=sc.nextInt();sc.nextLine();
;		if(num==0)
		break;
		else
			continue;}
	}
	
	  public static void create() {
		  System.out.println("Enter the name of the file to be created");
		  
		  String inputFileName=sc.nextLine();
		  
		    File input = new File(dir,inputFileName); 
		    try{
		    	if(input.createNewFile())
		        System.out.println("File created");
		    	else
		        System.out.println("File already exists");
		    } catch(IOException e) {
		        System.out.println("File already exists");
		    }
	  } 
	  public static void delete() {
		  System.out.println("Enter the name of the file to be deleted");
		  String inputFileName=sc.nextLine();
		  File f = new File("C:\\shubhi");

	        String []filenames = f.list();
	        //implementing binary search to check if the file to be deleted exists in the array of all files or not
	        
	        int beg=0,end=filenames.length-1;int res=-1;
	        while (beg <= end) { 
	            int mid = beg + (end - beg) / 2; 
	      
	 
	            if (filenames[mid].compareTo(inputFileName)==0) 
	                {res= mid; break;}
	      
	            if (filenames[mid].compareTo(inputFileName)<0) 
	                beg = mid + 1; 
	      
	            else
	                end = mid - 1; 
	        } 
	        if(res==-1)
	        	 System.out.println("No such file found"); 
	        else {
		  
		  File delfile = new File(dir,filenames[res]); 
          
	        if(delfile.delete()) 
	        { 
	            System.out.println("File deleted successfully"); 
	        } 
	        }  
	  }
	  public static void search() {
		  
		  System.out.println("Enter the name of the file to be searched");
		  String inputFileName=sc.nextLine();
		  File f = new File("C:\\shubhi");
		  String []filenames = f.list();
	        //implementing binary search to check if the file to deleted exists in the array of all files or not
	        
	        int beg=0,end=filenames.length-1;int res=-1;
	        while (beg <= end) { 
	            int mid = beg + (end - beg) / 2; 
	      
	 
	            if (filenames[mid].compareTo(inputFileName)==0) 
	                {res= mid; break;}
	      
	            if (filenames[mid].compareTo(inputFileName)<0) 
	                beg = mid + 1; 
	      
	            else
	                end = mid - 1; 
	        } 
	        if(res==-1)
	        	 System.out.println("No such file found"); 
	        else {
		  
		         System.out.println("File found successfully"); 
	        }  
	  }
	 

}
