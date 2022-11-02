package SmallProjects.Menu;

import java.util.Scanner;

class Menu01 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int in = 0;
        while (in != 5) {
            System.out.println("1.Buy");
            System.out.println("2.Sell");
            System.out.println("3.Update");
            System.out.println("4.Status");
            System.out.println("5.Exit");
            System.out.print("Enter option:");
            in = sc.nextInt();
            switch (in) {
                case 1: {
                    System.out.println("Have Enteres Buy Option");
                    break;
                }
                case 2: {
                    System.out.println("Have Sell Buy Option");
                    break;
                }
                case 3: {
                    System.out.println("Have Update Buy Option");
                    break;
                }
                case 4: {
                    System.out.println("Have Status Buy Option");
                    break;
                }
                default: {
                    System.out.println("You have entered wrong option");
                }

            }


        }
    }
}