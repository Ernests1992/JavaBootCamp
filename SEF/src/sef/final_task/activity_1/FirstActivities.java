package sef.final_task.activity_1;

import sef.final_task.activity_2.CustomException;

import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class FirstActivities {
    public static void main(String[] args) throws CustomException {
        Employee employee1 = new Employee("John", "Krause", 25, 1100.00, "junior developer", "Company A");
        Employee employee2 = new Employee("Mike", "Berry", 26, 2200.00, "middle developer", "Company B");
        Employee employee3 = new Employee("Shanti", "Roth",  27, 3100.00, "senior developer", "Company C");
        Employee temp;
        Employee[] employees = {employee1, employee2, employee3};

        try {
            for (int i = 0; i < employees.length - 1; i++) {
                for (int j = 0; j < employees.length - 1; j++) {
                    if (employees[j].getSalary() < employees[j + 1].getSalary()) {
                        temp = employees[j];
                        employees[j] = employees[j + 1];
                        employees[j + 1] = temp;
                    }
                }
            }
        }
        catch(ArrayIndexOutOfBoundsException arrEx) {
            System.out.println("Exception type: " + arrEx.getClass());
            System.out.println("Exception detail: " + arrEx.getLocalizedMessage());
        }

        System.out.println();
        System.out.println("Employees from top salary to less:");
        System.out.println("First name\tLast name\tAge\tJob Title\t\tCompany Name\tSalary");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].getFirstName() + "\t" + employees[i].getLastName() + "\t" + employees[i].getAge() + "\t"
                             + employees[i].getJobTitle() + "\t" + employees[i].getCompanyName() + "\t" + employees[i].getSalary());
        }

        System.out.println();
        System.out.println("Employee introductions:");
        for (int i = 0; i < employees.length; i++) {
            System.out.println(employees[i].introduce());
            System.out.println("My salary is " + employees[i].getSalary() + ".");
        }


        try {
            PrintWriter outputFile = new PrintWriter("src\\sef\\final_task\\bonus_activity\\ListOfEmployees.txt");
            outputFile.println("Employees from top salary to less:");
            outputFile.println("First name\tLast name\tAge\tJob Title\tCompany Name\t\tSalary");
            for (int i = 0; i < employees.length; i++) {
                outputFile.println(employees[i].getFirstName() + "\t" + employees[i].getLastName() + "\t" + employees[i].getAge() + "\t"
                                 + employees[i].getJobTitle() + "\t" + employees[i].getCompanyName() + "\t" + employees[i].getSalary());

            }
            outputFile.println();
            outputFile.println("Employee introductions:");
            for (int i = 0; i < employees.length; i++) {
                outputFile.println(employees[i].introduce());
                outputFile.println("My salary is " + employees[i].getSalary() + ".");
            }
            outputFile.close();
        }
        catch (FileNotFoundException fEx) {
            System.out.println("File not found!");
            System.out.println("Exception detail: " + fEx.getLocalizedMessage());
        }

    }
}
