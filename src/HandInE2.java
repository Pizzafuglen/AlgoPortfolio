public class HandInE2 {
    public static void main(String[] args) {
          myMethod(1);
    }
    // Fordi de 3 første for-løkker er inde i hinanden, kommer de til at blive multipliceret sammen = N*N*N^2*Log(N) => N^4*Log(N)
    // Vi har derudover også en lille for-løkke til sidst, der har O(N)-notationen = N*N => N^2
    // Det betyder vi totalt får = N^4*Log(N) + N^2, da den sidste for-løkke står i sekvens med de andre
    public static int myMethod(int N) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) { // N
            for (int j = 0; j < N; j++) { // N
                for (int k = 0; k < N * Math.sqrt(N); k++) { // N^2*Log(N)
                    x++;
                }
                j *= 2;
            }
            i += i;
        }
        for (int i = 0; i < N * N; i++) // N^2
            y++;
        return x + y;
    }
}
