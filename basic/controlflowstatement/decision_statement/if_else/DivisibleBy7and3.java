package basic.controlflowstatement.decision_statement.if_else;

class DivisibleBy7and3 {
    public static void main(String[] args) {
        int a = 15;
        if (a % 3 == 0 && a % 5 == 0) {
            System.out.println("divible by 3 & 5 is done");
        } else {
            System.out.println("Divisible by both number is not possible");
        }
    }
}