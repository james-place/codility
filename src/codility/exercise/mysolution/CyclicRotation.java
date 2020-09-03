package codility.exercise.mysolution;

import java.util.Arrays;

public class CyclicRotation {
    public static void main(String[] args) {
        CyclicRotation cyclicRotation = new CyclicRotation();
        final int[] a = {3, 8, 9, 7, 6};
        final int[] b = {};
        final int[] c = {-999, -215, -70, 0, 10, 555, 812};
        rotate(cyclicRotation, a);
        rotate(cyclicRotation, b);
        rotate(cyclicRotation, c);
    }

    private static void rotate(CyclicRotation cyclicRotation, int[] c) {
        for (int i = 0; i <= 100; i++) {
            System.out.print(Arrays.toString(c));
            System.out.print(" Rotated by " + i + " is ");
            System.out.println(Arrays.toString(cyclicRotation.solution(c, i)));
        }
    }

    public int[] solution(int[] A, int K) {
        int rotations = K;
        int[] result = new int[A.length];
        if (A.length == 0 || A.length == K || (K % A.length == 0)) {
            rotations = 0;
        } else if (A.length > K) {
            rotations = K;
        } else {
            rotations = K % A.length;
        }

        for (int i = A.length - 1, j = (rotations - 1); i >= (A.length - rotations); i--, j--) {
            result[j] = A[i];
        }
        for (int i = 0, j = rotations; i < (A.length - rotations); i++, j++) {
            result[j] = A[i];
        }
        return result;
    }
}
