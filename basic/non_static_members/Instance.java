package basic.non_static_members;

class Instance {
    int a = 20;

    public static void main(String[] args) {
        int a = 10;
        System.out.println(a);
        System.out.println(new Instance().a);
        new Instance().go1();
    }

    void go1() {
        System.out.println(a);
    }
}