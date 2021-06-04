package sef.final_task.activity_2;

import sef.final_task.activity_1.Person;

public class CustomExceptionDemo {
    public static void main(String[] args) {
        try {
            Person person = new Person("Ivan 3", "Ryurykavich", 65);
            Person person1 = new Person("Peter", "1 Romanov", 52);
        }
        catch (Exception e) {
            System.out.println("A custom exception occurred.");
            System.out.println("Exception detail: " + e.getMessage());
        }


    }

}
