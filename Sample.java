//This is a program with all File handling functionality in Java.

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.FileAlreadyExistsException;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;  

public class Sample
{
    public static void main(String [] args)
    {
        

        //Creating new file 
        try
        {
            File myobj=new File("prasad.txt");
            if(myobj.createNewFile())
            {
                System.out.println("New file successfully created");
            }
            else
            {
                System.out.println("File already Exists");
            }

        }
        catch(IOException e)
        {
            System.out.println("An error occured");
        }




        //Writing into a file
        try
        {
            FileWriter filewrite=new FileWriter("prasad.txt");
            filewrite.write("Hello, I treid accessing a file from my java program ");

            filewrite.close();
            System.out.println("Successfully wrote to the file.");
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
        }

        //Reading a file
        try
        {
            //Using this object I am accessing this file
            File myobject= new File("prasad.txt");

            //For reading I will use Scanner class
            Scanner myreader= new Scanner(myobject);

            while(myreader.hasNextLine())
            {
                String data=myreader.nextLine();
                System.out.println(data);
            }
            myreader.close();


        }
        catch(FileNotFoundException e)
        {
            System.out.println("An error occurred.");
        }
        

        //Delete a File
        
            File myobje=new File("prasad.txt");

            if(myobje.delete())
            {
                System.out.println("File has successfully deleted");
            }
            else
            {
                System.out.println("An error has occured while deleting a file");
            }
        

    }
}
