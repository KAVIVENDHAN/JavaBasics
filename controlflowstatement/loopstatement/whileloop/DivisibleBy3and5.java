package basic.controlflowstatement.loopstatement.whileloop;

class DivisibleBy3and5 {
    public static void main(String[] args) {
        int i = 17;
        System.out.println("Numbers that are divisible by 11");
        while (i <= 15) {
            if (i % 3 == 0 && i % 5 == 0) {
                if (i > 15) {
                    System.out.println("i");
                }
            }
            i++;
        }
    }
}