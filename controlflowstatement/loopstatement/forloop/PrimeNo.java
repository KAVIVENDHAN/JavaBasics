package basic.controlflowstatement.loopstatement.forloop;

class PrimeNo {
    public static void main(String[] args) {
        int no = 11;
        int checkpoint = 0;
        for (int i = 2; i < no; i++) {
            if (no % i != 0) {
                checkpoint++;
            }
        }
        if (checkpoint + 2 == no) {
            System.out.println("The Number " + no + " is Prime Number.");
        } else {
            System.out.println("The Number " + no + " is not Prime Number.");
        }
    }
}