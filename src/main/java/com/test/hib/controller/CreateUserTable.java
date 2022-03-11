package com.test.hib.controller;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class CreateUserTable {

    public static void main(String[] args)
    {
       // Configuration cfg = new Configuration(); // Activate connection
        //Configuration   c = cfg.configure(); // looking for hibernate.cfg.xm for db information.
        //SessionFactory f = c.buildSessionFactory(); // return a database connection

        SessionFactory f = new Configuration().configure().buildSessionFactory();
        Session s =   f.openSession();// Create a session for available connection

    }

}
