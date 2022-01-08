import java.util.Scanner;

public class largest {
    public static void main(String[]args) {
        System.out.println("enter the numbers");
        Scanner num = new Scanner(System.in);
        System.out.print("a=");
        int a = num.nextInt();
        System.out.print("b=");
        int b= num.nextInt();
        System.out.print("c=");
        int c= num.nextInt();
        if (a > b && a > c) {
            System.out.println("a is the largest number");
        } else if (b > a && b > c) {
            System.out.println("b is the largest number");
        } else {
            System.out.println("c is the largest number");
        }
    }
}

