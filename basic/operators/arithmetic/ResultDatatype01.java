package basic.operators.arithmetic;

class ResultDatatype01 {
    public static void main(String[] args) {
//        If the range of operand data type is lower than int then result should be stored in int(ex:byte,short,char )
        byte a = 10, b = 10;
        int a1 = a + b;
        System.out.println(a1);

        short c = 7, d = 30;
        int c1 = c + d;
        System.out.println(c1);

        int e = 7, f = 11;
        int e1 = e + f;
        System.out.println(e1);

        long g = 7, h = 22;
        long g1 = g + h;
        System.out.println(g1);

        float i = 7, j = 33;
        float i1 = i + j;
        System.out.println(i1);

        double k = 7, l = 23;
        double k1 = k + l;
        System.out.println(k1);

        char m = 7, n = 21;
        int m1 = m + n;
        System.out.println(m1);

        boolean o = true, p = false;
        boolean o1 = o & p;
        System.out.println(o1);


    }

}