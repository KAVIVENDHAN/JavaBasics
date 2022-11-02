package SmallProjects.userdetails;

import java.util.Scanner;

class User {
    static String name;
    static String address;
    static byte age;
    static Scanner sc;
    static boolean i = true;

    static void get_user_data() {
        sc = new Scanner(System.in);
        System.out.print("Enter your name:");
        name = sc.nextLine();
        System.out.print("Enter your address:");
        address = sc.nextLine();
        System.out.print("Enter your age:");
        age = sc.nextByte();
        sc.close();
        String age1 = Byte.toString(age);
        System.out.println(age1.getClass().getSimpleName());
        System.out.println("HI " + name + " from " + address + " and your age is " + age);
        i = false;

    }

    public static void main(String arg[]) {

        while (i == true) {
            try {
                get_user_data();
            } catch (Exception e) {
                System.out.println(e + " Enter without error");
            }
        }


    }
}
		