public class HandInE5 {
    public static void main(String[] args) {
        System.out.println(myMethod(10));
    }
    static int myMethod(int N) {
        int x = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) { // Log(N)
            for (int j = 1; j <= N; j++) { // N
                for (int k = 1; k < N; k *= 2) { // N/2
                    x++;
                    System.out.println(x);
                }
            }
        }
        return x;
    }

    // Log(N)*N
}
