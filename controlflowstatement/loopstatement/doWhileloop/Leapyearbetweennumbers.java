package basic.controlflowstatement.loopstatement.doWhileloop;

class Leapyearbetweennumbers {
    public static void main(String[] args) {
        int i = 2000;
        do {
            if (i % 4 == 0 && i % 100 != 0 || i % 400 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        } while (i <= 3000);
    }
}