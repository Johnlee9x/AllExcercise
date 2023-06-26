package bai4.management_application;

import data.Cabinet;
import data.Family;
import ui.Menu;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Family> familyList = new ArrayList<>();
        Cabinet cabinet = new Cabinet(familyList);
        List<String> listOption = new ArrayList<>();
        Menu menu = new Menu("Welcome to the Town Management Application", listOption);
        menu.addNewOption("1. Add new Family");
        menu.addNewOption("2. Print N Family");
        int choice;
        do{
            menu.showAllOption();
            choice = menu.getChoice();
            switch (choice){
                case 1:
                    cabinet.addAFamily();
                    break;
                case 2:
                    System.out.println("Please, enter the Num to Print Num family: ");
                    int num = Integer.parseInt(sc.nextLine());
                    cabinet.printNFam(num);
                    break;
            }
        }while (choice != 8);
    }
}