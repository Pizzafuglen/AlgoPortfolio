import java.util.Arrays;

public class PF1 {
    public static int unEvenRecursive(int input) {
        if (input < 0) return 0;
        if (input % 2 != 0) {
            return unEvenRecursive(input - 1) + input * input;
        }
        return unEvenRecursive(input - 1);
    }

    public static int myMethod2(int N) {
        int x = 0;
        int y = 0;
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                for (int k = 0; k < N * Math.sqrt(N); k++) {
                    x++;
                }
                j *= 2;
            }
            i += i;
        }
        for (int i = 0; i < N * N; i++)
            y++;
        return x + y;
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

    static int myMethod5(int N) {
        int x = 0;

        for (int i = 1; i <= Math.sqrt(N); i++) {
            for (int j = 1; j <= N; j++) {
                for (int k = 1; k < N; k *= 2) {
                    x++;
                }
            }
        }
        return x;
    }

    static int sumDivisibleByThree(int N) {
        if (N < 0) return 0;
        if (N % 3 == 0) {
            return sumDivisibleByThree(N - 1) + N;
        }
        return sumDivisibleByThree(N - 1);
    }
    static void powerScanner(int z) {
        if (z >= 100000) {
            System.out.println("False value");
        } else {
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
    public static long myMethod9(int n) {
        if (n <= 1) {
            return 1;
        } else {
            return myMethod9(n - 1) + myMethod9(n - 2);
        }
    }

    static int logTo(int n) {
        if (n != 2) {
            return 1 + logTo(n / 2);
        }
        return 1;
    }
    static int vote(int[] table) {
        int[] fr = new int[table.length];
        for (int i = 0; i < table.length; i++) {
            int count = 1;
            for (int j = i + 1; j < table.length; j++) {
                if (table[i] == table[j]) {
                    count++;
                    fr[j] = -1;
                }
            }
            if (fr[i] != -1) {
                fr[i] = count;
                if (count >=table.length/2) {
                    return table[i];
                }
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        System.out.println("------------------------- Exercise 1 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int some_input1 = 8;//Fill in your input

        System.out.println("Input is: \n" + some_input1); //Print the input
        int some_result1 = unEvenRecursive(some_input1);
        System.out.println("Result is:  \n" + some_result1); //Print the result
        System.out.println("---- Test 2 ----\n");
        int some_input12 = 9;//Fill in your input

        System.out.println("Input is: \n" + some_input12); //Print the input
        int some_result12 = unEvenRecursive(some_input12);
        System.out.println("Result is:  \n" + some_result12); //Print the result

        System.out.println("------------------------- Exercise 2 -------------------------\n");
        System.out.println("---- Test 1 ----\n");

        System.out.println("Givet at de to første for-løkker har en kompleksitet på O(Log(N)), hvilket betyder at vi halverer problemet, og at den sidste for-løkke er lig O(N^1+1/2) får vi => O(Log(N)*Log(N)*N^1+1/2)\n" +
                "Med udgangspunktet i at den sidste for-løkke har kompleksiteten O(N^2), kan vi skære den fra fordi den har det laveste kompleksitet, og fordi den ligger uden for root loopet");

        System.out.println("------------------------- Exercise 3 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        String some_input3 = "82842605";//Fill in your input

        System.out.println("Input is: \n" + some_input3); //Print the input
        boolean some_result3 = additive(some_input3);
        System.out.println("Result is:  \n" + some_result3); //Print the result

        System.out.println("---- Test 2 ----\n");
        String some_input32 = "459";//Fill in your input

        System.out.println("Input is: \n" + some_input32); //Print the input
        boolean some_result32 = additive(some_input32);
        System.out.println("Result is:  \n" + some_result32); //Print the result

        System.out.println("------------------------- Exercise 4 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int[] some_input4 = {23, 56, 22, 11, 65, 89, 3, 44, 87, 910, 45, 35, 98};//Fill in your input

        System.out.println("Input is: \n" + Arrays.toString(some_input4)); //Print the input
        int[] some_result4 = powerOfTwo(some_input4);
        System.out.println("Result is:  \n" + Arrays.toString(some_result4)); //Print the result

        System.out.println("---- Test 2 ----\n");
        int[] some_input42 = {512, 0, 0, 89, 3, 35};//Fill in your input

        System.out.println("Input is: \n" + Arrays.toString(some_input42)); //Print the input
        int[] some_result42 = powerOfTwo(some_input42);
        System.out.println("Result is:  \n" + Arrays.toString(some_result42)); //Print the result

        System.out.println("Big-O notationen af algoritmen er O(n^3), da der bliver eksekveret 3 nestede for-løkker");

        System.out.println("------------------------- Exercise 5 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int some_input5 = 10;//Fill in your input

        System.out.println("Input is: \n" + some_input5); //Print the input
        int some_result5 = myMethod5(some_input5);
        System.out.println("Result is:  \n" + some_result5); //Print the result
        System.out.println("Den første for-løkke har en kompleksitet på O(N^1/2)\n" +
                "For-løkke nr. 2 er lig med O(N)\n" +
                "For-løkke nr. 3 er lig med O(Log(N))\n" +
                "Multipliceret sammen giver det O(Log(N)*N*N^1/2)");

        System.out.println("------------------------- Exercise 6 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int some_input6 = 12;//Fill in your input

        System.out.println("Input is: \n" + some_input6); //Print the input
        int some_result6 = sumDivisibleByThree(some_input6);
        System.out.println("Result is:  \n" + some_result6); //Print the result

        System.out.println("---- Test 2 ----\n");
        int some_input62 = 15;//Fill in your input

        System.out.println("Input is: \n" + some_input62); //Print the input
        int some_result62 = sumDivisibleByThree(some_input62);
        System.out.println("Result is:  \n" + some_result62); //Print the result

        System.out.println("------------------------- Exercise 7 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int some_input7 = 6561;//Fill in your input

        System.out.println("Input is: \n" + some_input7); //Print the input

        System.out.println("Result is:"); //Print the result
        powerScanner(some_input7);

        System.out.println("---- Test 2 ----\n");
        int some_input72 = 100000;//Fill in your input

        System.out.println("Input is: \n" + some_input72); //Print the input

        System.out.println("Result is:"); //Print the result
        powerScanner(some_input72);

        System.out.println("------------------------- Exercise 8 -------------------------\n");
        System.out.println("---- Test 1 ----\n");

        System.out.println("0 = H\n" +
                "1 =\n" +
                "2 = V\n" +
                "3 = R\n" +
                "4 = \n" +
                "5 = \n" +
                "6 = P\n" +
                "7 = Q\n" +
                "8 = E\n" +
                "9 = C\n" +
                "10 = F\n" +
                "\n" +
                "\n" +
                "Q = 7 x\n" +
                "C = 8 x\n" +
                "H = 2 x\n" +
                "\n" +
                "Vi starter med at tage udgangspunkt i Q der hasher til 7. Den bliver sat på position 7.\n" +
                "Dernæst tager vi C der hasher til 8. Den er fyldt, derfor rykker vi den til 8 + (1*1) = 9.\n" +
                "Til sidst tager vi H der hasher til 2. Den er fyldt derfor rykker vi videre til 2 + (1*1) = 3. Den er fyldt så vi rykker den til 2 + (2 * 2) = 6. Den er fyldt så vi rykker den til 2 + (3 * 3) = 11 hvilket giver den index 0"
        ); //Print the result

        System.out.println("------------------------- Exercise 9 -------------------------\n");

        System.out.println("---- Test 1 ----\n");
        int some_input9 = 1;//Fill in your input

        System.out.println("Input is: \n" + some_input9); //Print the input
        long some_output9 = myMethod9(some_input9);
        System.out.println("Result is: \n" + some_output9); //Print the result
        System.out.println("---- Test 2 ----\n");
        int some_input91 = 10;//Fill in your input

        System.out.println("Input is: \n" + some_input91); //Print the input
        long some_output92 = myMethod9(some_input91);
        System.out.println("Result is: \n" + some_output92); //Print the result

        System.out.println("Vi kan se det er en fibonacci algoritme vi har med at gøre, da alle tallene der kommer ud er fibonacci tal. Det betyder at det kommer til at være en EKSPONENTIEL funktion => O(2^n).\n" +
                "Vi kan demonstrere dette ved at tegne et træ over de rekursive kald der forekommer:\n" +
                "\t\t\tKald 1\n" +
                "\n" +
                "\t\tKald 2\t\tKald 2\n" +
                "\n" +
                "Kald 3\t\tKald 3\t\tKald 3\t\tKald 3\n" +
                "\n" +
                "I sidste ende betyder det at tiden det tager at gennemføre (tidskompleksiteten af) algoritmen stiger eksponentielt, i takt med at man tilfører en større n-værdi.\n" +
                "\n" +
                "I det tilfælde at man tilføjede endnu et selvkald, ville den være O(3^n).\n" +
                "\t\t\t\t\t\tKald 1\n" +
                "\n" +
                "\t\t\t\tKald 2\t\tKald 2\t\tKald 2\n" +
                "\n" +
                "Kald 3\t\tKald 3\t\tKald 3\t\tKald 3\t\tKald 3\t\tKald 3");

        System.out.println("------------------------- Exercise 10 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int some_input10 = 32;//Fill in your input

        System.out.println("Input is: \n" + some_input10); //Print the input
        int some_result10 = logTo(some_input10);
        System.out.println("Result is:  \n" + some_result10); //Print the result

        System.out.println("------------------------- Exercise 11 -------------------------\n");
        System.out.println("---- Test 1 ----\n");
        int[] some_input11 = {1,1,1,1,1,1,6,1,2,3,4,5};//Fill in your input

        System.out.println("Input is: \n" + Arrays.toString(some_input11)); //Print the input
        int some_result11 = vote(some_input11);
        System.out.println("Result is:  \n" + some_result11); //Print the result

        System.out.println("---- Test 2 ----\n");
        int[] some_input112 = {1,2,3,4,5,6,7,2,3,4,5};//Fill in your input

        System.out.println("Input is: \n" + Arrays.toString(some_input112)); //Print the input
        int some_result112 = vote(some_input112);
        System.out.println("Result is:  \n" + some_result112); //Print the result

        System.out.println("Big-O notationen af algoritmen er O(n^2) da jeg har inkluderet 2 nestede for-løkker");
    }
}
