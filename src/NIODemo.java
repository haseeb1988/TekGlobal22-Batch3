import java.io.*;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class NIODemo {
    public static void main(String[] args ) throws FileNotFoundException, IOException {
        FileInputStream aFile = new FileInputStream("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\Data.txt");
       // RandomAccessFile afile = new RandomAccessFile("C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\Data.txt", "rw");
        FileChannel inputChannelObj =  aFile.getChannel(); // Channel is open here
        long  Filesize = inputChannelObj.size();  // Finding the size of the Channel
        ByteBuffer buf = ByteBuffer.allocate( (int) Filesize); // initializing the buffer AC to channel size
       // ByteBuffer buf = ByteBuffer.allocate(48); //initialzing buffer, has capacity of 48 bytes
        int bytRead =  inputChannelObj.read(buf); // read data from a channel into a buffer

        buf.flip(); // Make buffer ready for read , Ready Mode set
       while(buf.hasRemaining())
       {
           System.out.print (  (char) buf.get()  );
       }

       inputChannelObj.close();
       aFile.close();

    }
}
