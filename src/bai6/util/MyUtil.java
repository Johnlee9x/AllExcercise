package bai6.util;
import java.util.Scanner;
public class MyUtil {
    static Scanner sc = new Scanner(System.in);
    public static int getAnInteger(String inputMsg, String errorMsg, int minOption, int maxOption){
        int n;
        System.out.println(inputMsg);
        while (true){
            try{
                n = Integer.parseInt(sc.nextLine());
                if(n < minOption || n > maxOption)
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
    public static int getAnInteger(String inputMsg, String errorMsg) {
        int n;
        while (true) {
            try {
                System.out.println(inputMsg);
                n = Integer.parseInt(sc.nextLine());
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
    public static String getString(String inputMsg, String errorMsg) {
        String str;
        while (true) {
            System.out.println(inputMsg);
            str = sc.nextLine();
            if (str.isEmpty())
                System.out.println(errorMsg);
            else
                return str;
        }
    }

}
