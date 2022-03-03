package ArrayListDemo;

import java.io.FileNotFoundException;
import java.util.*;

public class ArraylistDemonstration {
    public static void main(String[] args) throws FileNotFoundException {
        // Arraylist is GEneric type
        ArrayList list1 = new ArrayList(); // Not a type safety
        list1.add("Haseeb"); // add() we can add values in arraylist
        list1.add(32)   ;
        list1.add(true);
        list1.add(20.35);

        ArrayList<String> list2 = new ArrayList<>();
        list2.add("Haseeb");
        list2.add("Muhammad");

        ArrayList<Integer> studeRoll = new ArrayList<>();
        studeRoll.add(11);
        studeRoll.add(12);

        ArrayList<StudentService> stser = new ArrayList<>();

        List<String> l = new ArrayList<>();

        List listOne =  Arrays.asList(1,"Haseeb", 2.365);
        List<String> ListTwo = Arrays.asList("Haseeb", "Neil", "Jared");

       for(String showelements : ListTwo)
       {
           System.out.println(showelements);
       }

        // ITerators: travering through Iterator

         Iterator itr = ListTwo.iterator();
        while(itr.hasNext()){
            System.out.println(itr.next());
        }

        //Addall() method we can insert elements in the specified collection into list,

       List<Integer> primeNumber = new ArrayList<>();
       primeNumber.addAll( Arrays.asList(2 , 7 , 11, 12,13,14,15,16)  );
       System.out.println(primeNumber);

       primeNumber.addAll(6 , Arrays.asList(3,5));
       System.out.println(primeNumber);

       ArrayList<String> studentList = new ArrayList<>();
       studentList.add("Haseeb");
       studentList.add("Neil");
       studentList.add("khalid");
       studentList.add("joseph");
       studentList.add("khalid");
       studentList.add("Jared");

        System.out.println(studentList);
        System.out.println(studentList.size() );
        System.out.println(studentList.get(2));

        System.out.println(" =========indexOF and contains============");
        System.out.println(studentList.indexOf("ABCD"));
        System.out.println(studentList.contains("ABCD"));


        System.out.println("----------After removing ------------");
        System.out.println(studentList.remove("Jared"));
        System.out.println(studentList.remove(3));
        System.out.println(studentList);

        ArrayList<Integer> studentRoll = new ArrayList<>();
        studentRoll.add(200);
        studentRoll.add(2);
        studentRoll.add(100);
        studentRoll.add(3);
        studentRoll.add(5);
        studentRoll.add(6);

        System.out.println(studentRoll); // before sort
        Collections.sort(studentRoll);
        System.out.println(studentRoll); // after sort
        Collections.reverse(studentRoll);
        System.out.println(studentRoll);

        studentRoll.remove(0);
        System.out.println(studentRoll);

        studentRoll.set(2, 600);
        System.out.println(studentRoll);

        ArrayList<StudentService> stlist = new ArrayList<>();

        StudentService s1 = new StudentService(101, "Haseeb", "JavaDeveloper" );
        StudentService s2 = new StudentService(102, "Jared", "JavaDeveloper");
        StudentService s3 = new StudentService(103, "Neil", "JavaDeveloper");
        StudentService s4 = new StudentService(104, "Jessica", "JavaDeveloper");
        StudentService s5 = new StudentService(105, "Makhtal", "JavaDeveloper");
        stlist.add(s1);
        stlist.add(s2);
        stlist.add(s3);
        stlist.add(s4);
        stlist.add(s5);

        for(StudentService showlist : stlist)
        {
            System.out.println( showlist.getProgram()  + " " + showlist.getStudName() +" "+ showlist.getRollNumber()    );
        }

        ArrayList<Teacher> tlist = new ArrayList<>();

        Teacher t1 = new Teacher(200, "James", 40);
        Teacher t2 = new Teacher(500, "Mark", 25);
        Teacher t3 = new Teacher(800, "Adam", 30);
        tlist.add(t1);
        tlist.add(t2);
        tlist.add(t3);

        Iterator myItr = tlist.iterator();
        while (myItr.hasNext())
        {
           Teacher t =   (Teacher) myItr.next();
            System.out.println(t.getTid() + " " + t.getTname() + " " + t.getTage());
        }

        System.out.println(" ================= Dynamic solution=================");
        int[] a;
        a = new int[5];


        Studentworking w = new Studentworking();
        w.displayStudentinfo();

       // StudentController obj = new StudentController();
        w.pullDatafromFile();























    }
}
