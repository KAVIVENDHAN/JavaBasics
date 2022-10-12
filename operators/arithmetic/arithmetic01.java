package basic.operators.arithmetic;

class arithmetic01 {
    public static void main(String[] args) {
        int a = 101;
        int b = 20;
        int c = a + b;
        System.out.println("Addition of a and b:" + c);
        c = a - b;
        System.out.println("Subtraction of a and b:" + c);
        c = a * b;
        System.out.println("Mutiplication of a and b:" + c);
        c = a / b;
        System.out.println("Division of a and b:" + c);
        c = a % b;
        System.out.println("Modelus of a and b:" + c);

        System.out.println(a + b - a * b / 2); //It performs operation based on BDMAS rule(Bracket,Division,Multiplication,Addtion,Subtraction)
    }
}