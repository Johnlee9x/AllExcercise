package bai6.data;

import java.util.Calendar;

public class Student {
    private String name;
    private int yearOfBirthday;
    private String homeTown;
    private String className;

    public Student(String name, int yearOfBirthday, String homeTown, String className){
        this.name = name;
        this.yearOfBirthday = yearOfBirthday;
        this.homeTown = homeTown;
        this.className = className;

    }
    public int getYearOfBirthday() {
        return yearOfBirthday;
    }
    public int getAge(){
        return Calendar.getInstance().get(Calendar.YEAR) - this.getYearOfBirthday();
    }
    public String getHomeTown() {
        return homeTown;
    }

    public String toString(){
        return "Student's name: " + this.name + ", Student's age: "+(Calendar.getInstance().get(Calendar.YEAR) - this.getYearOfBirthday());
    }
}
