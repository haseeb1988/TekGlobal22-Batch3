package ArrayListDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Studentworking {

    public void displayStudentinfo()
    {
        StudentController con = new StudentController();
        ArrayList<StudentService> sData =  con.pullStudentinfo();
        // System.out.println(sData);
        for(StudentService showlist : sData)
        {
            int roll =  showlist.getRollNumber();
            String prog = showlist.getProgram();
            String name = showlist.getStudName();
            System.out.println(roll + " " + prog + "" + name );
        }
    }

    public void pullDatafromFile() throws FileNotFoundException {
        // Access File: FileClass, Stream base Classes (Bytebase and Character based) , Nio Class
        String path = "C:\\Users\\PSAdmin\\Downloads\\TestingFolder\\studentData.txt";
        // Database connect
        /// f =  Select * from StudentTable
        File f = new File(path);
        if(f.exists())        {
            Scanner sc = new Scanner(f);
            ArrayList<StudentService> stlist = new ArrayList<>();
            String[] spliteData = null;
            while(sc.hasNext())
            {
                String data = sc.nextLine();
                System.out.println(data);
                spliteData = data.split(",");
                StudentService sobj = new StudentService();
                sobj.setRollNumber( Integer.parseInt(spliteData[0]) );
                sobj.setStudName( spliteData[1] );
                sobj.setProgram( spliteData[2]);
                stlist.add(sobj); }
            for(StudentService showlist: stlist )
            {
                String stname =  showlist.getStudName();
                System.out.println(  stname.toUpperCase());
                System.out.println(showlist.getProgram());
                System.out.println( showlist.getRollNumber());
                System.out.println("=====================");
            }

        }



    }






}
