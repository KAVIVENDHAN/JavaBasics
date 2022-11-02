package basic.methods.method;

class Palindrome {
    public static void reversedigit() {
        int num = 12321;
        int reverse = 0;
        int alaternate = num;
        while (num > 0) {
            int last = num % 10;
            num = num / 10;
            reverse = reverse * 10 + last;
            System.out.println(reverse);
        }
        System.out.println("this is result:" + reverse);
        if (alaternate == reverse) {
            System.out.println("palindrome");
        } else {
            System.out.println("not palindrome");
        }
    }

    public static void main(String[] args) {
        reversedigit();
    }
}