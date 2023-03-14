/*
Question : Write a program to print power of number in given series.
 */

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int starting,ending,sum;
        System.out.println("Enter the starting digit :");
        starting = sc.nextInt();
        System.out.println("Enter the ending digit :");
        ending = sc.nextInt();
        System.out.println("Printing the result :");
        while (starting <= ending){
            sum = starting * starting;
            System.out.println(starting+ " : " + sum);
            starting++;
        }
    }
}