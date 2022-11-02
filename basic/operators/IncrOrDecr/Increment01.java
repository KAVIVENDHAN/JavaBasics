package basic.operators.IncrOrDecr;

class Increment01 {
    public static void main(String[] args) {
        int a = 70, b = 40;
        System.out.println(a++ + ++b);
        System.out.println(++a + ++b + b);
    }
}