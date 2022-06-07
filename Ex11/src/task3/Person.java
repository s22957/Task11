package task3;

import java.time.LocalDate;

public abstract class Person {

    protected final String firstName;
    protected final String lastName;
    protected final int birthdayYear;

    public Person(String firstName, String lastName, int birthdayYear) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.birthdayYear = birthdayYear;
    }

    protected int getAge(){
        return LocalDate.now().getYear() - birthdayYear;
    }
}
