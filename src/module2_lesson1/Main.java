package module2_lesson1;

import static java.lang.System.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(in);

        String name = scan.next();
        String type = scan.next();
        String color = scan.next();
        CarNowYear bmwx8 = new CarNowYear(name, type, color);
        out.println(bmwx8.getColor());
    }
}

