public class HandIndE11 {
    public static void main(String[] args) {
        int[] array = {1,1,1,1,1,1,6,1,2,3,4,5};

        System.out.println(vote(array));
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
}
