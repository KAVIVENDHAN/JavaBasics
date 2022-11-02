package basic.typecasting.primitive;

class TypeCastWidening {

    public static void main(String[] args) {
//    widening type casting
        long a = 10;
        short b = 20;
        byte c = 20;
        char d = ' ';

        double e = a;
        int f = b;
        long g = c;
        int h = d;

        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);

        double i = 1.2f;
        System.out.println(i);
    }
}