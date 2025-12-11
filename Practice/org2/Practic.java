package org2;

import java.util.Arrays;

public class Practic {
    public static void main(String[] args) {
        int[] a = {2,3,4,5};
        int[] b = a.clone();
        System.out.println(a.equals(b));//false
        System.out.println(Arrays.equals(a,b));//True

        System.out.println(Arrays.toString(a));//[2, 3, 4, 5]

        System.out.println(Arrays.toString(b));//[2, 3, 4, 5]

    }
}
