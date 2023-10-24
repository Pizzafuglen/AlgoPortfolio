public class HandInE10 {
    public static void main(String[] args) {
        int logValRework = logToRework(32);
        int logVal = logTo(32);

        System.out.println("2 to the power of " + logVal + " is equal to " + (int)Math.pow(2, logVal));
        System.out.println("2 to the power of " + logValRework + " is equal to " + (int)Math.pow(2, logValRework));
    }
    static int logTo(int n) {
        if ((((Math.log(n) / Math.log(2)))*2)%2 == 0){
            return (int)(Math.log(n) / Math.log(2));
        }
        return -1;
    }
    static int logToRework(int n) {
        if (n != 2) {
            return 1 + logToRework(n / 2);
        }
        return 1;
    }
}
