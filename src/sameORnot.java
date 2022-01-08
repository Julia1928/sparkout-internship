

import java.util.Scanner;

public class sameORnot {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int a = 0;
        System.out.println("a=" + a);
        a = num.nextInt();
        int b = 0;
        System.out.println("b=" + b);
        b = num.nextInt();

        if (a == b) {
            System.out.println("a and b are same numbers");
        } else {
            System.out.println("a and b are not same numbers");
        }
    }
}


