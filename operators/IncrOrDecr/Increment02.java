package basic.operators.IncrOrDecr;

class Increment02 {
    public static void main(String[] args) {
        int n1 = 30, n2 = 5, n3 = 25;
        System.out.println(n1++ + ++n2 + n3 + n2++);
        System.out.println(++n3 - n2++ + n3++ + ++n1);
        System.out.println(++n2 == n2++ && n3 > 25);
    }
}