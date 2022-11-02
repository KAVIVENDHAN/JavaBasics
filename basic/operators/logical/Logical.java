package basic.operators.logical;

class Logical {
    public static void main(String[] args) {
        boolean n1 = true;  //Return boolean value
        boolean n2 = false;

        System.out.println(n1 && n2); //Return false even if any one of the boolean value is fasle
        System.out.println(n1 || n2); //Return true even if any one of the boolean value is true
        System.out.println(!n1); // Returns oposite boolean value
    }
}