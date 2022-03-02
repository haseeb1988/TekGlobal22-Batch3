package FileWriterDemo;

import java.io.FileWriter;
import java.io.IOException;

public class runnable {
    public static void main(String[] args ) {
        // Filewriter is character base stream class

        try {
            FileWriter w = new FileWriter("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\TekGlobalDemo.txt", true);
            w.write(65);  // ASCI for A
            w.write(66);   // ASCI for B
            w.write(67);  // writer convert ASCI to CHar
            String content = "I am learning JAVA from TekGlobal Bootcamp"; // String passing to write method
            w.write(content);
            w.write('\n');
            String content2 = "I will learn Spring boot after few weeks";
            w.write(content2);
            w.close();
  }
        catch (IOException e)
        {
            System.out.println("");
        }


    }
}
