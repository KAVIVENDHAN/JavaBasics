package basic.controlflowstatement.loopstatement.forloop;

class FactorialNonMemoryLeak {
    public static void main(String[] args) {
        int in = 5;
        if (in > 0) {
            System.out.print("Factorial of " + in + " = ");
        }
        for (int i = 1, res = i; i <= in; ++i) {
            if (i + 1 > in) {
                System.out.print(i + " =");
            } else {
                System.out.print(i + "*");
            }
            res = res * i;
            if (i + 1 > in) {
                System.out.println(" " + res);
            }
        }
    }
}