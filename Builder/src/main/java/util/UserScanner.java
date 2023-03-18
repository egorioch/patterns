package util;

import java.io.Console;
import java.util.Scanner;

public class UserScanner {
    public static String getString() {
        Scanner in = new Scanner(System.in);
        return in.next();
    }
}
