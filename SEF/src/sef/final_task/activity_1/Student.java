package sef.final_task.activity_1;

import sef.final_task.activity_2.CustomException;
import sef.final_task.bonus_activity.Humanity;

public class Student extends Person implements Humanity {

    private String schoolName;

    public Student() {

    }

    public Student(String firstName, String lastName, int age, String schoolName) throws CustomException {
        super(firstName, lastName, age);
        this.schoolName = schoolName;
    }

    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

    public String getSchoolName() {
        return schoolName;
    }

    @Override
    public String introduce() {
        return "My name is " + super.getFirstName() + " " + this.getLastName() + " and I am " + super.getAge() + " years old. " +
                           "I study in university " + this.schoolName + ".";
    }
}
