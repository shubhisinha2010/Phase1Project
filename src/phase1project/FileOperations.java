package phase1project;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileOperations {

	public static void main(String[] args) {
		//a menu driven program for accepting various inputs from user depicting different file operations
		Scanner sc=new Scanner(System.in);
		System.out.println("WELCOME\n\n");
		System.out.println("Application Name : LockedMe.com\n"+"Developer Details : Shubhi Sinha");
		System.out.println("The User Interaction Details are");
		//menu for accepting inputs by the user
		System.out.println("Enter 1 for displaying files in ascending order");
		System.out.println("Enter 2 for adding deleting or searching a file in directory");
		System.out.println("Enter 3 to Exit the application");

		int ch=sc.nextInt();
		while(true) {
		switch(ch)
		{
		case 1://displaying files in ascending order
		{   display();
			break;
		}
		case 2://file operations
		{
			System.out.println("Enter 1 to Add a file");
			System.out.println("Enter 2 to Delete a file");
			System.out.println("Enter 3 to Search a file");
			int n=sc.nextInt();
			CreateDeleteSearchFile.operation(n); //static method call
			System.out.println("Operation Completed");
			break;
		}
		case 3://exit
		{
			ch=0;break;
		}
		default:
			System.out.println("Invalid choice");
		}//end of switch
		if(ch==0)
			break;//breaking while to exit
		System.out.println("Enter input again- 1,2 or Enter 3 to Exit the application");
		ch=sc.nextInt();
		if(ch==3)
			break;
		else
			continue;
	}//end of while
		System.out.println("You have successfully closed the application\n Thank You for visiting LockedMe.com");
	}
	public static void display()
	{
		File f = new File("C:\\shubhi");

        File []file_names = f.listFiles();
        Arrays.sort(file_names);
        
        for (File filename : file_names) {
            // Print the names of files in the given directory
            System.out.println(filename.getName());
        }
	}
}
