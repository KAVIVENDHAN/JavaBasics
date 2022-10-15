package basic.controlflowstatement.decision_statement.switch_;

class Dicegrouping {
    public static void main(String[] args) {
        System.out.println("10");
        int a = 1;
        switch (a) {
            case 1:
            case 6: {
                System.out.println("dance");
                break;
            }
            case 2:
            case 5: {
                System.out.println("sing");
                break;
            }
            case 3:
            case 4: {
                System.out.println("pushup");
                break;
            }


        }
    }
}