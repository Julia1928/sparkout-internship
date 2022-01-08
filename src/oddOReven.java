import java.util.Scanner;

public class oddOReven {
    public static void main(String[]args){
        System.out.print("enter a number:");
        Scanner num = new Scanner(System.in);
        int a=num.nextInt();
        if (a%2==0) {
            System.out.println("the given number is even");
        }	else {
            System.out.println("the given number is odd");
        }
    }}
