package basic.controlflowstatement.loopstatement.forloop;

class SumOfNum {
    public static void main(String[] args) {

        for (int i = 1, a = 0; i < 10; i++) {
            a = a + i;
            if (i + 1 >= 10) {
                System.out.println("Sum of num 1 to 10:" + a);
            }
        }

    }
}