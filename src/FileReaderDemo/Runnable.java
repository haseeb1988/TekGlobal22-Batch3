package FileReaderDemo;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Runnable {

    public static void main(String[] args )
    {
     // FileReader() --> Character base Stream
        try {
          FileReader fr = new FileReader("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\Data.txt");
           // read() --> read single character from source, It will return -1 at the end of the file or source
          // System.out.println(fr.read());
          // int ASCICharacter_Data =   fr.read();
          // System.out.println((char) ASCICharacter_Data);
            int ASCICharacter_Data;
            while( ( ASCICharacter_Data = fr.read() )  != -1)
           {
               System.out.print((char) ASCICharacter_Data);
           }
            fr.close();
        }
        catch (FileNotFoundException e)
        {
            System.out.println("File is missing" + e);
        }
        catch (IOException e)
        {
            System.out.println("IO exception occur");
        }
    }
}
