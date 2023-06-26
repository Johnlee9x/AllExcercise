package bai15.learning_result_management_application;

import data.Cabinet;
import data.Department;
import data.Student_Base;
import ui.Menu;
import util.MyUtil;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");
        List<Student_Base> studentBaseList = new ArrayList<>();
        List<Department> departmentList = new ArrayList<>();
        Cabinet cabinet = new Cabinet(studentBaseList, departmentList);
        List<String> optionList = new ArrayList<>();
        Menu menu = new Menu("Welcome to Application", optionList);
        menu.addOption("1. Add new OfficialStudent");
        menu.addOption("2. Add new NoneOfficialStudent");
        menu.addOption("3. Search the Student with highest scoreInput");
        menu.addOption("4. Check the Student that has to be official ");
        menu.addOption("5. Check sum of official Student");

        int choice;
        do{
            menu.showAllOptionList();
            choice = menu.getChoice();
            switch (choice){
                case 1:
                    cabinet.addOfficialStudent();
                    break;
                case 2:
                    cabinet.addNoneOfficialStudent();
                    break;
                case 3:
                    cabinet.sortStudent();
                    System.out.println(cabinet.getListStudent().get(studentBaseList.size() -1).toString());
                    break;
                case 4:
                    String id = MyUtil.getString("Enter the Id to check: ", "InputMissMatch and Try again");
                    if(cabinet.checkOfficialStudent(id) == null){
                        System.out.println("No Official, Try angain");
                        break;
                    }
                    else{
                        System.out.print("Yes, The student is official, She/ He is: ");
                        System.out.println(cabinet.checkOfficialStudent(id).toString());
                    }
                    break;
                case 5:
                    System.out.print("Sum of official Student is: ");
                    System.out.println(cabinet.sumOfficialStudent());
                    break;

            }
        }while (choice != 0);
    }
}