package lesson3.hw3;

import java.util.Objects;

public class ArrayUtils {
    public static void main(String[] args) {

        Integer[] array1 = new Integer[]{50, 400, 250, 300, 100, 200, 350, 450, 51, 432, 267, 345, 98, 299, 312, 498, 52, 423, 278, 334, 109, 288, 321, 487};
        Integer[] array2 = new Integer[]{50, 400, 250, 300, 100, 200, 350, 450, 51, 432, 267, 345, 98, 299, 312, 498, 52, 423, 278, 334, 109, 288, 321, 487};
        Integer[] array3 = new Integer[]{50, 400, 250, 300, 100, 200, 3, 450, 51, 432, 267, 3, 98, 299, 312, 498, 52, 4, 278, 334, 109, 288, 321, 487};
        System.out.println(compareArrays(array1, array2));//true
        System.out.println(compareArrays(array2, array3));//false
        System.out.println();


        String[] array4 = new String[]{"kdfs", "dskf", "qwe", "daa", "qq", "qw"};
        String[] array5 = new String[]{"kdfs", "dskf", "qwe", "daa", "qq", "qw"};
        String[] array6 = new String[]{"kdfs", "dskf", "qwe", "daa", "qq", "ee"};
        System.out.println(compareArrays(array4, array5));//true
        System.out.println(compareArrays(array5, array6));//false


        String[] array7 = new String[]{"kdfs", "dskf", "qwe", "daa", "qq", "ee"};
        Integer[] array8 = new Integer[]{50, 100, 150, 200, 250, 300};
        System.out.println();
        System.out.println(compareArrays(array7, array8));//false


    }

    public static <E> boolean compareArrays(E[] arrayA, E[] arrayB) {

        if (arrayA.length != arrayB.length) {
            return false;
        }
        for (int i = 0; i < arrayA.length; ++i) {
            if (!Objects.equals(arrayA[i], arrayB[i])) {
                return false;
            }
        }
        return true;
    }
}
