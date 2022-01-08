import java.util.Scanner;

public class positiveORnegative {
    public static void main(String[]args){
        System.out.print("enter a number:");
        Scanner num = new Scanner(System.in);
        int a=num.nextInt();
        if (a<0) {
            System.out.println("the given number is negative");
        }	else {
            System.out.println("the given number is positive");
        }
    }}
