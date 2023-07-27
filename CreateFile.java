//package CreateFile;
import java.util.Scanner;
import java.io.*;
public class CreateFile
{
    public static void main(String[] args)
    {
        try
        {
            File myFile=new File("C:\\Users\\koush\\Desktop\\Java_Training\\File_io\\Craete1.txt");
            if(myFile.createNewFile())
                System.out.println("File created : "+myFile.getName());
            else
                System.out.println("File already exist");
        }
        catch(IOException e)
        {
            System.out.println("An error occured");
            e.printStackTrace();
        }
    }
}