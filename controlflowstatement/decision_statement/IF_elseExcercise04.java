package basic.controlflowstatement.decision_statement;

class IF_elseExcercise04 {      //Find vowels
    public static void main(String[] args) {
        char ch = 'a';
        if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' || ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
            System.out.println("Vowel");
        } else {
            System.out.println("Not vowels");
        }
    }
}