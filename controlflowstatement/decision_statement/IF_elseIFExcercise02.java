package basic.controlflowstatement.decision_statement;

class IF_elseIFExcercise02 { //Greatest number of three numbers
    public static void main(String[] args) {
        int a = 10, b = 5, c = 2, d = 2, e = -5;
        if (a < b && a < c && a < d && a < e) {
            System.out.println(a + " is smallest number among them");
        } else if (b < c && b < d && b < e) {
            System.out.println(b + " is smallest number among them");
        } else if (c < d && c < e) {
            System.out.println(c + " is smallest number among them");
        } else if (d < e) {
            System.out.println(d + " is smallest number among them");
        } else {
            System.out.println(e + " is smallest number among them");
        }
    }
}