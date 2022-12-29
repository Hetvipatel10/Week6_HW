package homework6;

import java.util.Scanner;
public class Pro17_decimal {
    //Write a Java program to convert a decimal number to binary number.
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a decimal number :");
        int decimal = sc.nextInt();

        String result = Integer.toBinaryString(decimal);
        System.out.println("Binary value of the given decimal number is :" +result);
    }

}
