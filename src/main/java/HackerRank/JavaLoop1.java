package HackerRank;

import java.util.Scanner;

public class JavaLoop1 {
    public static void main(String[] args) {

        System.out.println("Enter number:");
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();


        for (int i = 1; i <= 10; i++) {

            System.out.println(number + " x " +  i + " = " + number*i);
        }
    }
}


