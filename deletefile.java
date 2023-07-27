import java.io.IOException;
import java.util.Scanner;
import java.io.File;
public class deletefile {
    public static void main(String args[])
    {
        String filePath;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter directory path for deletig a dierectory");
        filePath = sc.nextLine();
        sc.close();
        File file = new File(filePath);
        try
        {
            deleteDirectory(file);
            file.delete();
            System.out.println("Your directory is deleted successfully");
        }
        catch(Exception e)
        {
            System.out.println(e.getMessage());
        }
        }

        public static void deleteDirectory(File file)
        {
            for (File subfile : file.listFiles())
            {
                 if(subfile.isDirectory())
                 {
                    deleteDirectory(subfile);
                 }
            }
        }
    }