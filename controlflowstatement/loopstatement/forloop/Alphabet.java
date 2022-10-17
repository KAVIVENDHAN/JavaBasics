package basic.controlflowstatement.loopstatement.forloop;

class Alphabet {
    public static void main(String[] args) {
        char ch = 'a';
        System.out.print(ch);
        for (int i = 1; i < 10; i++) {
            System.out.print((char) (ch + i));
        }
    }
}