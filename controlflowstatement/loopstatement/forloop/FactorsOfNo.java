package basic.controlflowstatement.loopstatement.forloop;

class FactorsOfNo {
    public static void main(String[] args) {
        int fact = 14;
        System.out.print("Factors of entered number is:");
        for (int i = 1; i <= 10; i++) {
            if (fact % i == 0) {
                System.out.println(i + ", ");
            }
        }
    }
}