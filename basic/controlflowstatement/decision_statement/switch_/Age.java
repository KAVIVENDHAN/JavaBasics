package basic.controlflowstatement.decision_statement.switch_;

class Age {
    public static void main(String[] args) {
        int age = 18;
        switch (age) {
            case 18: {
                System.out.println("You are 18");
                break;
            }
            case 21: {
                System.out.println("you are 21");
                break;
            }
            default:
                System.out.println("you are something else");


        }
    }
}