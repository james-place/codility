package codility.exercise.mysolution;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class PermMissingElem {
    public static void main(String[] args) {
        PermMissingElem missingElem = new PermMissingElem();
        System.out.println(missingElem.solution(new int[]{2, 3, 1, 5}));
        System.out.println(missingElem.solution(new int[]{2, 3, 4, 5}));
        System.out.println(missingElem.solution(new int[]{2, 3, 4, 5}));
        System.out.println(missingElem.solution(new int[]{1}));
        System.out.println(missingElem.solution(new int[]{}));
    }

    public int solution(int[] A) {
        Arrays.sort(A);
        if (A.length == 0) {
            return 1;
        }
        for (int i = 0; i < A.length; i++) {
            if (i + 1 != A[i]) {
                return i + 1;
            }
        }
        return A.length + 1;
    }

    public int solution2(int[] A) {
        // write your code in Java SE 8

        //special case
        if (A.length == 0) {
            return 1;
        }

        // Using "set" to check if an element has appeared
        // note: need to "import java.util.*" (important)
        Set<Integer> set = new HashSet<Integer>();

        // add elements into the set
        for (int i = 0; i < A.length; i++) {
            set.add(A[i]);
        }

        // note: the missing number is not possible bigger than (A.length)
        //       because there are only (A.length) numbers
        for (int i = 1; i <= A.length; i++) {
            if (set.contains(i) != true) // the 1st missing element
                return i;
        }

        // means: there are no missing numbers from 1 to A.length
        // Therefore, the missing number is "A.length+1" (important)
        return A.length + 1;
    }
}
