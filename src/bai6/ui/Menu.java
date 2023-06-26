package bai6.ui;

import cabinet.Cabinet;
import util.MyUtil;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Menu {
    Cabinet cabinet;
    String menuTitle;
    List<String> optionList = new ArrayList<>();
    public Menu(Cabinet cabinet, String menuTitle){
        this.cabinet = cabinet;
        this.menuTitle = menuTitle;
    }
    public void addNewOption(String option){
        this.optionList.add(option);
    }
    public void printAllOption(){
        System.out.println(this.menuTitle);
        Optional optional = Optional.ofNullable(optionList);
        optional.ifPresent(System.out::println);
    }
    public int getChoice(){
        int min = 1;
        int max = optionList.size();
        String inputMsg = "your choice is from "+ min+ "...... " + max;
        String errMsg = "your choice has to be greater than "+ min +", and lower than "+ max;
        return MyUtil.getAnInteger(inputMsg, errMsg, min, max);
    }
}
