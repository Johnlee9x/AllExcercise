package bai1.ui;

import util.MyUtil;

import java.util.List;
import java.util.Scanner;

public class Menu {
    Scanner sc = new Scanner(System.in);
    List<String> listOption;
    String menuTitle;
    public Menu(String menuTitle, List<String> listOption){
        this.menuTitle = menuTitle;
        this.listOption = listOption;
    }
    public void addNewOption(String option){
        listOption.add(option);
    }
    public void showAllOption(){
        System.out.println(this.menuTitle);
        if(listOption.isEmpty()){
            System.out.println("There is no option to show");
        }
        else{
            this.listOption.forEach(e-> System.out.println(e));
        }
    }
    public int getChoice(){
        int min = 1;
        int max = listOption.size();
        String inputMsg = "your choice is from 1 to " + max;
        String errMsg = "your choice has to be greater than 1" + " and smaller than " + max;
        return MyUtil.getAnInteger(inputMsg, errMsg, min, max);
    }



}
