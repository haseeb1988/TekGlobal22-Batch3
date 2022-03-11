package com.test.hib.controller;

import java.util.Scanner;

public class Runnable {

    public static void main(String[] args)
    {
        findUser_Hql ObjHql = new findUser_Hql();
       // ObjHql.findAllUsers();
        // ObjHql.getRecordbyId2();
       // ObjHql.getMaxSalaryuser();
        System.out.println("Enter User id");
        Scanner sc = new Scanner(System.in);
        int input = sc.nextInt();
        ObjHql.getAllusers(input);

    }
}
