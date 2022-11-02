package basic.static_members;

class Static01 {
    static String name = "Eswara";

    static {
        name = "Eswara Initializer";  //local variable
//        System.out.println(Static01.a);    Not possible
    }
//    String name = "Eswara"; Not possible

    int a = 20;

    public static void do1() {
        String name = "Eswara method";  //Local Variable
    }

    public static void main(String[] args) {
        String name = "Eswara main method";
        System.out.println(name);
        System.out.println(Static01.name);
        System.out.println(B.name);
        B.change();
        System.out.println(B.name);
        System.out.println(name);
        System.out.println(Static01.name);
    }

    void done() {
        name = "done";
    }
}