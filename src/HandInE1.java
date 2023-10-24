public class HandInE1 {
    public static void main(String[] args) {
        System.out.println(unEvenRecursive(3));
    }

    public static int unEvenRecursive(int input) {
        if (input < 0) return 0;
        if (input % 2 != 0) {
            return unEvenRecursive(input - 1) + input * input;
        }
        return unEvenRecursive(input - 1);
    }
}
