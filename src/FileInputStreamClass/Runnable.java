package FileInputStreamClass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class Runnable {
    public static void main(String[] args )
    {

        // Byte Base Stream for reading data from source

           try {
            FileInputStream fin = new FileInputStream("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\Data.txt");
               int i;
               while( (i = fin.read()) != -1)  {
                 System.out.print((char)i);
             }
           }
           catch (FileNotFoundException e)
           {
               System.out.println("File is missing" + e);
           }
           catch (IOException e)
           {
               System.out.println("Exception occur");
           }
    }
}
