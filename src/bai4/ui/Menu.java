package bai4.ui;

import util.MyUtil;

import java.util.List;

public class Menu {
    List<String> listOption;
    String menuTitle;
    public Menu(String menuTitle, List<String> list){
        this.menuTitle = menuTitle;
        this.listOption = list;
    }
    public void addNewOption(String option){
        listOption.add(option);
    }
    public void showAllOption(){
        System.out.println(this.menuTitle);
        this.listOption.forEach(e-> System.out.println(e));
    }
    public int getChoice(){
        int min = 1;
        int max = listOption.size();
        String inputMsg = "your choice is from 1 to" + max;
        String errMsg = "your choice must be greater than 1 and smaller than "+ max;
        return MyUtil.getAnInteger(inputMsg, errMsg, min, max);
    }
}
