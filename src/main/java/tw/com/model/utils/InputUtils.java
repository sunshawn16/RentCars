package tw.com.model.utils;

import java.util.Scanner;

public class InputUtils {
    public static int getInputNum() {
        System.out.println("Please input a number:");
        Scanner in = new Scanner(System.in);
        return in.nextInt();
    }
}
