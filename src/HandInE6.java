public class HandInE6 {
    public static void main(String[] args) {
        System.out.println(sumDivisibleByThree(9));
        System.out.println(3+6+9);
    }

    static int sumDivisibleByThree(int N) {
        if (N < 0) return 0;
        if (N % 3 == 0) {
            return sumDivisibleByThree(N - 1) + N;
        }
        return sumDivisibleByThree(N - 1);
    }
}
