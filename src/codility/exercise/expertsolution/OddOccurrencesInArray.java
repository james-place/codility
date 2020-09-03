package codility.exercise.expertsolution;

public class OddOccurrencesInArray {
    public static void main(String[] args) {
        OddOccurrencesInArray o = new OddOccurrencesInArray();
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
        System.out.println(o.solution(new int[]{9, 3, 9, 3, 9, 7, 9}));
    }

    public int solution(int[] A) {
        // special case
        if (A.length == 0)
            return 0;

        int unpaired;
        unpaired = A[0]; // initial

        for (int i = 1; i < A.length; i++) {
            unpaired = unpaired ^ A[i]; // xor
        }
        return unpaired; // return the unpaired value
    }
}
