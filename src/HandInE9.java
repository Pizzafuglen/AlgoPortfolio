public class HandInE9 {
    public static void main(String[] args) {
        for (int i = 1; i <= 20; i++) {
            System.out.println("Med input værdien " + i + " får man retur værdien " + myMethod(i));
            System.out.println(myMethod(i) - myMethod(i - 1));

        }
        /*
        Vi kan se det er en fibonacci algoritme vi har med at gøre.
        Det betyder at det kommer til at være en EKSPONENTIEL function => O(2^n)

        Vi ved at T(n-1) = O(2^n-1) => O(2^1-1) => O(2^0) => O(1)

        T(n) = T(n-1) + T(n-2) + T(n-a) + O(1)

        Hvilket er det samme som T(n) = O(2^n-1) + O(2^n-2) + O(a^n-a) + O(1) = O(2^n)

        I sidste ende betyder det at tiden det tager at gennemføre (tidskompleksiteten af) algoritmen stiger eksponentielt, i takt med at man tilfører en større n-værdi.
         */
    }

    public static long myMethod(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return myMethod(n - 1) + myMethod(n - 2);
        }
    }
}
