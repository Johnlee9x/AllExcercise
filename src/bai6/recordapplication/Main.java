package bai6.recordapplication;

import cabinet.Cabinet;
import data.Student;
import ui.Menu;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Student> list = new ArrayList<>();
        List<String> optionList = new ArrayList<>();
        Cabinet cabinet = new Cabinet(list);
        Menu menu = new Menu(cabinet,"Welcome to Student's Record Application");
        menu.addNewOption("1. Add new Student");
        menu.addNewOption("2. Print list Student having age >= 20");
        menu.addNewOption("3. Show number of Student having age >= 23 and hometown is DN");
        int choice;
        do{
            menu.printAllOption();
            choice = menu.getChoice();
            switch (choice){
                case 1:
                    cabinet.addANewStudent();
                    break;
                case 2:
                    cabinet.printStudent20();
                    break;
                case 3:
                    cabinet.countStudent23DN();
                    break;
            }

        }while (choice != 0);
    }
}