public class HandInE3 {
    public static void main(String[] args) {

    }
    public static boolean additive(String s) {
        if (s == null || s.length() < 3) return false;

        int firstInt = Integer.parseInt(s.substring(0, 1));
        int secondInt = Integer.parseInt(s.substring(1, 2));
        int thirdInt = Integer.parseInt(s.substring(2, 3));

        if (firstInt + secondInt == thirdInt) {
            return true;
        }

        return additive(s.substring(1));
    }
}
