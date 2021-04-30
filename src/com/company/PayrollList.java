package com.company;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class PayrollList {

    List<PayRoll> list = new ArrayList<>();
    PayRoll payroll = new PayRoll("kfhef","fkefn",0);

    Scanner scan = new Scanner(System.in);


    public void newUser() {
        boolean quit = false;
        String newName="";
        String newLastName="";
        int salary = 0;

        while(!quit){
            quit = true;
            System.out.println("Please enter your name");
            newName = scan.nextLine();

            System.out.println("Please enter your surname");
            newLastName = scan.nextLine();

            System.out.println("Please enter worker salary: ");
            while((!scan.hasNextInt() )|| (scan.nextInt() < 0)){
                try{
                    salary = scan.nextInt();
                    if(salary < 0){
                        System.out.println("Please enter integer value> 0");
                        scan.nextLine();
                    }
                }catch (InputMismatchException e){
                 System.out.println("Please enter the correct inout value " + e);
                 scan.nextLine();
             }
            }
                salary = scan.nextInt();
            scan.nextLine();
        }
        list.add(new PayRoll(newName, newLastName, salary));
    }

    //print data
    public void printData(){
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
    }

        // print total sum
        public int  SumEmployeeSalary(){
        int result = 0;
        for(PayRoll m : list){
            result += m.getSalaray();
        }
            System.out.println("Total sum: " + result);
        return result;
        }

    }

