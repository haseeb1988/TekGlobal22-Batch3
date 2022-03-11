package com.test.hib.controller;

import com.test.hib.model.User;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreatingUser {

    public static void main(String[] args)
    {
        SessionFactory f = new Configuration().configure().buildSessionFactory();
        Session s =  f.openSession();

        Transaction t = s.beginTransaction();
        User uone = new User();
        uone.setAge(20);
        uone.setCity("NYC");
        uone.setEmail("ancd@gmail.com");
        uone.setFullname("Haseebn");
        uone.setPassword("password i dont know");

        uone.setSalary(2012);

        User utwo = new User();
        utwo.setAge(30);
        utwo.setFullname("James");
        utwo.setEmail("james@gmail.com");
        utwo.setSalary(2000);
        utwo.setCity("NJ");

        User uThree = new User();
        uThree.setEmail("Shahparan@gmail.com");
        uThree.setFullname("AH Shahparan");
        uThree.setPassword("Shahparan123");
        uThree.setSalary(3060.69);
        uThree.setAge(30);
        uThree.setCity("Chicago");



        /*========= We can pass value/data by using constructor =========*/

        Integer  userid = null;


        t.commit();
        System.out.println("Data is sucessfully inserted in user table");

        f.close();
        s.close();
    }
}
