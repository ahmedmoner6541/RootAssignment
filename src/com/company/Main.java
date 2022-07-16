package com.company;


import com.company.oop.assignmentOne.BankAccount;

public class Main {
    public static void main(String[] args) {
        BankAccount account = new BankAccount(100);
        account.deposit(50);
        account.withdraw(100);
        account.withdraw(60);


    }





 /*       Employee ahmed = new Developer(1, "ahmed", 29, 4000, "adnroid");
        Employee sara = new Developer(2, "sara", 22, 6000, "flutter");

        Employee developer =   new Developer(3, "aya", 15, 2500, "gammer") ;

        Employee ali = new Accountant(4, "ali", 28, 3300, true);
        Employee mosa = new Accountant(5, "mosa", 28, 4500, false);


        // printEmployees(developer, accountant);


        // polymorphism

        Employee[] employees = {ahmed,sara,developer,ali, mosa, new Accountant(6, "gmal", 25, 3000, false)};

      //  printEmployees(employees);





    private static void printEmployees(Employee[] employee) {
        for (int i = 0; i < employee.length; i++) {
            System.out.println("accountant ------------------------------");
            employee[i].view();
        }
    }
   */

   /* private static void printEmployees(Developer[] developer, Accountant[] accountant) {
        for (int i = 0; i < developer.length; i++) {
            System.out.println("developer ------------------------------");
            developer[i].view();

        }
        for (int i = 0; i < accountant.length; i++) {
            System.out.println("accountant ------------------------------");
            accountant[i].view();
        }

    }*/
}