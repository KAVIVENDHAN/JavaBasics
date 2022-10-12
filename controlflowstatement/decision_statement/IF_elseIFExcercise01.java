package basic.controlflowstatement.decision_statement;

class IF_elseIFExcercise { //Greatest number of three numbers
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2;
        if (a > b && a > c) {
            System.out.println(a + " is greatest number among them");
        } else if (b > c) {
            System.out.println(b + " is greatest number among them");
        } else {
            System.out.println(c + " is greatest number among them");
        }
    }
}