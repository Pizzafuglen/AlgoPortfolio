public class HandInE2 {
    public static void main(String[] args) {
          myMethod(1);
    }
    // Givet at de to første for-løkker er lig Log(N), hvilket betyder at vi halverer problemet, og at den sidste for-løkke er lig N^1+1/2 får vi => Log(N)*Log(N)*N^1+1/2
    // Med udgangspunktet i at den sidste for-løkke har kompleksiteten O(N^2), kan vi skære den fra fordi den har det laveste kompleksitet, og fordi den ligger uden for root loopet
    public static int myMethod(int N) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) { // Log(N)
            for (int j = 0; j < N; j++) { // Log(N)
                for (int k = 0; k < N * Math.sqrt(N); k++) { // N^1+1/2
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
