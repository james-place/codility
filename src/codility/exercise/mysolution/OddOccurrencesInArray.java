package codility.exercise.mysolution;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public int solution(int[] A) {
        long startTime = System.currentTimeMillis();
        // special case
        if (A.length == 0)
            return 0;

        int unpaired = 0;
        Arrays.sort(A);
        for (int i = 0; i < A.length; i = i + 2) {
            if (i + 1 == A.length || A[i] != A[i + 1]) {
                unpaired = A[i];
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - startTime);
        return unpaired; // return the unpaired value
    }
}
