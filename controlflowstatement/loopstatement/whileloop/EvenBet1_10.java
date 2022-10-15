package basic.controlflowstatement.loopstatement.whileloop;

class EvenBet1_10 {
    public static void main(String[] args) {
        int i = 1;
        System.out.println("Even Number between 1 and 10 is:  ");
        while (i <= 10) {
            if (i % 2 == 0) {
                System.out.print(i + ", ");
            }
            i++;
        }
    }
}