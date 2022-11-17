package lesson3.referenses;

import java.util.Arrays;

public class Referenses {
    public static void main(String[] args) {
        int x = 5;
        int y = x;

        x = x + 1;

        System.out.println(x);
        System.out.println(y);

        // Array - массивы
        int[] apples = new int[3];
        // [] [] [] [] []
        apples[0] = 7;
        apples[1] = 5;
        apples[2] = 3;

        int[] apples2 = apples;
        apples[0] = 10;
        System.out.println(Arrays.toString(apples));
        System.out.println(Arrays.toString(apples2));



    }
}
