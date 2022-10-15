package basic.controlflowstatement.decision_statement.switch_;

class Vowels {
    public static void main(String[] args) {
        char ch = 'a';
        switch (ch) {
            case 'a':
            case 'A':
            case 'e':
            case 'E':
            case 'o':
            case 'i':
            case 'U':
            case 'I':
            case 'u':
            case 'O': {
                System.out.println(ch + " is vowel");
                break;
            }
            default: {
                System.out.println(" It is not vowel");
            }
        }
    }
}