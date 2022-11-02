package basic.operators.condition;

class Condition {
    public static void main(String[] args) {
        //Condition or ternary operator

        int n = 17;
        String res = n % 2 == 0 ? "Even" : "Odd";
        System.out.println("It is " + res);

        int n1 = -1;
        String res1 = n < 0 ? "Negative" : "positive";
        System.out.println("n1 is " + res1);

        int a = 10, b = 20;
        String res3 = a < b ? "B is Greater" : "A is Greater";
        System.out.println(res3);
    }
}