package bai6.cabinet;

import data.Student;
import util.MyUtil;


import java.util.List;
import java.util.Scanner;

public class Cabinet {
    Scanner sc = new Scanner(System.in);
    List<Student> list;
    public Cabinet(List<Student> list){
        this.list = list;
    }
    public void addANewStudent(){
        String nameStudent;
        int yearOfBirth;
        String homeTown;
        String nameOfClass;
        nameStudent = MyUtil.getString("Please, enter name of Student: ",
                "InputMissMatch and Try again");
        yearOfBirth = MyUtil.getAnInteger("Please, enter YOB: ",
                "InputMissMatch and Try again");
        homeTown = MyUtil.getString("Please, enter Student's hometown: ",
                "InputMissMatch and Try again");
        nameOfClass = MyUtil.getString("Please, enter Student's ClassName: ",
                "InputMissMatch and Try again");
        list.add(new Student(nameStudent, yearOfBirth, homeTown, nameOfClass));
        System.out.println("Add successfully!!!");
    }
    public void printStudent20(){
        this.list.stream().filter(e->e.getAge() >= 20).forEach(System.out::println);
    }
    public void countStudent23DN(){
        System.out.println(this.list.stream().filter(e->e.getAge() >= 23 && e.getHomeTown().equalsIgnoreCase("DN")).count());
    }

}
