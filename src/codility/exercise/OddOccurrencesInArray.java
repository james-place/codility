package codility.exercise;

import java.util.Arrays;

public class OddOccurrencesInArray {
    public int solutionXOR(int[] A) {
        long startTime = System.currentTimeMillis();
        // special case
        if(A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0]; // initial

        for(int i=1; i< A.length; i++){
            unpaired = unpaired ^ A[i]; // xor
        }
        System.out.println(System.currentTimeMillis() - startTime);
        return unpaired; // return the unpaired value
    }
    public int solution(int[] A) {
        long startTime = System.currentTimeMillis();
        // special case
        if(A.length == 0)
            return 0;

        int unpaired = 0;
        Arrays.sort(A);
        for (int i=0; i<A.length ; i = i+2) {
            if (i+1 == A.length || A[i] != A[i+1]) {
                unpaired = A[i];
                break;
            }
        }
        System.out.println(System.currentTimeMillis() - startTime);
        return unpaired; // return the unpaired value
    }


    public static void main (String[] args) {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        System.out.println(o.solutionXOR(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solutionXOR(new int[]{1, 3, 3, 9, 9, 7, 7, 9, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solutionXOR(new int[]{1, 7, 9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }
}
