package basic.methods.parameterized;

import java.util.Scanner;

class XylemorPloem {

    public static void xylemorploem(int n) {
        int middle = 0;
        int lastno = 0;
        int flag = 0;
        while (n > 0) {
            if (flag == 0) {
                lastno = n % 10;
                n = n / 10;
                flag++;
            } else if (n < 10) {
                lastno = lastno + n;
                n = n / 10;
            } else if (n > 10) {
                middle = middle + n % 10;
                n = n / 10;
            } else {

            }
        }
        if (middle == lastno) {
            System.out.println("Xylem");
        } else {
            System.out.println("ploem");
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a intiger value to find xylem or ploem");
        XylemorPloem.xylemorploem(1212);
    }
}