package bai15.util;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtil {
    static Scanner sc = new Scanner(System.in);
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                return n;
            } catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    public static String getAString(String inputMsg, String errMsg, String regex){
        String str;
        Pattern pattern = Pattern.compile(regex);
        Matcher matcher ;
        System.out.println(inputMsg);
        while (true){
            str = sc.nextLine();
            matcher = pattern.matcher(str);
            if(matcher.matches()){
                return str;
            }
            else{
                System.out.println(errMsg + "-" + "Try again");
            }
        }
    }
    public static double getADouble(String inputMsg, String errorMsg, double lowerNum, double upperNum) {
        double n, tmp;
        if (lowerNum > upperNum) {
            tmp = lowerNum;
            lowerNum = upperNum;
            upperNum = tmp;
        }
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                if (n < lowerNum || n > upperNum)
                    throw new Exception();
                return n;
            }
            catch(NumberFormatException e){
                System.out.println("NumberFormatException and Try again");
            }
            catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    public static double getADouble(String inputMsg, String errorMsg) {
        double n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Double.parseDouble(sc.nextLine());
                return n;
            }
            catch (NumberFormatException e){
                System.out.println("NumberFormatException and Try again");
            }
            catch (Exception e) {
                System.out.println(errorMsg);
            }
        }
    }
    public static String getID(String inputMsg, String errorMsg, String format) {
        String id;
        boolean match;
        while (true) {
            System.out.println(inputMsg);
            id = sc.nextLine().trim().toUpperCase();
            match = id.matches(format);
            if (id.isEmpty() || !match)
                System.out.println(errorMsg);
            else
                return id;
        }
    }
    public static String getString(String inputMsg, String errMsg){
        String str;
        System.out.println(inputMsg);
        while (true){
            str = sc.nextLine();
            if(str.isEmpty()){
                System.out.println(errMsg);
            }
            else return str;
        }
    }
    public static int getAnInteger(String inputMsg, String errMsg, int minNum, int maxNum){
        int num;
        System.out.println(inputMsg);
        while (true){
            try{
                num = Integer.parseInt(sc.nextLine());
                if(num < minNum || num > maxNum){
                    throw new Exception();
                }
                return num;

            }
            catch (NumberFormatException e){
                System.out.println("NumberFormatException and Try again");
            }
            catch (Exception e) {
                System.out.println(errMsg);;
            }
        }
    }
}
