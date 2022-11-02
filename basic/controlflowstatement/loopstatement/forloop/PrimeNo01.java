package basic.controlflowstatement.loopstatement.forloop;

import java.util.Scanner;
//Error in program

class PrimeNo01 {
    public static void main(String[] args) {
        int no = 1;

        while (no != 0) {
            Scanner sc = new Scanner(System.in);
            System.out.printf("Enter number to check if it is prime or not?:");
            no = sc.nextInt();
            int checkpoint = 0;

            for (int i = 2; i < no; i++) {
                if (no % i != 0) {
                    checkpoint++;
                }
            }
            if (checkpoint + 2 == no) {
                System.out.println(no + " is Prime Number.");
            } else {
                System.out.println(no + " is not prime Numner");
            }
        }
    }
}