package bai15.ui;

import util.MyUtil;

import java.util.List;

public class Menu {
    private List<String> optionList;
    private String tiTle;
    public Menu(String tiTle, List<String > optionList){
        this.optionList = optionList;
        this.tiTle = tiTle;
    }
    public void addOption(String option){
        optionList.add(option);
    }
    public void showAllOptionList(){
        System.out.println(this.tiTle);
        this.optionList.forEach(System.out::println);
    }
    public int getChoice(){
        int min = 1;
        int max = optionList.size();
        String inputMsg = "";
        String errMsg = "";
        return MyUtil.getAnInteger(inputMsg, errMsg, min, max);
    }
}
