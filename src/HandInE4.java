import java.util.Arrays;

public class HandInE4 {
    public static void main(String[] args) {
        System.out.println(Arrays.toString(powerOfTwo(new int[]{1, 5, 7, 2, 4, 6})));
        System.out.println(Arrays.toString(powerOfTwo(new int[]{23, 56, 22, 11, 65, 89, 3, 44, 87, 910, 45, 35, 98})));

    }

    public static int[] powerOfTwo(int[] input) {
        int[] returnArray = {input[0], input[1], input[2], (int) Math.pow(2, (int) Math.round((Math.log(input[0] + input[1] + input[2]) / Math.log(2))))};

        for (int i = 0; i < input.length - 1; i++) {
            for (int j = i + 1; j < input.length - 1; j++) {
                for (int h = j + 1; h < input.length - 1; h++) {
                    int checkValue = input[i] + input[j] + input[h];
                    int closestPow = (int) Math.round((Math.log(checkValue) / Math.log(2)));

                    int[] tempArray = {input[i], input[j], input[h], (int) Math.pow(2, closestPow)};

                    int diffRet = Math.abs((returnArray[0] + returnArray[1] + returnArray[2]) - returnArray[3]);
                    int diffTempt = Math.abs((tempArray[0] + tempArray[1] + tempArray[2]) - tempArray[3]);

                    if (diffRet <= diffTempt) {
                        continue;
                    }

                    returnArray = tempArray;
                }
            }
        }

        return returnArray;
    }
}
