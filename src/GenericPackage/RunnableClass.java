package GenericPackage;

public class RunnableClass {

    public static void main(String[] args)
    {
        G_DataTypesClass obj1 = new G_DataTypesClass();
        G_DataTypesClass<String> obj2 = new G_DataTypesClass<String>();
        G_DataTypesClass<Integer> obj3 = new G_DataTypesClass<Integer>();
        G_DataTypesClass<Double> obj4 = new G_DataTypesClass<Double>();
        G_DataTypesClass<StudentService> obj5 = new G_DataTypesClass<StudentService>();

        StudentService s1 = new StudentService();
        s1.setProgram("TekJAva");
        s1.setRollNumber(1);
        s1.setStudName("Haseeb");

        obj5.setVarName(s1); // passing s1 in Generic Class(obj5)

      // int -> Integer, double --> Double, float-> Float

        obj1.setVarName("Teksystem");
        System.out.println(obj1.getVarname());
        obj1.setVarName(5);
        System.out.println(obj1.getVarname());
        obj1.setVarName(true);
        System.out.println(obj1.getVarname());
        // Bound Type or Type safety or
        // constructor base boundtype or class level boundtypes
  // We can only specify Wrapper Data type and any Reference Class

        obj2.setVarName("Haseeb");
        obj3.setVarName(54);
        // -----Multiple variables----------
G_multiplevariable myObj1 = new G_multiplevariable(111 , "Teksystem");
G_multiplevariable myObj2 = new G_multiplevariable(20.3 , 2563);
G_multiplevariable myObj3 = new G_multiplevariable("CollageName" , "Teksystem");

G_multiplevariable myObj4 = new G_multiplevariable();
 myObj4.setV1(25);
 myObj4.setV2("Haseeb");

 G_multiplevariable<Integer, String> mobj5 = new G_multiplevariable<>();
 mobj5.setV1(1);
 mobj5.setV2("Haseeb");
 mobj5.printBothVariable();

 G_multiplevariable<String, String> mobj6 = new G_multiplevariable<>();
 mobj6.setV1("Teksystem");
 mobj6.setV2("TekGlobal");
 mobj6.printBothVariable();


    }
}
