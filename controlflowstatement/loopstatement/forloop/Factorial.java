package basic.controlflowstatement.loopstatement.forloop;

class Factorial {
    public static void main(String[] args) {
        int in = 5;
        int res = 1;
        for (int i = 1; i <= in; ++i) {

            res = res * i;
        }
        System.out.println(res);
    }
}