package bai1.util;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MyUtil {
    private static Scanner sc = new Scanner(System.in);
    public static int getAnInteger(String intputMsg, String errMsg){
        int n;
        System.out.println(intputMsg);
        while (true){
            try{
                n = Integer.parseInt(sc.nextLine());
                return n;
            }
            catch (NumberFormatException e){
                System.out.println("NumberFormatException and Try again");
            }
            catch(Exception e){
                System.out.println(errMsg);
            }
        }
    }
    public static String getAString(String msg,String error,String regexFormat) {
        String str;
        Pattern pattern = Pattern.compile(regexFormat);
        Matcher matcher;
        System.out.println(msg);
        while (true) {
            str = sc.nextLine();
            matcher = pattern.matcher(str);
            if (matcher.matches()) {
                return str;
            }
            else {
                System.out.println(error);
            }
        }
    }
    public static String getString(String inputMsg, String errorMsg) {
        String str;
        while (true) {
            System.out.println(inputMsg);
            str = sc.nextLine().trim();
            if (str.isEmpty())
                System.out.println(errorMsg);
            else
                return str;
        }
    }
    public static int getAnInteger(String inputMsg, String errorMsg, int lowerNum, int upperNum) {
        int n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
                if (n < lowerNum || n > upperNum)
                    throw new Exception();
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
}
