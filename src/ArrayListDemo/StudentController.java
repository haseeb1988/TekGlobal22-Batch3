package ArrayListDemo;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class StudentController {

    int[] id =  { 101, 102, 103 , 104 , 105};
    String[] program = {"Java boot camp", "Python boot camp", "Java script boot camp", "Java script boot camp","Java boot camp"};
    String[] name = {"abc","xyz","efg","xyz","MNO"};

    public  ArrayList<StudentService> pullStudentinfo() {
        ArrayList<StudentService> stlist = new ArrayList<>();
        for(int i = 0; i < id.length ; i++ )        {
            StudentService stObj = new StudentService();
            stObj.setRollNumber( id[i] );
            stObj.setProgram(program[i]);
            stObj.setStudName(name[i]);
            stlist.add(stObj);}
         return stlist;
    }




}
