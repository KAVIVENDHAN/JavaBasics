package basic.methods.method;

class Lastdigit {
    public static void reversedigit() {
        int num = 123;
        int result = 0;
        while (num > 0) {
            int last = num % 10;
            num = num / 10;
            System.out.print(last);
        }
    }

    public static void main(String[] args) {
        reversedigit();
    }
}