package basic.controlflowstatement.loopstatement.forloop;

import java.util.Scanner;

class Factorial01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the value to perfor factorial:");
        for (long i = 1, in = sc.nextInt(), fact = 1; i <= in; ++i) {
            fact = fact * i;

            if (i + 1 > in) {
                System.out.println("Factorial of " + in + " is: " + fact);
            }
        }
    }
}