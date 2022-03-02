import com.sun.corba.se.spi.ior.Writeable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.nio.channels.WritableByteChannel;

public class NIOExampleTwo {
    public static void main(String[] args ) throws IOException {
        // Read Data from Two files
        // Write Data into one file  using NIO
       // Input files
        String[] inputFiles = {"C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\inputfileone.txt",
               "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\inputfiletwo.txt"};
        // Files content will be written in this file
        String outfile = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\outputfileTekGlobal.txt";
        FileOutputStream foutput = new FileOutputStream(outfile) ;
        // Open channel for destination
        WritableByteChannel destinationCannel =  foutput.getChannel();

        for(int i=0; i <inputFiles.length ; i++ )
        {
            // Open channel for sources files
            FileInputStream finp = new FileInputStream(inputFiles[i]);
            FileChannel sourcechannel =  finp.getChannel();

            // Transfer data from sourcechannel to outputchannel
            sourcechannel.transferTo(0,   sourcechannel.size(), destinationCannel);
        }
        destinationCannel.close();
        foutput.close();




    }
}
