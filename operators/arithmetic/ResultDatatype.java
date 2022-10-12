package basic.operators.arithmetic;

class ResultDatatype {
    public static void main(String[] args) {
//        If the range of any one operand is higher among them, then the result should be stored in its data type variable.

        long a = 7;
        int b = 3;
        long a1 = a / b;
        long a2 = a % b;
        System.out.println(a1 + " " + a2);

        short c = 6;
        long d = 5;
        long c1 = c / d;
        long c2 = c % d;
        System.out.println(c1 + " " + c2);

        long e = 55;
        long f = 33;
        long f1 = e / f;
        long f2 = e % f;
        System.out.println(f1 + " " + f2);


    }

}