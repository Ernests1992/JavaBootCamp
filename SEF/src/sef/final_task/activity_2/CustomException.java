package sef.final_task.activity_2;

public class CustomException extends Exception {
    @Override
    public String getMessage() {
        return "First name and last name cannot contain numbers!";
    }
}
