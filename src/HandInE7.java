import java.util.Arrays;

public class HandInE7 {
    public static void main(String[] args) {
        powerScanner(125);
    }

    static void powerScanner(int z) {
        if (z >= 100000) System.out.println("False value");

        int x = 0;
        int y = 0;

        int[] temp = new int[]{x, y};

        for (int i = 3; i < 100000; i++) {
            x = i;
            for (int j = 3; j < 10; j++) {
                y = j;
                if (Math.pow(x, y) == z) {
                    temp[0] = x;
                    temp[1] = y;
                    System.out.println(Arrays.toString(temp));
                }
            }
        }
        if (temp[0] == 0) System.out.println("False value");
    }
}
