package basic.controlflowstatement.loopstatement.forloop;

class PrimeNo02 {
    public static void main(String[] args) {
        int no = 10;
        for (int l = 1, flag = 0; flag < no; ++l) {

            int checkpoint = 0;
            for (int i = 2; i < l; i++) {
                if (l % i != 0) {
                    checkpoint++;
                }
            }
            if (checkpoint + 2 == l) {
                System.out.println("The Number " + l + " is Prime Number.");
                flag++;
            }
//            else {
//                System.out.println("The Number " + no + " is not Prime Number.");
//            }
        }
    }

}