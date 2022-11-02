package basic.controlflowstatement.decision_statement.switch_;

class Calculator {
    public static void main(String[] args) {
        int a = 10, b = 20;
        char option = '-';
        switch (option) {
            case '+': {
                System.out.println("A+B=" + (a + b));
                break;
            }
            case '-': {
                System.out.println("A-B=" + (a - b));
                break;
            }
            case '*': {
                System.out.println("A*B=" + (a * b));
                break;
            }
            case '/': {
                System.out.println("A/B=" + (a / b));
                break;
            }
            case '%': {
                System.out.println("A%B=" + (a % b));
                break;
            }
        }
    }
}