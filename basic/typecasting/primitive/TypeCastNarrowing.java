package basic.typecasting.primitive;

import java.util.Arrays;

class TypeCastNarrowing {
    public static void main(String[] args) {
//        Type Casting Narrowing
        byte a;
        int b = 20;
        a = (byte) b;
        char ch = 'a';
        System.out.println(ch++);
        System.out.println("a = " + a);
        double c = 12.3f;

    }

}