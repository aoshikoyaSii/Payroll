package com.company;

import java.util.Scanner;

public class Main {
public static PayrollList payroll = new PayrollList();
private static Scanner scan = new Scanner(System.in);


    public static void main(String[] args) {


        boolean quit  = false;
        printOptionsList();
        while(!quit){
            System.out.println("Enter your option digit : ");
            int options = scan.nextInt();
            scan.nextLine();

            switch(options){
                case  1:
                    printOptionsList();
                    break;
                case 2:
                    SumofEmployeeSalary();
                    break;
                case 3:
                    DisplayEmployeeData();
                    break;
                case 4:
                    AddNewEmployee();
                    break;
                case  5:
                    System.out.println("Quiting Operation...");
                    quit = true;
                    break;
                default:
                    System.out.println("Non of the options are choosen");


            }

        }
    }

    public static  void printOptionsList(){ System.out.println();
        System.out.println("\n Press");
        System.out.println("\t 1 - To Print choice options");
        System.out.println("\t 2 - To Print sum of employees salary ");
        System.out.println("\t 3 - To Print employees data");
        System.out.println("\t 4 - To Add new employee");
        System.out.println("\t 5 - To Quit from the application");
    }

    public static  void AddNewEmployee(){
      payroll.newUser();
    }

    public static void DisplayEmployeeData(){
        payroll.printData();
    }


    public static void SumofEmployeeSalary(){
        payroll.SumEmployeeSalary();
    }


}
